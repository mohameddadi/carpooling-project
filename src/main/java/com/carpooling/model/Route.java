package com.carpooling.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Route implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private Float price;
	private String status;
	private boolean roundTrip;
	private Date dateOfDeparture;
	private Date arrivalDate;
	
	@ManyToOne(fetch = FetchType.EAGER)
	private Car car;
	
	@ManyToOne
	private City departureCity;
	
	@ManyToOne
	private City destinationCity;
	
	
	public Route() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Route(Float price, String status, boolean roundTrip, Date dateOfDeparture, Date arrivalDate) {
		super();
		this.price = price;
		this.status = status;
		this.roundTrip = roundTrip;
		this.dateOfDeparture = dateOfDeparture;
		this.arrivalDate = arrivalDate;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Float getPrice() {
		return price;
	}
	public void setPrice(Float price) {
		this.price = price;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public boolean isRoundTrip() {
		return roundTrip;
	}
	public void setRoundTrip(boolean roundTrip) {
		this.roundTrip = roundTrip;
	}
	public Date getDateOfDeparture() {
		return dateOfDeparture;
	}
	public void setDateOfDeparture(Date dateOfDeparture) {
		this.dateOfDeparture = dateOfDeparture;
	}
	public Date getArrivalDate() {
		return arrivalDate;
	}
	public void setArrivalDate(Date arrivalDate) {
		this.arrivalDate = arrivalDate;
	}
	
	

}
