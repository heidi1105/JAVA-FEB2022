package com.heidichen.inheritancedemo;

public class DeveloperTest {

	public static void main(String[] args) {
		SeniorDeveloper s1 = new SeniorDeveloper();
		s1.displayStatus();
		
		SeniorDeveloper s2 = new SeniorDeveloper("Wiji", 3000000, 20);
		s2.displayStatus();
		
		Developer dev1 = new Developer("John Doe");
		dev1.displayStatus();
				
		JuniorDeveloper j1 = new JuniorDeveloper("Pepper");
		j1.displayStatus();
		
		s1.getFrustrated();
		s2.getFrustrated();
		j1.getFrustrated();
		j1.drinkWater();
		j1.displayStatus();
		
		s2.yellAtOthers();
		s2.displayStatus();
		s2.getNewTeam(40);
		
	}

}
