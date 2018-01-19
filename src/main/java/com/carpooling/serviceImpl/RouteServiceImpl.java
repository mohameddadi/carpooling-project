package com.carpooling.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.carpooling.model.Route;
import com.carpooling.repository.RouteRepository;
import com.carpooling.service.RouteService;

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
