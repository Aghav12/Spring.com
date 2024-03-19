package com.BikkadIT.FlightApi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.BikkadIT.FlightApi.model.Flight;
import com.BikkadIT.FlightApi.service.FlightServiceI;


@RestController
public class FlightController {

	@Autowired
	private FlightServiceI flightServiceI;

	@GetMapping(value = "getAllFlight", produces = "application/json")
	public ResponseEntity<List<Flight>> getAllFlight() {
		List<Flight> allFLight = flightServiceI.getAllFLight();
		return new ResponseEntity<List<Flight>>(allFLight, HttpStatus.OK);

	}
}
