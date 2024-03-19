package com.BikkadIT.RestCrudOpration.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BikkadIT.RestCrudOpration.model.User;
import com.BikkadIT.RestCrudOpration.repository.UserRepository;

@Service
public class UserServiceI implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public boolean saveUser(User u) {
		User save = userRepository.save(u);
		
		if (save!= null) {
			return true;
		}else {
			
		return false;
		}
	}

	@Override
	public List<User> getAllUser() {
		List<User> all = userRepository.findAll();
		return all;
	}

	@Override
	public boolean updateUser(User u) {
		User save = userRepository.save(u);
		if(save != null) {
			return true;
		}else {
			
		return false;
		}
	}

	@Override
	public boolean deletAllUser() {
		List<User> all = userRepository.findAll();
		if(all.isEmpty()) {
			
		return false;
		}else {
			userRepository.deleteAll();
			return true;
		}
	}

	@Override
	public boolean saveAllUser(List<User> user) {
		List<User> saveAll = userRepository.saveAll(user);
		if (saveAll != null) {
			return true;
		}else {
		return false;
		}
	}

	@Override
	public boolean updateAllUser(List<User> user) {
		List<User> all = userRepository.saveAll(user);
		if (all.isEmpty()) {
			return false;
		}else {
			return true;
		}
		
	}

	@Override
	public User getUserByIdQP(int uId) {
		User user = userRepository.findById(uId).get();
		return user;
	}

	@Override
	public User getUserByIdPP(int uId) {
		User user = userRepository.findById(uId).get();
		return user;
	}

	@Override
	public boolean deletUserByIdQP(int uId) {
		boolean existsById = userRepository.existsById(uId);
		if (existsById) {
			userRepository.deleteById(uId);
			return true;
		}else {
		return false;
		}
	}

	@Override
	public boolean deletUserByIdPP(int uId) {
		boolean existsById = userRepository.existsById(uId);
		
		if (existsById) {
			userRepository.deleteById(uId);
			return true;
		}else {
			
		return false;
		}
	}

	
}
