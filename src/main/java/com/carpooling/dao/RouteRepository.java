package com.carpooling.dao;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.carpooling.model.Route;

public interface RouteRepository extends JpaRepository<Route, Long>{

}
