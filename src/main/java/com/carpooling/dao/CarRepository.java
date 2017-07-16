package com.carpooling.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.carpooling.model.Car;

public interface CarRepository extends JpaRepository<Car, Long> {

}

