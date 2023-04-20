package com.hcl.security.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import org.springframework.stereotype.Service;

import com.hcl.security.model.User;

@Service
public class UserService {

	List<User> list = new ArrayList<>();
	
	public UserService() {
		list.add(new User("Sundram","abc@123","sundramkdubey@gmail.com"));
		list.add(new User("Dubey","123@123","sundramkdubey@gmail.com"));
	}
	
	public List<User> getALLUsers(){
		return this.list;
	}
	
	public Stream<User> getUser(String username) {
		return this.list.stream().filter((user)->user.getUsername().equalsIgnoreCase(username));
	}
	
	public User addUser(User user) {
		this.list.add(user);
		return user;
	}
}
