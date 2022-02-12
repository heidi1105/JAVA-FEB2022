package com.heidichen.sessiondemo.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	// home to display session (it never creates any session
	// count for creating and incrementing session
	
	@GetMapping("/")
	public String home() {
		return "home.jsp";
	}
	
	@GetMapping("/count")
	public String count(HttpSession session) {
		if(session.getAttribute("count")==null) { //session is not available
			session.setAttribute("count", 1);
		}else {
			Integer tempCount = (Integer) session.getAttribute("count");
			session.setAttribute("count", tempCount+1);
		}
		
		return "count.jsp";
	}
}
