package com.carpooling.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Message implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@ManyToOne
	private User senderUser;
	
	@ManyToOne
	private User recieverUser;
	
	private String message;
	
	private Date date;
	
	
	public Message() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public Message(User senderUser, User recieverUser, String message, Date date) {
		super();
		this.senderUser = senderUser;
		this.recieverUser = recieverUser;
		this.message = message;
		this.date = date;
	}



	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public User getSenderUser() {
		return senderUser;
	}

	public void setSenderUser(User senderUser) {
		this.senderUser = senderUser;
	}

	public User getRecieverUser() {
		return recieverUser;
	}

	public void setRecieverUser(User recieverUser) {
		this.recieverUser = recieverUser;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	
	

}
