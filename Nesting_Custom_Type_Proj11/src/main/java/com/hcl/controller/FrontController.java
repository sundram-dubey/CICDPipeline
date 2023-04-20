package com.hcl.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.model.Book;
import com.hcl.service.impl.IServiceImpl;

@RestController
@RequestMapping("/crud")
public class FrontController {

	@Autowired
	IServiceImpl iServiceImpl;
	
	@PostMapping("/doPst")
	public ResponseEntity<?> setValues(@RequestBody Book book) {
		System.err.println("FrontController.setValues()");
		return ResponseEntity.ok(iServiceImpl.save(book));
	}
	
	@PostMapping("/pst")
	public ResponseEntity<?> setValues(@RequestBody String book) {
		System.err.println("FrontController.setValues()");
		return ResponseEntity.ok(new ArrayList<>());
	}
	
	@GetMapping("/get")
	public ResponseEntity<?> getValue(){
		return ResponseEntity.ok("Working");
	}
}
