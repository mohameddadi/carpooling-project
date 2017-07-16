package com.carpooling.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.carpooling.dao.CarRepository;
import com.carpooling.model.Car;

@Service
public class CarServiceImpl implements CarService{
	
	@Autowired
	private CarRepository carRepository ;

	@Override
	public List<Car> getAllCars() {
		return carRepository.findAll();
	}

}
