package com.heidichen.sessionformdemo.controllers;

import java.util.Date;

import javax.servlet.http.HttpSession;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

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
	@GetMapping("/basicForm")
	public String basicForm() {
		return "basicForm.jsp";
	}
	
	// process the form + store in session + redirect
//	@PostMapping("/processBasicForm")
	@RequestMapping(value="/processBasicForm", method=RequestMethod.POST)
	public String processBasicForm(
			@RequestParam("receiver") String receiver,
			@RequestParam("sender") String sender,
			@RequestParam(value="amount", required=false) Double amount, 
			HttpSession session,
			RedirectAttributes redirectAttributes) {
		if(receiver=="" ) {
			redirectAttributes.addFlashAttribute("error", "All fields are required");
			return "redirect:/basicForm";
		}
		
		
		session.setAttribute("receiver", receiver);
		session.setAttribute("amount", amount);
		session.setAttribute("sender", sender);
		return "redirect:/basicFormResult";
	}
	
	@GetMapping("/basicFormResult")
	public String basicFormResult(){
		return "basicFormResult.jsp";
	}
	
	
	// ----------------RESERVATION FORM -----------------
	// 1. render the form
	@GetMapping("/advancedForm")
	public String advancedForm() {
		return "advancedForm.jsp";
	}
	
	// 2. process the form
	@PostMapping("/advancedForm")
	public String processAdvancedForm(
			@RequestParam("name") String name,
			@RequestParam("people") Integer people,
			@RequestParam("resDate") @DateTimeFormat(pattern="yyyy-MM-dd") Date resDate,
			@RequestParam("resTime") @DateTimeFormat(pattern="HH:mm") Date resTime,
			HttpSession session
			) {
		session.setAttribute("name", name);
		session.setAttribute("people", people);
		session.setAttribute("resDate", resDate);
		session.setAttribute("resTime", resTime);
		
		// date: 2022-03-04
		return "redirect:/advancedResult";
	}
	
	
	// 3. show the result
	@GetMapping("/advancedResult")
	public String advancedResult() {
		return "advancedResult.jsp";
	}
	
}











