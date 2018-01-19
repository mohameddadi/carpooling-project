package com.carpooling.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.carpooling.model.Car;
import com.carpooling.service.CarService;

@RestController
public class CarRestController {
	
	@Autowired
	private CarService carService;
	
	@RequestMapping(value = "/car/", method = RequestMethod.GET)
	@ResponseBody public List<Car> getAllCars(){
		return carService.getAllCars();
	}
	
	@RequestMapping(value = "/car/{id}", method = RequestMethod.GET)
	@ResponseBody public ResponseEntity<?> getCarById(@PathVariable("id") Long id){
		return carService.getCarById(id);
	}

}
