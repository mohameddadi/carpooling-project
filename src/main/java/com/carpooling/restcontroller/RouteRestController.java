package com.carpooling.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.carpooling.model.Route;
import com.carpooling.service.RouteService;

@RestController
public class RouteRestController {

	@Autowired
	private RouteService routeService;
	
	@RequestMapping(value = "/route/", method = RequestMethod.GET)
	@ResponseBody public List<Route> getAllRoutes(){
		return routeService.getAllRoutes();
	}
}
