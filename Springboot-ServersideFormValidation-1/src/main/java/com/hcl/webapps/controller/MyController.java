package com.hcl.webapps.controller;

import javax.naming.Binding;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class MyController {

	@GetMapping("/form")
	public String test(Model m) {
	System.out.println("opening form");
		return "form";
	}
	
	@PostMapping("/process")
    public String processForm(@Valid @ModelAttribute("loginData") Object obj, BindingResult result) {
		if(result.hasErrors()) {
			System.out.println(result);
		}
		System.out.println(obj);
    	return "success";
    }
}
