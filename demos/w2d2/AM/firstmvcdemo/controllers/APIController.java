package com.heidichen.firstmvcdemo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.heidichen.firstmvcdemo.models.Icecream;
import com.heidichen.firstmvcdemo.services.IcecreamService;

@RestController
public class APIController {

	@Autowired
	private IcecreamService icecreamService;
	
	// FindAll
	@GetMapping("/api/icecreams")
	public List<Icecream> showAll(){
		return icecreamService.allIcecreams();
	}
	
	// Create
	@PostMapping("/api/icecreams")
	public Icecream createIcecream(
			@RequestParam("flavor")String flavor,
			@RequestParam("price")Double price,
			@RequestParam("description") String description
			) {
		Icecream icecream = new Icecream(flavor, price, description);
		return icecreamService.createIcecream(icecream);
	}
	
	
	// showOne
	
	//updateOne
	
	//deleteOne
	
	
}
