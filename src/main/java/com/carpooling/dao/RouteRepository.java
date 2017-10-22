package com.carpooling.dao;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.carpooling.model.Route;

public interface RouteRepository extends JpaRepository<Route, Long>{

	List<Route> findByUserId(Long id);
}
