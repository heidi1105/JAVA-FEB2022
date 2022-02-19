package com.heidichen.beltdemo.controllers;

import java.util.List;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.heidichen.beltdemo.models.Gift;
import com.heidichen.beltdemo.models.User;
import com.heidichen.beltdemo.services.GiftService;
import com.heidichen.beltdemo.services.UserService;

@Controller
public class HomeController {
	
	@Autowired
	private GiftService giftService;

	@Autowired
	private UserService userService;
	
	
	// 
    @GetMapping("/dashboard")
    public String dashboard(HttpSession session, Model model) {
    	List<Gift> gifts = giftService.allGifts();
    	model.addAttribute("gifts", gifts);
    	if(session.getAttribute("userId")==null) {
    		return "redirect:/";
    	}
    	return "dashboard.jsp";
    }
    
    // create (1. render the form, 2. process the form)
    @GetMapping("/gifts/new")
    public String createGiftForm(@ModelAttribute("gift") Gift gift, Model model) {
    	model.addAttribute("users", userService.allUsers());
    	return "createGift.jsp";
    }
    
	@PostMapping("/gifts/new")
	public String createGiftProcess(@Valid @ModelAttribute("gift")Gift gift, BindingResult result, Model model) {
		if(result.hasErrors()) {
			List<User> users = userService.allUsers();
			model.addAttribute("users", users);			
			return "createGift.jsp";
		}else {
			giftService.createGift(gift);
			return "redirect:/dashboard";
		}
	}
    
    
    // get one
	@GetMapping("/gifts/{id}")
	public String getOneGift(@PathVariable("id")Long id, Model model) {
		Gift gift = giftService.oneGift(id);
		model.addAttribute("gift", gift);
		return "showOneGift.jsp";
	}
    
    
    // edit (showOne & create)
	@GetMapping("/gifts/edit/{id}")
	public String editGiftForm(@PathVariable("id")Long id, Model model) {
		Gift gift = giftService.oneGift(id);
		model.addAttribute("users", userService.allUsers());
		model.addAttribute("gift", gift);
		return "editGift.jsp";
	}
	
	@PutMapping("/gifts/edit/{id}")
	public String editGiftProcess(@Valid @ModelAttribute("gift")Gift gift, BindingResult result, Model model) {
		if(result.hasErrors()) {
			List<User> users = userService.allUsers();
			model.addAttribute("users", users);			
			return "editGift.jsp";
		}else {
			giftService.updateGift(gift);
			return "redirect:/dashboard";
		}
	}
    
	
	
    
    // delete
	@DeleteMapping("/gifts/{id}")
	public String deleteGift(@PathVariable("id")Long id) {
		giftService.deleteGift(id);
		return "redirect:/dashboard";
	}
	
	
	
	
	
	
}
