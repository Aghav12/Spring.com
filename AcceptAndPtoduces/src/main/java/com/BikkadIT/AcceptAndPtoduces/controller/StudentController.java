package com.BikkadIT.AcceptAndPtoduces.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.BikkadIT.AcceptAndPtoduces.model.Student;
@RestController
public class StudentController {

	
	@GetMapping(value="/student", produces = {"application/xml","application/json"})
	public ResponseEntity<Student> getStudent() {
		Student st = new Student();
		st.setSid(111);
		st.setSname("Santosh");
		st.setSaddr("Pune");
		
		return new ResponseEntity<Student>(st, HttpStatus.OK);
		
	}
	@PostMapping(value="/saveStudent",consumes = "application/json")
	public void saveStudent (@RequestBody Student st) {
		
		System.out.println(st);
	}
	
}
