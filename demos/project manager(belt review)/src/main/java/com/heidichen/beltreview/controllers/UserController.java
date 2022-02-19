package com.heidichen.beltreview.controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.heidichen.beltreview.models.LoginUser;
import com.heidichen.beltreview.models.User;
import com.heidichen.beltreview.services.UserService;

@Controller
public class UserController {
	@Autowired
	private UserService userService;

	// index for log & reg forms (2 forms - newUser, newLogin)
	@GetMapping("/")
	public String index(Model model) {
		model.addAttribute("newUser", new User());
		model.addAttribute("newLogin", new LoginUser());
		return "index.jsp";
	}

	// register (post)
	@PostMapping("/register")
	public String register(@Valid @ModelAttribute("newUser") User newUser, BindingResult result, Model model,
			HttpSession session) {

		// 1. call a register method in the service
		userService.register(newUser, result);

		if (result.hasErrors()) { // 2. with errors?
			model.addAttribute("newLogin", new LoginUser());
			return "index.jsp";
		}

		// No errors!
		// set session & redirect
		session.setAttribute("userId", newUser.getId());
		return "redirect:/dashboard";
	}

	// login (post)
	@PostMapping("/login")
	public String login(@Valid @ModelAttribute("newLogin") LoginUser newLogin, BindingResult result, Model model,
			HttpSession session) {
		// 1. call a login method in the service
		User user = userService.login(newLogin, result);
		// 2. with errors? render the page with errors
		if (result.hasErrors()) {
			model.addAttribute("newUser", new User());
			return "index.jsp";
		}
		session.setAttribute("userId", user.getId());
		return "redirect:/dashboard";
		// 3. no errors? redirect and set session
	}
	
	@GetMapping("/logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "redirect:/";
	}
	

}
