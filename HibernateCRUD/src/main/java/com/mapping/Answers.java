package com.mapping;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
@Entity
public class Answers {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int answerid;
	private String answer;
	@OneToOne
	private Questions question;
	public String getAnswer() {
		return answer;
	}
	public void setQuestion(Questions question) {
		this.question = question;
	}
	public int getAnswerid() {
		return answerid;
	}
	public void setAnswerid(int answerid) {
		this.answerid = answerid;
	}
	public String getQuestion() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	
}
