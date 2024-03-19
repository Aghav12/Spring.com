package com.BikkadIT.QueryParamAndPathParam.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class CourseController {

	
	@GetMapping("/getCourseDtls")
	public ResponseEntity<String> getCourseDtls(@RequestParam String sname, @RequestParam String tname) {
		
	String msg = sname  +  " by " +  tname   +  " new Batch starting from 15 march 2024"; 
		
		return new ResponseEntity<String>(msg, HttpStatus.OK);
		
	}
}
