package com.hcl.webapps.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hcl.webapps.entity.User;

public interface UserRepository extends JpaRepository<User, Integer>{

}
