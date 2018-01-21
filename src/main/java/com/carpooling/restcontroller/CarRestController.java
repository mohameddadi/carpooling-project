package com.carpooling.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

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
		Car car = carService.getCarById(id);
		if(car == null){
			return new ResponseEntity(" car not found  ",HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<Car>(car,HttpStatus.OK);
	}
	
	
	@RequestMapping(value = "/car/", method = RequestMethod.POST,headers="Accept=application/json",
			consumes = MediaType.APPLICATION_JSON_VALUE, produces = "application/json; charset=UTF-8")
	@ResponseBody public ResponseEntity<?> createCar(@RequestBody Car car,
			UriComponentsBuilder ucBuilder){
		carService.createCar(car);
		HttpHeaders headers = new HttpHeaders();
        headers.setLocation(ucBuilder.path("/car/{id}").buildAndExpand(car.getId()).toUri());
        return new ResponseEntity<String>(headers, HttpStatus.CREATED);
	}
	
	@RequestMapping(value = "/car/{id}", method = RequestMethod.DELETE)
	@ResponseBody public ResponseEntity<?> deleteCar(@PathVariable("id") Long id){
		Car car = carService.getCarById(id);
		if(car != null){
			carService.deleteCar(id);
			return new ResponseEntity<String>(" car was deleted ",HttpStatus.OK);
		}
		return new ResponseEntity<String>("Unable to delete car with this id ",HttpStatus.NOT_FOUND);
	}
	

}
