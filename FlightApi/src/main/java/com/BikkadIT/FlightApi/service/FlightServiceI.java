package com.BikkadIT.FlightApi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BikkadIT.FlightApi.model.Flight;
import com.BikkadIT.FlightApi.repository.FlightRepository;



@Service
public class FlightServiceI implements FlightService {

	@Autowired
	private FlightRepository flightRepository;

	
	@Override
	public java.util.List<Flight> getAllFLight() {
		 java.util.List<Flight> all = flightRepository.findAll();
		return all;
	}
}
