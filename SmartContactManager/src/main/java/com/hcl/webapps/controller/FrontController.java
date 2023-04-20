package com.hcl.webapps.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.webapps.dao.UserRepository;
import com.hcl.webapps.entity.User;

@RestController
public class FrontController {

	@Autowired
	private UserRepository userRepository;
	
	@GetMapping("/test")
	public String test() {
		
		User user = new User();
		user.setName("Sundram Dubey");
		user.setEmail("sundramkdubey@gmail.com");
		userRepository.save(user);
		return "working";
	}
}
