package com.projectJJ.quiz;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Answers implements Serializable {

	private static final long serialVersionUID = -3195506341305500659L;
	
	@Id
	@GeneratedValue
	private long id;
	private long questionId;
	@Column(length = 1024)
	private String answers;
	private int answerNum;

	public Answers() {

	}

	public Answers(long questionId, String answers, int answerNum) {
		super();
		this.questionId = questionId;
		this.answers = answers;
		this.answerNum = answerNum;
	}

	public Answers(long id, long questionId, String answers, int answerNum) {
		super();
		this.id = id;
		this.questionId = questionId;
		this.answers = answers;
		this.answerNum = answerNum;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getQuestionId() {
		return questionId;
	}

	public void setQuestionId(long questionId) {
		this.questionId = questionId;
	}

	public String getAnswers() {
		return answers;
	}

	public void setAnswers(String answers) {
		this.answers = answers;
	}

	public int getAnswerNum() {
		return answerNum;
	}

	public void setAnswerNum(int answerNum) {
		this.answerNum = answerNum;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + answerNum;
		result = prime * result + ((answers == null) ? 0 : answers.hashCode());
		result = prime * result + (int) (id ^ (id >>> 32));
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
		Answers other = (Answers) obj;
		if (answerNum != other.answerNum)
			return false;
		if (answers == null) {
			if (other.answers != null)
				return false;
		} else if (!answers.equals(other.answers))
			return false;
		if (id != other.id)
			return false;
		if (questionId != other.questionId)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Answers [id=" + id + ", questionId=" + questionId + ", answers=" + answers + ", answerNum=" + answerNum
				+ "]";
	}

}
