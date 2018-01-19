package com.carpooling.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.carpooling.model.Car;

public interface CarService {
	
	public List<Car> getAllCars();
	
	public ResponseEntity<?> getCarById(Long id);

}
