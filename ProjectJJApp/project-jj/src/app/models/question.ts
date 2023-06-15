import IAnswers from "../interfaces/answers"
import IQuestion from "../interfaces/question"

export class Question implements IQuestion{
    "id" : number
    "question" : string
    "answers" : IAnswers[]
    "correctAnswer" : string
    "correctAnswerNum" : number
    "explanation" : string
    "imageHref": string
    "selected": number
    "isCorrect":boolean = false;
}