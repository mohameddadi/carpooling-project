package com.carpooling.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.carpooling.utils.EntityIdResolver;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
@JsonIdentityInfo(
		property  = "id", 
		scope     = CarCatergories.class,
		resolver = EntityIdResolver.class,
		generator = ObjectIdGenerators.PropertyGenerator.class)
@Entity
public class CarCatergories implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String category;
	
	private String code;
	
	@JsonIgnore
	@OneToMany(mappedBy = "carCategory", fetch=FetchType.LAZY, cascade = CascadeType.ALL)
	private Set<Car> cars;
	
	public CarCatergories(Long id) {
		this.id = id;
	}

	public CarCatergories() {
	}
	
	public CarCatergories(Long id, String category, String code, Set<Car> cars) {
		this.id = id;
		this.category = category;
		this.code = code;
		this.cars = cars;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Set<Car> getCars() {
		return cars;
	}

	public void setCars(Set<Car> cars) {
		this.cars = cars;
	}
	
	
	
}
