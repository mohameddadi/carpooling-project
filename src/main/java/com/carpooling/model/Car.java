package com.carpooling.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.carpooling.utils.EntityIdResolver;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
@JsonIdentityInfo(
		property  = "id", 
		scope     = Car.class,
		resolver = EntityIdResolver.class,
		generator = ObjectIdGenerators.PropertyGenerator.class)
@Entity
public class Car implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private int nbrPlace ;
	private String color;
	private String energy;
	private String fiscalPower;
	
	@ManyToOne(fetch=FetchType.LAZY)
	private CarModel carModel;
	
	@JsonIgnore
	@OneToMany(mappedBy = "car", cascade = CascadeType.ALL)
	private Set<Route> routes;
	
	
	@ManyToOne(fetch=FetchType.LAZY)
	private User owner;
	
	public Car() {
	
	}


	public Car(int nbrPlace, String color, String energy, String fiscalPower, 
			CarModel carModel, Set<Route> routes,
			User owner) {
		super();
		this.nbrPlace = nbrPlace;
		this.color = color;
		this.energy = energy;
		this.fiscalPower = fiscalPower;
		this.carModel = carModel;
		this.routes = routes;
		this.owner = owner;
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
	
	public Set<Route> getRoutes(){
		return routes;
	}

	public void setRoutes(Set<Route> routes) {
		this.routes = routes;
	}
	public User getOwner() {
		return owner;
	}
	public void setOwner(User owner) {
		this.owner = owner;
	}

	public String getEnergy() {
		return energy;
	}


	public void setEnergy(String energy) {
		this.energy = energy;
	}


	public String getFiscalPower() {
		return fiscalPower;
	}


	public void setFiscalPower(String fiscalPower) {
		this.fiscalPower = fiscalPower;
	}


	public CarModel getCarModel() {
		return carModel;
	}


	public void setCarModel(CarModel carModel) {
		this.carModel = carModel;
	}
	

}
