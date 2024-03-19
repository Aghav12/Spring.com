package com.BikkadIT.RestCrudOpration.service;

import java.util.List;

import com.BikkadIT.RestCrudOpration.model.User;

public interface UserService {

	
	public boolean saveUser(User u);
	
	public List<User> getAllUser();
	
	public boolean updateUser(User u);
	
	public boolean deletAllUser();
	
	public boolean saveAllUser(List<User> user);
	
	public boolean  updateAllUser(List<User > user);
	
	public User getUserByIdQP(int uId);
	
	public User getUserByIdPP(int uId);
	
	public boolean deletUserByIdQP(int uId);
	
	public boolean deletUserByIdPP(int uId);
	
	
}
