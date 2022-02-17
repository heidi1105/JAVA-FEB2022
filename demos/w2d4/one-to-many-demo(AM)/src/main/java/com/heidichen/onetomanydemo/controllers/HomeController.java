package com.heidichen.onetomanydemo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.heidichen.onetomanydemo.models.User;

@Controller
public class HomeController {

	//create a user (1. render the form, 2. process the form)
	@GetMapping("/users/new")
	public String createUserForm(@ModelAttribute("user")User user) {
		return "createUser.jsp";
	}
}
