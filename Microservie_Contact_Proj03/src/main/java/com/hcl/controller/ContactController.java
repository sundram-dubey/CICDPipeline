package com.hcl.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.entity.Contact;
import com.hcl.service.ContactService;

@RestController
@RequestMapping("/contact")
public class ContactController {

	@Autowired
	ContactService cs;
	@RequestMapping("/user/{userId}")
	
	public List<Contact> getContactList(@PathVariable("userId") Long userId){
		System.out.println("ContactController.getContactList()");	
		return this.cs.getContacts(userId);
	}
}
