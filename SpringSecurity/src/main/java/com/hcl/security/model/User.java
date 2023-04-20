package com.hcl.security.model;

import lombok.Data;

@Data
public class User {

	String username;
	String password;
	String email;
	
	public User(String username, String password, String email) {
	this.username = username;
	this.password = password;
	this.email = email;
	}
}
