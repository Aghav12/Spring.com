package com.BikkadIT.Demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.BikkadIT.Demo.model.Student;

@RestController
public class StudentController {

	@GetMapping("/getst")
	public ResponseEntity<Student> getStudent() {
		
		Student st = new Student();
		st.setSid(1);
		st.setSname("Santosh");
		st.setSaddr("Pune");
		
		return new ResponseEntity<Student>(st, HttpStatus.OK);
		
	}
	
	@GetMapping("/getAllStu")
	public ResponseEntity<List<Student>> getAllStu() {
	
	Student st = new Student();
	st.setSid(1);
	st.setSname("Santosh");
	st.setSaddr("Pune");
	
	Student st1 = new Student();
	st1.setSid(2);
	st1.setSname("Santosh");
	st1.setSaddr("Pune");
	
	Student st2 = new Student();
	st2.setSid(3);
	st2.setSname("Santosh");
	st2.setSaddr("Pune");
	
	ArrayList al = new ArrayList();
	al.add(st);
	al.add(st1);
	al.add(st2);
	
	return new ResponseEntity<List<Student>>(al, HttpStatus.OK);

}
}