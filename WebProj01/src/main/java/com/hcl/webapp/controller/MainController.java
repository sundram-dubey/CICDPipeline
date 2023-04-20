package com.hcl.webapp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MainController {

	@RequestMapping("/php")
	 public String test() {
		System.out.println("Hello");
		 return "home";	
	 }
}
