package com.heidichen.sessionformdemo.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

	// -------------- SESSION ---------------
	
	@GetMapping("/getCount")
	public String getCount() {
		return "getCount.jsp";
	}
	
	@GetMapping("/setCount")
	public String setCount(HttpSession session) {
		// check if session has "count"
		if(session.getAttribute("count")==null) { //no count, create count in session
			session.setAttribute("count", 1);
		}else { // count is available, increment count
			Integer count = (Integer) session.getAttribute("count");
			count++;
			session.setAttribute("count", count);
		}
		return "setCount.jsp";
	}
	
	
	// ----------------SEARCH FORM -----------------
	@GetMapping("/search")
	public String searchForm() {
		return "searchForm.jsp";
	}
	
	// processing search form
	@GetMapping("/searchProcess")
	public String searchProcess(@RequestParam("keyword") String keyword, Model model) {
		model.addAttribute("keyword", keyword);
		return "searchResult.jsp";
	}
	
	
	
	// ----------------NORMAL FORM -----------------
	
	// render the form -- get 
	@GetMapping("/basicform")
	public String basicForm() {
		return "basicForm.jsp";
	}
	
	// process the form + store in session + redirect
//	@PostMapping("/processBasicForm")
	@RequestMapping(value="/processBasicForm", method=RequestMethod.POST)
	public String processBasicForm(
			@RequestParam("receiver") String receiver,
			@RequestParam("sender") String sender,
			@RequestParam("amount") Double amount, 
			HttpSession session) {
		session.setAttribute("receiver", receiver);
		session.setAttribute("amount", amount);
		session.setAttribute("sender", sender);
		return "redirect:/basicFormResult";
	}
	
	@GetMapping("/basicFormResult")
	public String basicFormResult(){
		return "basicFormResult.jsp";
	}
	
	
}
