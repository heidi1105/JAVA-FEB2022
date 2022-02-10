package com.heidichen.interfacedemo;

public class PetTest {

	public static void main(String[] args) {
		Cat cat1 = new Cat();
		
		System.out.println("Cat name: " + cat1.getName());
		cat1.giveAffection();
		cat1.begForFood("turkey");
		cat1.begForFood("fish");

		Dog dog1 = new Dog("Charlie", "Corgi", 5);
		dog1.giveAffection();
		dog1.begForFood("beer");		

	}

}
