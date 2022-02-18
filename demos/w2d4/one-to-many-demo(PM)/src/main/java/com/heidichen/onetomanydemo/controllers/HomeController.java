package com.heidichen.onetomanydemo.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.heidichen.onetomanydemo.models.Gift;
import com.heidichen.onetomanydemo.models.User;
import com.heidichen.onetomanydemo.services.MainService;

@Controller
public class HomeController {
	
	@Autowired
	private MainService mainService;

	//create a user (1. render the form, 2. process the form)
	@GetMapping("/users/new")
	public String createUserForm(@ModelAttribute("user")User user) {
		return "createUser.jsp";
	}
	
	//process the form
	@PostMapping("/users/new")
	public String createUserProcess(
			@Valid @ModelAttribute("user")User user, BindingResult result) {
		if(result.hasErrors()) { //HAVE ERROR, NEED TO RENDER THE ERRORS TO THE PAGE
			return "createUser.jsp";
		}else { // NO ERROR
			mainService.saveUser(user);
			return "redirect:/users/new";
		}
	}
	
	// create a gift (render the form, process the form)
	@GetMapping("/gifts/new")
	public String createGiftForm(@ModelAttribute("gift") Gift gift, Model model) {
		//OPTION 1
		List<User> users = mainService.allUsers();
		model.addAttribute("users", users);
		// OPTION 2
//		model.addAttribute("users", mainService.allUsers());
		return "createGift.jsp";
	}
	
	@PostMapping("/gifts/new")
	public String createGiftProcess(@Valid @ModelAttribute("gift")Gift gift, BindingResult result, Model model) {
		if(result.hasErrors()) {
			List<User> users = mainService.allUsers();
			model.addAttribute("users", users);			
			return "createGift.jsp";
		}else {
			mainService.saveGift(gift);
			return "redirect:/gifts";
		}
	}
	
	@GetMapping("/gifts")
	public String giftDashboard(Model model) {
		List<Gift> gifts = mainService.allGifts();
		model.addAttribute("gifts", gifts);
		return "allGifts.jsp";
	}
	
	@GetMapping("/users/{userId}")
	public String showOneUser(@PathVariable("userId")Long userId, Model model) {
		User user = mainService.oneUser(userId);
		model.addAttribute("user", user);
		return "oneUser.jsp";
	}
	
	
}











