package com.carpooling.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.carpooling.model.Route;

public interface RouteRepository extends JpaRepository<Route, Long>{

}
