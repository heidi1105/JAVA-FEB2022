package com.heidichen.firstmvcdemo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.heidichen.firstmvcdemo.models.Icecream;
import com.heidichen.firstmvcdemo.services.IcecreamService;

@Controller
public class HomeController {
	
	@Autowired
	private IcecreamService icecreamService;
	
	@GetMapping("/icecreams")
	public String dashboard(Model model) {
		List<Icecream> icecreams = icecreamService.allIcecreams();
		model.addAttribute("icecreams", icecreams);
		return "dashboard.jsp";
	}
	
	@GetMapping("/icecreams/{id}")
	public String showOneIcecream(@PathVariable("id")Long id, Model model) {
		Icecream icecream = icecreamService.findIcecream(id);
		model.addAttribute("icecream", icecream);
		return "showOne.jsp";
	}
	
}
