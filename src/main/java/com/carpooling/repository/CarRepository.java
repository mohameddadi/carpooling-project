package com.carpooling.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.carpooling.model.Car;

public interface CarRepository extends JpaRepository<Car, Long> {

}

