package com.carpooling.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.carpooling.dao.RouteRepository;
import com.carpooling.model.Route;

@Service
public class RouteServiceImpl implements RouteService {
	
	@Autowired
	private RouteRepository routeRepository;
	
	@Override
	public List<Route> getAllRoutes(){
		return routeRepository.findAll();
	}

	public List<Route> getRoutesById(Long id){
		return routeRepository.findByUserId(id);
	}
}
