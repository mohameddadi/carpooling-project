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
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@JsonIdentityInfo(
		property  = "id", 
		scope     = CarBrand.class,
		resolver = EntityIdResolver.class,
		generator = ObjectIdGenerators.PropertyGenerator.class)
@Entity
public class CarBrand implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String brand;
	
	@OneToMany(mappedBy = "carBrand", fetch=FetchType.LAZY, cascade = CascadeType.ALL)
	private Set<CarModel> carModels;
	
	public CarBrand() {
	
	}

	public CarBrand(Long id, String brand, Set<CarModel> carModels) {
		super();
		this.id = id;
		this.brand = brand;
		this.carModels = carModels;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public Set<CarModel> getCarModels() {
		return carModels;
	}

	public void setCarModels(Set<CarModel> carModels) {
		this.carModels = carModels;
	}
	
	
	

}
