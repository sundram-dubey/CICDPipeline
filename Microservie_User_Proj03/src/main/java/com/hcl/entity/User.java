package com.hcl.entity;

import java.util.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {


	private Long userId;
	private String name;
	private Long phone;
	
	List<?> contactList = new ArrayList<>();
	
	public User(Long userId, String name, Long phone) {
		this.userId = userId;
		this.name = name;
		this.phone = phone;
	}
	
}
