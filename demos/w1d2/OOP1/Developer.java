import java.util.ArrayList;
public class Developer{
    // name , health, totalMonitors, salary, 
    public String name;
    public int health;
    public int totalMonitors;
    public double salary;
    public ArrayList<Skill> skills;

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

}