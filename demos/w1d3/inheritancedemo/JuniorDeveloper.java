package com.heidichen.inheritancedemo;

public class JuniorDeveloper extends Developer {
	public JuniorDeveloper() {
		super();
		super.setSalary(0);
	}
	
	public JuniorDeveloper(String name) {
		super(name);
		super.setSalary(1000);
	}
	
	
		
}
