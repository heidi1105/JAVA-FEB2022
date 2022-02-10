import java.util.ArrayList;
public class DeveloperTest{
    public static void main(String[] args){
        Developer dev1 = new Developer();    
        Developer dev2 = new Developer("Kevni");
        Developer dev3 = new Developer("Heidi", 200);

        dev1.setName("Another developer");
        dev1.displayStatus();
        dev2.displayStatus();
        dev3.displayStatus();
        System.out.println(dev3.getName());

        Skill skill1 = new Skill("Debugging");
        Skill skill2 = new Skill("Breaking the code", 22);
        Skill skill3 = new Skill("typing", 5);

        dev1.addToSkills(skill1);
        dev1.addToSkills(skill2);
        dev1.addToSkills(skill3);

        dev1.displayStatus();
        
        // System.out.println("Dev count: " + Developer.getDevCount());
        // System.out.println("Total Salary: " + Developer.getTotalSalary());

        ArrayList<String> toDoList = new ArrayList<String>();
        toDoList.add("Do Laundry");
        toDoList.add("Get milk");
        System.out.println(toDoList);

        String[] testing = {"abc", "ccc" , "bbb"};
System.out.println(testing);
    }
}