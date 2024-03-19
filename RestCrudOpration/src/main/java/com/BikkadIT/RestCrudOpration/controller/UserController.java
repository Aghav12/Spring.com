package com.BikkadIT.RestCrudOpration.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.BikkadIT.RestCrudOpration.model.User;
import com.BikkadIT.RestCrudOpration.service.UserServiceI;

@RestController
public class UserController {

	@Autowired
	private UserServiceI userServiceI;
	
	@PostMapping(value = "/saveUser",consumes = "application/json")
	public ResponseEntity<String> saveUser(@RequestBody User u) {
		
		boolean saveUser = userServiceI.saveUser(u);
		if (saveUser) {
			String msg = "User Saved Successfully";
			return new ResponseEntity<String>(msg, HttpStatus.CREATED);
		}else {
			String msg = "User Not Saved Successfully";
			
		return new ResponseEntity<String>(msg, HttpStatus.BAD_REQUEST);
		}
		
	}
	
	@GetMapping(value = "/getAll",produces = "application/json")
	public List<User> getAllUser (){
		
		List<User> allUser = userServiceI.getAllUser();
		return allUser;
		
	}
	
	@PutMapping(value = "/updateUser",consumes = "application/json")
	public ResponseEntity<String> updateUser(@RequestBody User u) {
		boolean updateUser = userServiceI.updateUser(u);
		if(updateUser) {
			String msg = "User Updated Successfully";
			return new ResponseEntity<String>(msg, HttpStatus.CREATED);
		}else {
			String msg = "User Not Updated Successfully";
			return new ResponseEntity<String>(msg, HttpStatus.BAD_REQUEST);
		}	
	}
	@DeleteMapping(value = "/deletAll")
	public ResponseEntity<String > deletAllUser() {
		boolean deletAllUser = userServiceI.deletAllUser();
		if(deletAllUser) {
			String msg = "User Deleted Successfully";
			return new ResponseEntity<String>(msg, HttpStatus.OK);
		}else {
			String msg = "User Not Deleted Successfully";
		return new ResponseEntity<String>(msg, HttpStatus.BAD_REQUEST);
		}
		
	}
	@PutMapping(value = "/updateAllUser", consumes = "application/json")
	public ResponseEntity<String > updateAllUser(@RequestBody List<User> user) {
		boolean updateAllUser = userServiceI.updateAllUser(user);
		if (updateAllUser) {
			String msg = "User Updated Successfully";
			return new ResponseEntity<String>(msg, HttpStatus.CREATED);
		}else {
			String msg = "User Not Updated Successfully";
			return new ResponseEntity<String>(msg, HttpStatus.BAD_REQUEST);
		}	
		}
	
	@PostMapping(value = "/saveAllUser", consumes = "application/json")
	public ResponseEntity<String> saveAllUser (@RequestBody List<User> user) {
		boolean saveAllUser = userServiceI.saveAllUser(user);
		if (saveAllUser) {
			String msg = "User Saved Successfully";
			return new ResponseEntity<String>(msg, HttpStatus.CREATED);
		}else {
			String msg = "User Not Saved Successfully";
			
		return new ResponseEntity<String>(msg, HttpStatus.BAD_REQUEST);
		}
		}
	@GetMapping(value = "/getUserByIdQP",produces = "application/json")
	public ResponseEntity<User> getUserByIdQP (@RequestParam int uId) {
		User userByIdQP = userServiceI.getUserByIdQP(uId);
		
		return new ResponseEntity<User>(userByIdQP, HttpStatus.OK);
		
	}
	@GetMapping(value = "getUserByIdPP/{uId}",produces = "application/json")
	public ResponseEntity<User> getUserByIdPP (@PathVariable int uId) {
		User userByIdPP = userServiceI.getUserByIdPP(uId);
		return new ResponseEntity<User>(userByIdPP, HttpStatus.OK);
		
	}
	@DeleteMapping(value = "/deleteUserByIdQP")
	public ResponseEntity<String> deleteUserByIdQP(@RequestParam int uId) {
		boolean deletUserByIdQP = userServiceI.deletUserByIdQP(uId);
		if (deletUserByIdQP) {
			String msg = "User Deleted Successfully";
			return new ResponseEntity<String>(msg, HttpStatus.OK);
		}else {
			String msg = "User Not Deleted Successfully";
		return new ResponseEntity<String>(msg, HttpStatus.BAD_REQUEST);
		}
		
	}
	@DeleteMapping(value = "/deleteUserByIdPP/{uId}")
	public ResponseEntity<String> deleteUserByIdPP (@PathVariable int uId) {
		boolean deletUserByIdPP = userServiceI.deletUserByIdPP(uId);
		if(deletUserByIdPP) {
			String msg = "User Deleted Successfully";
			return new ResponseEntity<String>(msg, HttpStatus.OK);
		}else {
			String msg = "User Not Deleted Successfully";
		return new ResponseEntity<String>(msg, HttpStatus.BAD_REQUEST);
		}
		
	}
	
 }
