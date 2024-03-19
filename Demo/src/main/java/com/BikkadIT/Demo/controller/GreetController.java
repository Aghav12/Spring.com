package com.BikkadIT.Demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greetController")
public class GreetController {

	@GetMapping("/welcome")
	public ResponseEntity<String>greetMsg() {
		
		String msg = "Good Evening all";
		
		return new ResponseEntity<String>(msg, HttpStatus.OK);
		
	}
}
