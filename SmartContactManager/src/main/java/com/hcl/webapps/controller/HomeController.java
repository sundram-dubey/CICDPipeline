package com.hcl.webapps.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.hcl.webapps.dao.UserRepository;
import com.hcl.webapps.entity.User;
import com.hcl.webapps.helper.Message;

@Controller
public class HomeController {

	@Autowired
	UserRepository userrepo;
	@GetMapping("/")
	public String home() {
		return "home01";
	}

	@GetMapping("/about")
	public String about() {
		return "about01";
	}

	@GetMapping("/signup")
	public String signup() {
		return "signup";
	}

	@PostMapping("/do_register")
	public String registerUser(@ModelAttribute("user") User user,
			@RequestParam(value = "agreement", defaultValue = "false") boolean agreement, Model model, HttpSession session, HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
	try {
		System.out.println(user);
		System.out.println(agreement);
		if(!agreement) {
			System.out.println("you hav'nt cliked check box ;(");
			throw new Exception("you have not agreeded the t&c"); 
		}
		user.setRole("Role_User");
		user.setEnabled(true);
		User result = this.userrepo.save(user);
		System.out.println(result);
		return "signup";
	}
	catch(Exception e) {
		model.addAttribute("user", user);
		String destination = "/jspPages/signup.jsp";
		RequestDispatcher requestDispatcher = req.getRequestDispatcher(destination);
		req.setAttribute("message", new Message("Something went wrong"+e.getMessage(),"alert-error"));
		requestDispatcher.include(req, res);
		System.out.println(e.getLocalizedMessage()+" Message "  );
		e.printStackTrace();
	}
		return "signup";
	}
}
