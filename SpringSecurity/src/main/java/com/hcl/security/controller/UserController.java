package com.hcl.security.controller;

import java.util.List;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.security.model.User;
import com.hcl.security.services.UserService;

@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
	private UserService userService;
	
	//all users
	@GetMapping
	public List<User> getAllUsers(){
		return this.userService.getALLUsers();
	}
	
	//return single user
	@PreAuthorize("hasRole('ADMIN')")
	@GetMapping("/getByName/{username}")
	public Stream<User> getUser(@PathVariable String username) {
		return this.userService.getUser(username);
	}
	
	@PostMapping("/post")
	public User add(@RequestBody User user) {
		System.out.println(user);
		return this.userService.addUser(user);
	}
}
