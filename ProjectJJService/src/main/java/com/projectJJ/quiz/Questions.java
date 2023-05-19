package com.projectJJ.quiz;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Questions implements Serializable {

	private static final long serialVersionUID = -4846188067966716304L;

	@Id
	@GeneratedValue
	private long id;
	private String question;
	@Column(length = 1024)
	@OneToMany(targetEntity = Answers.class, cascade = CascadeType.ALL)
	private List<Answers> answers;
	@Column(length = 1024)
	private String correctAnswer;
	private int correctAnswerNum;
	@Column(length = 1024)
	private String explanation;
	private String imageHref;

	public Questions() {

	}

	public Questions(String question, List<Answers> answers, String correctAnswer, int correctAnswerNum,
			String explanation, String imageHref) {
		super();
		this.question = question;
		this.answers = answers;
		this.correctAnswer = correctAnswer;
		this.correctAnswerNum = correctAnswerNum;
		this.explanation = explanation;
		this.imageHref = imageHref;
	}

	public Questions(long id, String question, List<Answers> answers, String correctAnswer, int correctAnswerNum,
			String explanation, String imageHref) {
		super();
		this.id = id;
		this.question = question;
		this.answers = answers;
		this.correctAnswer = correctAnswer;
		this.correctAnswerNum = correctAnswerNum;
		this.explanation = explanation;
		this.imageHref = imageHref;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
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

	public String getImageHref() {
		return imageHref;
	}

	public void setImageHref(String imageHref) {
		this.imageHref = imageHref;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((answers == null) ? 0 : answers.hashCode());
		result = prime * result + ((correctAnswer == null) ? 0 : correctAnswer.hashCode());
		result = prime * result + correctAnswerNum;
		result = prime * result + ((explanation == null) ? 0 : explanation.hashCode());
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result + ((imageHref == null) ? 0 : imageHref.hashCode());
		result = prime * result + ((question == null) ? 0 : question.hashCode());
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
		Questions other = (Questions) obj;
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
		if (id != other.id)
			return false;
		if (imageHref == null) {
			if (other.imageHref != null)
				return false;
		} else if (!imageHref.equals(other.imageHref))
			return false;
		if (question == null) {
			if (other.question != null)
				return false;
		} else if (!question.equals(other.question))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Questions [id=" + id + ", question=" + question + ", answers=" + answers + ", correctAnswer="
				+ correctAnswer + ", correctAnswerNum=" + correctAnswerNum + ", explanation=" + explanation
				+ ", imageHref=" + imageHref + "]";
	}

}
