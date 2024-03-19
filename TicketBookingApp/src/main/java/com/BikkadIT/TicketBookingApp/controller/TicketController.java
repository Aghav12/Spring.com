package com.BikkadIT.TicketBookingApp.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.BikkadIT.TicketBookingApp.request.Passanger;
import com.BikkadIT.TicketBookingApp.response.Ticket;

@RestController
public class TicketController {

	@PostMapping(value = "/bookTicket",consumes = {"application/json","application/xml"},produces = {"application/xml","application/json"})
	public ResponseEntity<Ticket> booktTicket (@RequestBody Passanger psg) {
		
		System.out.println(psg);
		
		Ticket t = new Ticket();
		t.setTid(11);
		t.setFrom("Mumbai");
		t.setTo("Pune");
		t.setPnr("845614");
		
		return new ResponseEntity<Ticket>(t, HttpStatus.OK);
		
	}
}
