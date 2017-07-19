package com.carpooling.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Feedback implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@ManyToOne
	private User evaluatingUser;
	
	@ManyToOne
	private User evaluatedUser;
	
	private int rating;

	public Feedback() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Feedback(User evaluatingUser, User evaluatedUser, int rating) {
		super();
		this.evaluatingUser = evaluatingUser;
		this.evaluatedUser = evaluatedUser;
		this.rating = rating;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public User getEvaluatingUser() {
		return evaluatingUser;
	}

	public void setEvaluatingUser(User evaluatingUser) {
		this.evaluatingUser = evaluatingUser;
	}

	public User getEvaluatedUser() {
		return evaluatedUser;
	}

	public void setEvaluatedUser(User evaluatedUser) {
		this.evaluatedUser = evaluatedUser;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}
	
	
	
}
