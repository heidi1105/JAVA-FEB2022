package com.heidichen.routesdemo.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class APIController {
	
	//RequestMapping is defaulted as "Get"
	@RequestMapping("") // auto import : command shift O / Ctrl shift O
	public String index() {
		return "hello I am in API Controller";
	}
	
	@RequestMapping(value="/option2", method=RequestMethod.GET)
	public String option2() {
		return "option 2 get";
	}
	
	//OPTION 3: GetMapping/ PostMapping / PutMapping/ DeleteMapping
	@GetMapping("/getMapping")
	public String option3() {
		return "get mapping";
	}
	
	@GetMapping("/pet")
	public String petDetails(@RequestParam("name") String name) {
		return name;
	}
	
	@GetMapping("/optionalPet")
	public String petDetails2(
			@RequestParam(value="name", required=false)String name, 
			@RequestParam(value="age", required=false)Integer age ) {
		if(name == null) {
			return "No name is available";
		}else {
			return name + " is " + age + " years old.";
		}
	}
	
	@GetMapping("/path/{name}/{age}")
	public String petPath(@PathVariable("name")String name, @PathVariable("age")Integer age) {
		return "Congrats! You did path variables for "+ name+ " and age " + age;
	}
	
	
	// CRUD
	// CREATE:  POST
	// READ :   GET
	// UPDATE:  PUT
	// DELETE:  DELETE
	
}
