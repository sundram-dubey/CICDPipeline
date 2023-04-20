package com.hcl.webapps;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.hcl.webapps.dao.UserRepo;
import com.hcl.webapps.entity.User;


@SpringBootApplication
public class WebProj02Application {

	public static void main(String[] args) {
	ApplicationContext actx = SpringApplication.run(WebProj02Application.class, args);
	UserRepo ur= actx.getBean(UserRepo.class);
	User entry1 = new User();
	entry1.setName("Shivam Dubey");
	entry1.setCity("Noida");
	entry1.setStatus("Engineer");
	User user1 = ur.save(entry1);
	System.out.println(user1);
	List<User> user2 = ur.findByName("Sundram Dubey");
	user2.forEach(var->{
		System.out.println(var);
	});
	Iterable<User> getUsers = ur.findAll();
	getUsers.forEach(input->{
	         if(input.getName().equalsIgnoreCase("Shivam Dubey"))ur.delete(input);
	});
	}
}
