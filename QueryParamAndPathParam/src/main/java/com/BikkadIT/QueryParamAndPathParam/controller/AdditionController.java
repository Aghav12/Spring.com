package com.BikkadIT.QueryParamAndPathParam.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdditionController {

	@GetMapping("/addition{a}/and/{b}")
	public ResponseEntity<Integer> add (@PathVariable int a, @PathVariable int b) {
		
		int c = a + b;
		return new ResponseEntity<Integer>(c, HttpStatus.OK);
		
	}
}
