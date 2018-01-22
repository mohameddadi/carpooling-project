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
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
@JsonIdentityInfo(
		property  = "id", 
		scope     = CarModel.class,
		resolver = EntityIdResolver.class,
		generator = ObjectIdGenerators.PropertyGenerator.class)
@Entity
public class CarModel implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String model;
	
	private String code;
	
	@OneToMany(mappedBy = "carModel", fetch=FetchType.LAZY, cascade = CascadeType.ALL)
	private Set<Car> cars;
	
	@JsonIgnore
	@ManyToOne(fetch=FetchType.LAZY)
	private CarBrand carBrand;
	

	public CarModel() {
	}
	
	public CarModel(Long id) {
		this.id = id;
	}
	
	public CarModel(Long id, String model, String code, Set<Car> cars) {
		this.id = id;
		this.model = model;
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
		return model;
	}

	public void setCategory(String model) {
		this.model = model;
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
