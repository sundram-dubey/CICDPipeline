package com.hcl.nest.controller;

import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

@Controller
public class FrontController {
    
	@GetMapping("mapurl")
	public String edureka() {
		return "index";
	}

	@PostMapping("processurl")
	public String viewDetails(@RequestParam("ciD") String iD, @RequestParam("cName") String cName,
			@RequestParam("cMail") String cMail, Model mm) {
		mm.addAttribute("ciD", Integer.parseInt(iD));
		mm.addAttribute("cName", cName);
		mm.addAttribute("cMail", cMail);
		return "viewCustomer";
	}
	
}
