package com.carpooling.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.carpooling.model.Car;
import com.carpooling.repository.CarRepository;
import com.carpooling.service.CarService;

@Service
public class CarServiceImpl implements CarService{
	
	@Autowired
	private CarRepository carRepository ;

	@Override
	@Transactional
	public List<Car> getAllCars() {
		return carRepository.findAll();
	}

	public ResponseEntity<?> getCarById(Long id){
		Car car = carRepository.getOne(id);
		if(car == null){
			return new ResponseEntity(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<Car>(car, HttpStatus.OK);
	}
}
