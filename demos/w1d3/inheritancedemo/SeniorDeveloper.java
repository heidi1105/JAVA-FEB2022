package com.heidichen.inheritancedemo;

public class SeniorDeveloper extends Developer {
	// attributes, constructor, getters & setters
	private int totalYacht;
	private int teamMembers; 
	
	public SeniorDeveloper() {
		super("boss");
		// if the superclass attributes are "private", use getters setters
		// if the superclass attributes are "protected", use it directly
		super.setSalary(2000000);
		super.totalMonitors = 5;
		this.totalYacht = 1;
		this.teamMembers = 10;	
	}


	public SeniorDeveloper(String name, double salary, int teamMembers) {
		super(name, salary);
		this.teamMembers = teamMembers;
		this.totalYacht = 2;
		super.totalMonitors = teamMembers *2;
		
	}


	public int getTotalYacht() {
		return totalYacht;
	}


	public void setTotalYacht(int totalYacht) {
		this.totalYacht = totalYacht;
	}


	public int getTeamMembers() {
		return teamMembers;
	}


	public void setTeamMembers(int teamMembers) {
		this.teamMembers = teamMembers;
	}
	
    public void displayStatus(){
        System.out.println("--------- SENIOR DISPLAY STATUS ----------");
        System.out.println("Name: " + this.name);
        System.out.println("Health: " + this.health);
        System.out.println("Total monitors: " + this.totalMonitors);
        System.out.println("Salary: " + super.getSalary());
        System.out.println("Total yachts: " + this.totalYacht);
        System.out.println("Total team members: " + this.teamMembers);
    }
    
    public void yellAtOthers() {
    	this.teamMembers =0;
    	System.out.println(this.name + " yelled at others and the whole team quitted. ");
    }
	
    public void getNewTeam(int teamMembers) {
    	this.teamMembers = teamMembers;
    	System.out.println(this.name + " got a new team! She/He has " + this.teamMembers + " new members");
    	
    }
	
	
}
