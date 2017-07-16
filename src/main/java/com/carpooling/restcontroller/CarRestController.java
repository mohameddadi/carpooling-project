package com.carpooling.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.carpooling.business.CarService;
import com.carpooling.model.Car;

@RestController
public class CarRestController {
	
	@Autowired
	private CarService carService;
	
	@RequestMapping(value = "/car/", method = RequestMethod.GET)
	@ResponseBody public List<Car> getAllCars(){
		return carService.getAllCars();
	}

}
