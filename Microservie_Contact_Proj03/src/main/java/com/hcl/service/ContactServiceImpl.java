package com.hcl.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.hcl.entity.Contact;

@Service
public class ContactServiceImpl implements ContactService {

	// fake list of contacts
	List<Contact> list = List.of(new Contact(101l, "sundramkdubey@gmail.com", "Sundram Dubey", 1331L),
			new Contact(101l, "sundramdubey601@gmail.com", "Sundram Dubey", 1331L),
			new Contact(102l, "shivamkdubey@gmail.com", "Sundram Dubey", 1332L),
			new Contact(103l, "jyoti@gmail.com", "Jyoti", 1333L));

	@Override
	public List<Contact> getContacts(Long userId) {
		return this.list.stream().filter(contact->contact.getUserId().equals(userId)).collect(Collectors.toList());
	}

}
