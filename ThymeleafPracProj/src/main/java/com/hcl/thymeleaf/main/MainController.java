package com.hcl.thymeleaf.main;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
    
	@RequestMapping( value = "/about", method =  RequestMethod.GET)
 	public String about(Model model,String name) {
		model.addAttribute("", name);
		model.addAttribute("currentData", new Date().toLocaleString());
		return "about";
	}
	
	@GetMapping("/example-loop")
	public String iteratorHandler(Model model) {
		List<String> nameList = List.of("Sundram","Himanshu","Aman","Minhaz");
		model.addAttribute("",nameList);
		return "about";
	}
	
    @GetMapping("url")
	public String newAbout() {
		return "index";
	}
    
    @GetMapping("contact")
    public String contactUs() {
    	return "contact";
    }
}
 


