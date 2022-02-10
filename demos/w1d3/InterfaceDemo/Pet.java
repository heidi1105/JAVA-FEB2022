package com.heidichen.interfacedemo;

public class Pet {

	//attributes
	protected String name;
	protected String breed;
	protected int age;
	
	// constructors
	public Pet() {
		this.name="Stray pet";
		this.breed = "Unknown";
	}
	
	public Pet(String name, String breed, int age) {
		this.name = name;
		this.breed = breed;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	// getters & setters
	
	

}
