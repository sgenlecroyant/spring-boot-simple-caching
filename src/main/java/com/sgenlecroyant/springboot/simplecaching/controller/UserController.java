package com.sgenlecroyant.springboot.simplecaching.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.sgenlecroyant.springboot.simplecaching.repository.UserRepository;
import com.sgenlecroyant.springboot.simplecaching.user.User;

@RestController
public class UserController {
	
	private UserRepository userRepository;
	
	@Autowired
	public UserController(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	
	@GetMapping(value = "/users/{id}")
	public User fetchUserById(@PathVariable Integer id) {
		return this.userRepository.findById(id).orElseThrow();
	}
	
	@GetMapping(value = "/users")
	public List<User> fetchUsers(){
		return this.userRepository.findAll();
	}
	
	

}
