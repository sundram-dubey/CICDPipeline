package com.hcl.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.hcl.model.Book;
import com.hcl.persist.Persistence;
import com.hcl.service.IService;

@Service
public class IServiceImpl implements IService {

	@Autowired
	Persistence persistence; 
	
	@Override
	public ResponseEntity<?> save(Book book) {
		return ResponseEntity.ok(persistence.save(book));
	}

}
