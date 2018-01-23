package com.carpooling.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.carpooling.model.Car;

public interface CarService {
	
	public List<Car> getAllCars();
	
	public Car getCarById(Long id);
	
	public void createCar(Car car);
	
	public void deleteCar(Long id);
	
	public void updateCar(Car car);

}
