package com.example.springdemo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

// automatic import: command + shift + o  
// automatic import: CTRL + shift + o  

@RestController
public class APIController {

	// OPTION 1 RequestMapping default is "get"
	@RequestMapping("/api")
	public String index() {
		return "Hello world2";
	}		
	
	//OPTION 2 
	@RequestMapping(value="/api/option2", method=RequestMethod.GET)
	public String getOption2() {
		return "Option 2 for get";
	}
	
	//OPTION 3 
	@GetMapping("/api/getMapping")
	public String getOption3() {
		return "Option 3 for get: GetMapping";
	}
	
	
	
}
