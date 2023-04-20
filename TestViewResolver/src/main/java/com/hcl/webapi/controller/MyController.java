package com.hcl.webapi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.hcl.webapi.TestViewResolverApplication;

@RestController
@RequestMapping("/toscana")
public class MyController {

	@RequestMapping("/url")
	public ModelAndView getJSP() {
		return new ModelAndView("input");
	}
	
}
