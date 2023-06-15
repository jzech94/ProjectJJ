import { Component, ViewChild } from '@angular/core';
import { MatRadioButton } from '@angular/material/radio';
import IQuestion from 'src/app/interfaces/question';
import IUser from 'src/app/interfaces/user';
import { Question } from 'src/app/models/question';
import { LoginService } from 'src/app/services/login.service';
import { QuizService } from 'src/app/services/quiz.service';

@Component({
  selector: 'app-quiz',
  templateUrl: './quiz.component.html',
  styleUrls: ['./quiz.component.css']
})
export class QuizComponent {


  answer: string;
  currentUser: IUser;
  currentQuestion: Question = new Question();
  questions: IQuestion[] = [];
  questionIndex: number = 0;
  questionNumber: number = 1;
  showCorrect: boolean = false;
  correct: number = 0;
  showSubmit: boolean = false;
  percentage: number;
  pass: boolean = false;

  constructor(private loginService: LoginService, private quizService: QuizService) {
    this.loginService.currentUser.subscribe(x => this.currentUser = x);
  }

  ngOnInit() {
    this.quizService.getAllQuestions().subscribe({
      next: (res: IQuestion[]) => {
        this.questions = res;
        this.currentQuestion = this.questions[this.questionIndex];
      },
      error: (err) => { console.log(err); },
      complete: () => { console.log('Get all questions work complete'); }
    });
  }

  next(): void {
    if (this.questionIndex < this.questions.length - 1) {
      this.questionIndex = this.questionIndex + 1;
      this.currentQuestion = this.questions[this.questionIndex];
      this.questionNumber++;
    }
    if (this.questionIndex === this.questions.length - 1) {
      this.showSubmit = true;
    }
  }

  previous(): void {
    if (this.questionIndex > 0) {
      this.questionIndex = this.questionIndex - 1;
      this.currentQuestion = this.questions[this.questionIndex];
      this.questionNumber--;
    }
    if (this.questionIndex < this.questions.length - 1) {
      this.showSubmit = false;
    }
  }

  radioClick(answerSelected: number): void {
    this.currentQuestion.selected = answerSelected;
    this.questions[this.questionIndex].selected = answerSelected;
  }

  submit(): void {
    if (!this.showCorrect) {
      for (let i = 0; i < this.questions.length; i++) {
        if (this.questions[i].correctAnswerNum === this.questions[i].selected) {
          this.correct++;
          this.questions[i].isCorrect=true;
        }
      }
      this.percentage = Math.round(this.correct / this.questions.length * 100);
      this.showCorrect = true;
      if (this.percentage >= 70) {
        this.pass = true;
      }
    }
  }

  gotoQuestion(questionNum:number){
    console.log(questionNum);
    this.questionNumber = questionNum;
    this.currentQuestion = this.questions[questionNum - 1];
    this.questionIndex = questionNum - 1;
    if (this.questionIndex < this.questions.length - 1) {
      this.showSubmit = false;
    }
    if (this.questionIndex === this.questions.length - 1) {
      this.showSubmit = true;
    }
  }

}
