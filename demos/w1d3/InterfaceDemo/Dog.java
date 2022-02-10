package com.heidichen.interfacedemo;

public class Dog extends Pet implements Keepable {

	public Dog() {
		super();
		this.name="Stray dog";
	}

	public Dog(String name, String breed, int age) {
		super(name, breed, age);
		// TODO Auto-generated constructor stub
	}


	public void giveAffection() {
		System.out.println(this.name + " is hugging you!");
		// TODO Auto-generated method stub

	}


	public void begForFood(String food) {
		System.out.println(this.name + " has that puppy eyes. Time for some "+ food);
	}

}
