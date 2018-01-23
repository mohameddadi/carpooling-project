package com.carpooling.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.carpooling.model.Car;
import com.carpooling.model.CarModel;

public interface CarRepository extends JpaRepository<Car, Long> {

	@Modifying
    @Query("UPDATE Car c SET c.nbrPlace = :nbrPlace, c.color = :color, c.energy = :energy, c.fiscalPower = :fiscalPower, c.carModel = :carModel WHERE c.id = :id")
	int updateCar(@Param("id") Long id, @Param("nbrPlace") int nbrPlace ,
			@Param("color") String color, @Param("energy")String energy,
			@Param("fiscalPower") String fiscalPower, @Param("carModel")Long carModel);
}

