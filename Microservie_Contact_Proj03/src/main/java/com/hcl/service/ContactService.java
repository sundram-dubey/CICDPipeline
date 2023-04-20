package com.hcl.service;

import java.util.List;

import com.hcl.entity.Contact;

public interface ContactService {

	public List<Contact> getContacts(Long userId);
}
