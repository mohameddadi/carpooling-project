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
public class Car implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private int nbrPlace ;
	private String color;
	private String category;
	private String model;
	
	@OneToMany(mappedBy = "car", cascade = CascadeType.ALL)
	private Set<Route> routes;
	
	public Car() {
		super();
	}
	public Car(int nbrPlace, String color, String category, String model) {
		super();
		this.nbrPlace = nbrPlace;
		this.color = color;
		this.category = category;
		this.model = model;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public int getNbrPlace() {
		return nbrPlace;
	}
	public void setNbrPlace(int nbrPlace) {
		this.nbrPlace = nbrPlace;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	
	public Set<Route> getRoutes(){
		return routes;
	}

	public void setRoutes(Set<Route> routes) {
		this.routes = routes;
	}
	
	

}
