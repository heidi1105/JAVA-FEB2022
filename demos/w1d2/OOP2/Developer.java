import java.util.ArrayList;
public class Developer{
    // name , health, totalMonitors, salary, 
    private String name;
    private int health;
    private int totalMonitors;
    private double salary;
    private ArrayList<Skill> skills;



    //CONSTRUCTOR
    public Developer(){
        this.name = "A developer";
        this.health =100;
        this.totalMonitors = 1;
        this.salary= 900000;
        this.skills = new ArrayList<Skill>();
    }

    public Developer(String name){
        this.name = name;
        this.health =150;
        this.totalMonitors = 2;
        this.salary= 1000000;
        this.skills = new ArrayList<Skill>();
    }

    public Developer(String name, int health){
        this.name = name;
        this.health =health;
        this.totalMonitors = 3;
        this.salary= 1100000;
        this.skills = new ArrayList<Skill>();
    }


    // displayStatus method
    public void displayStatus(){
        System.out.println("--------- DISPLAY STATUS ----------");
        System.out.println("Name: " + this.name);
        System.out.println("Health: " + this.health);
        System.out.println("Total monitors: " + this.totalMonitors);
        System.out.println("Salary: " + this.salary);
        for(Skill s: this.skills){
            System.out.println("Skill: " + s.skillName + " | Level: " + s.level);
        }
    }

    //getter -- no parameters , with return 
    public String getName(){
        return this.name;
    }
    //setter -- have parameter, no return
    public void setName(String name){
        this.name= name;
    }

    //getter -- no parameters , with return 
    public double getSalary(){
        return this.salary;
    }
    //setter -- have parameter, no return
    public void setSalary(double salary){
        this.salary= salary;
    }
    //getter -- no parameters , with return 
    public int getHealth(){
        return this.health;
    }
    //setter -- have parameter, no return
    public void setHealth(int health){
        this.health= health;
    }
    //getter -- no parameters , with return 
    public int getTotalMonitors(){
        return this.totalMonitors;
    }
    //setter -- have parameter, no return
    public void setTotalMonitors(int totalMonitors){
        this.totalMonitors= totalMonitors;
    }

    

}