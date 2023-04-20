package com.hcl.entity.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.hcl.entity.User;

@Service
public class UserServiceImpl implements UserService {

	List<User> userList = List.of(new User(1331L, "Sundram Dubey", 7054702937L),
			new User(1332L, "Shivam Dubey", 7068376407L), new User(1333L, "Jyoti", 7318475321L));

	@Override
	public User getUser(Long id) {
		return this.userList.stream().filter(user->user.getUserId().equals(id)).findAny().orElse(null);
	}
}
