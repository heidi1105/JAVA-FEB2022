package com.heidichen.inheritancedemo;

public class Developer {
	// attributes, constructors, getters & setters
    protected String name;
    protected int health;
    protected int totalMonitors;
    private double salary;
    
    // --------- CONSTRUCTORS ---------------
    
    public Developer(){ // CONSTRUCTOR 1
        this.name = "A developer";
        this.health =100;
        this.totalMonitors = 1;
        this.salary= 900000;
    }
    
    // CONSTRUCTOR 2
	public Developer(String name){ 
        this.name = name;
        this.health =150;
        this.totalMonitors = 2;
        this.salary= 1000000;
    }

	// CONSTRUCTOR 3
	public Developer(String name, double salary) {
		this.name = name;
        this.health =200;
        this.totalMonitors = 3;
		this.salary = salary;
	}

	
	// --------- GETTERS & SETTERS ---------------
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public int getTotalMonitors() {
		return totalMonitors;
	}

	public void setTotalMonitors(int totalMonitors) {
		this.totalMonitors = totalMonitors;
	}



	public double getSalary() {
		return salary;
	}



	public void setSalary(double salary) {
		this.salary = salary;
	}

	public void getFrustrated() {
		this.health -= 10;
		System.out.println(this.name + " get frustrated. -10 in health!");
	}
	
	public void drinkWater() {
		this.health += 10;
		System.out.println(this.name + " drank water. +10 in health!");
	}
	
    public void displayStatus(){
        System.out.println("--------- DEVELOPER DISPLAY STATUS ----------");
        System.out.println("Name: " + this.name);
        System.out.println("Health: " + this.health);
        System.out.println("Total monitors: " + this.totalMonitors);
        System.out.println("Salary: " + this.salary);

    }

	
    
    
}
