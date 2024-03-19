package com.BikkadIT.Demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/welcomeController")
public class WelcomeController {

	@GetMapping("/welcome")
	public ResponseEntity<String> welcomeMsg() {
		
		String msg = "Welcome To BikkadIT";
		return new ResponseEntity<String>(msg,HttpStatus.OK);
		
	}
	@GetMapping("/welcome1")
	public ResponseEntity<String> welcomeMsg1() {
		String msg = "Welcome To BikkadIT Pune";
		
		return new ResponseEntity<String>(msg, HttpStatus.OK);
		
	}
}
