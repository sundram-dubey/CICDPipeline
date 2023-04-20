package com.hcl.controller;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.hcl.entity.User;
import com.hcl.entity.service.UserService;

@RestController
@RequestMapping("/user")
public class userController {

	@Autowired
	private UserService userService;

	@Autowired
	private RestTemplate restTemplate;

	@GetMapping("/{userId}")
	public User getUser(@PathVariable("userId") Long userId) {
		User user = this.userService.getUser(userId);
		// http://localhost:8092/contact/user/1331
		List<?> contactList = this.restTemplate.getForObject("http://contact-service/contact/user/" + userId,List.class);
		user.setContactList(contactList);
		return user;
	}
}
