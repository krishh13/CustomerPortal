package com.jittu.model;

import javax.persistence.*;

@Entity
@Table(name = "question_choice")
public class QuestionChoice {
	@Column(name = "answer_id")
	private int id;
	
	@Column(name = "answer_choice")
	private String Answer_choice;
		
	private Question question;

	public QuestionChoice() {
	
	}

	public QuestionChoice(int id, String answer_choice) {
		super();
		this.id = id;
		Answer_choice = answer_choice;
	}

	public QuestionChoice(int id, String answer_choice, Question question) {
		super();
		this.id = id;
		Answer_choice = answer_choice;
		this.question = question;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAnswer_choice() {
		return Answer_choice;
	}

	public void setAnswer_choice(String answer_choice) {
		Answer_choice = answer_choice;
	}

	@ManyToOne
	@JoinColumn(name = "question_id")
	public Question getQuestion() {
		return question;
	}

	public void setQuestion(Question question) {
		this.question = question;
	}
	

}
