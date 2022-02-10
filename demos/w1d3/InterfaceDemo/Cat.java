package com.heidichen.interfacedemo;

public class Cat extends Pet implements Keepable {

	public Cat() {
		super();
		this.name="Stray cat";
	}
	
	

	public Cat(String name, String breed, int age) {
		super(name, breed, age);
	}



	public void giveAffection() {
		System.out.println(this.name + " purrrrrrrrrrrrrrrrrrs");
		
	}

	public void begForFood(String food) {
		if(food == "turkey") {
			System.out.println(this.name + " is stealing your turkey.");
		}else {
			System.out.println(this.name + " is waiting for the food, you slave!");
		}
		
	}

}
