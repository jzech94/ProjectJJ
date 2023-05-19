package com.projectJJ.quiz;

import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class QuizResponse {

	private long questionId;
	private String question;
	private List<Answers> answers;
	private String correctAnswer;
	private int correctAnswerNum;
	private String explanation;

	public QuizResponse() {

	}

	public QuizResponse(long questionId, String question, List<Answers> answers, String correctAnswer,
			int correctAnswerNum, String explanation) {
		super();
		this.questionId = questionId;
		this.question = question;
		this.answers = answers;
		this.correctAnswer = correctAnswer;
		this.correctAnswerNum = correctAnswerNum;
		this.explanation = explanation;
	}

	public long getQuestionId() {
		return questionId;
	}

	public void setQuestionId(long questionId) {
		this.questionId = questionId;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public List<Answers> getAnswers() {
		return answers;
	}

	public void setAnswers(List<Answers> answers) {
		this.answers = answers;
	}

	public String getCorrectAnswer() {
		return correctAnswer;
	}

	public void setCorrectAnswer(String correctAnswer) {
		this.correctAnswer = correctAnswer;
	}

	public int getCorrectAnswerNum() {
		return correctAnswerNum;
	}

	public void setCorrectAnswerNum(int correctAnswerNum) {
		this.correctAnswerNum = correctAnswerNum;
	}

	public String getExplanation() {
		return explanation;
	}

	public void setExplanation(String explanation) {
		this.explanation = explanation;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((answers == null) ? 0 : answers.hashCode());
		result = prime * result + ((correctAnswer == null) ? 0 : correctAnswer.hashCode());
		result = prime * result + correctAnswerNum;
		result = prime * result + ((explanation == null) ? 0 : explanation.hashCode());
		result = prime * result + ((question == null) ? 0 : question.hashCode());
		result = prime * result + (int) (questionId ^ (questionId >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		QuizResponse other = (QuizResponse) obj;
		if (answers == null) {
			if (other.answers != null)
				return false;
		} else if (!answers.equals(other.answers))
			return false;
		if (correctAnswer == null) {
			if (other.correctAnswer != null)
				return false;
		} else if (!correctAnswer.equals(other.correctAnswer))
			return false;
		if (correctAnswerNum != other.correctAnswerNum)
			return false;
		if (explanation == null) {
			if (other.explanation != null)
				return false;
		} else if (!explanation.equals(other.explanation))
			return false;
		if (question == null) {
			if (other.question != null)
				return false;
		} else if (!question.equals(other.question))
			return false;
		if (questionId != other.questionId)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "QuizResponse [questionId=" + questionId + ", question=" + question + ", answers=" + answers
				+ ", correctAnswer=" + correctAnswer + ", correctAnswerNum=" + correctAnswerNum + ", explanation="
				+ explanation + "]";
	}

}
