package com.carpooling.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class City implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String code;
	private String value;
	
	@ManyToOne
	private Country country;
	
	@OneToMany(mappedBy = "departureCity", cascade = CascadeType.ALL)
	private Set<Route> departureRoutes;
	
	@OneToMany(mappedBy = "destinationCity", cascade = CascadeType.ALL)
	private Set<Route> destinationRoutes;

	public City() {
		super();
		// TODO Auto-generated constructor stub
	}

	public City(String code, String value, Country country, Set<Route> departureRoutes, Set<Route> destinationRoutes) {
		super();
		this.code = code;
		this.value = value;
		this.country = country;
		this.departureRoutes = departureRoutes;
		this.destinationRoutes = destinationRoutes;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

	public Set<Route> getDepartureRoutes() {
		return departureRoutes;
	}

	public void setDepartureRoutes(Set<Route> departureRoutes) {
		this.departureRoutes = departureRoutes;
	}

	public Set<Route> getDestinationRoutes() {
		return destinationRoutes;
	}

	public void setDestinationRoutes(Set<Route> destinationRoutes) {
		this.destinationRoutes = destinationRoutes;
	}

}
