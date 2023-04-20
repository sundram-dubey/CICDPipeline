package com.hcl.webapps.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.hcl.webapps.entity.User;

public interface UserRepo extends CrudRepository<User, Integer>{
   
	public List<User> findByName(String name);
	
}
