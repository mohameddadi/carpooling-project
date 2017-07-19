package com.carpooling.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Adress implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String adress;
	
	@OneToMany(mappedBy = "adress", cascade = CascadeType.ALL)
	private Set<User> users;
	
	public Adress() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Adress(String adress) {
		super();
		this.adress = adress;
	}


	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	

}
