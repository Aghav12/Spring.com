package com.BikkadIT.IRCTC.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.BikkadIT.IRCTC.model.Passanger;
import com.BikkadIT.IRCTC.model.Ticket;
import com.BikkadIT.IRCTC.service.ServiceI;

@RestController
public class PassangerController {

	@Autowired
	private ServiceI serviceI;

	@PostMapping(value = "/bookTicket", consumes = "application/json", produces = "application/json")
	public ResponseEntity<Ticket> bookTicket(@RequestBody Passanger psg) {
		Ticket ticket = serviceI.bookTicket(psg);
		return new ResponseEntity<Ticket>(ticket, HttpStatus.OK);
	}

}
