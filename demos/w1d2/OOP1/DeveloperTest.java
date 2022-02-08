import java.util.ArrayList;
public class DeveloperTest{
    public static void main(String[] args){
        Developer dev1 = new Developer();
        dev1.name = "Heidi";
        dev1.health = 200;
        dev1.totalMonitors = 1;
        dev1.salary = 1000000;
        // dev1.displayStatus();

        Developer dev2 = new Developer();
        dev2.name = "Kevni";
        dev2.health = 420;
        dev2.totalMonitors = 3;
        dev2.salary = 9000000;
        // dev2.displayStatus();




        Skill skill1 = new Skill();
        skill1.skillName = "debugging";
        skill1.level = 3;

        Skill skill2 = new Skill();
        skill2.skillName = "breaking the code";
        skill2.level = 22;

        Skill skill3 = new Skill();
        skill3.skillName = "typing";
        skill3.level = 5;

        dev1.skills = new ArrayList<Skill>();
        dev1.skills.add(skill1);
        dev1.skills.add(skill2);
        dev1.skills.add(skill3);
        dev1.displayStatus();


    }
}