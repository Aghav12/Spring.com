package com.BikkadIT.MakeMyTripClientApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.BikkadIT.MakeMyTripClientApp.request.Passanger;
import com.BikkadIT.MakeMyTripClientApp.response.Ticket;
import com.BikkadIT.MakeMyTripClientApp.service.PassangerServiceI;

@RestController
public class PassangerController {

	@Autowired
	private PassangerServiceI passangerServiceI;

	@PostMapping(value = "/bookTicket", consumes = "application/json", produces = "application/json")
	public ResponseEntity<Ticket> bookTicket(@RequestBody Passanger psg) {
		Ticket ticket = passangerServiceI.bookTicketResttemplete(psg);
		return new ResponseEntity<Ticket>(ticket, HttpStatus.OK);
	}

	@PostMapping(value = "/bookTicket1", consumes = "application/json", produces = "application/json")
	public ResponseEntity<Ticket> bookTicket1(@RequestBody Passanger psg) {
		Ticket ticket = passangerServiceI.bookTicketWebClient(psg);
		return new ResponseEntity<Ticket>(ticket, HttpStatus.OK);
	}
}
