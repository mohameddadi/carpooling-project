package com.carpooling.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
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

	public Car getCarById(Long id){
		return carRepository.getOne(id);
	}

	
	public void createCar(Car car) {
		carRepository.saveAndFlush(car);
	}

	@Override
	public void deleteCar(Long id) {
		// TODO Auto-generated method stub
		carRepository.delete(id);
	}

	@Override
	@Transactional
	public void updateCar(Car car) {
		// TODO Auto-generated method stub
		if(car.getCarModel() != null){
			carRepository.updateCar(car.getId(), car.getNbrPlace(), car.getColor(),
					car.getEnergy(), car.getFiscalPower(), car.getCarModel().getId());
		}else{
			carRepository.updateCar(car.getId(), car.getNbrPlace(), car.getColor(),
					car.getEnergy(), car.getFiscalPower(), null);
		}
		
	}

	
	
}
