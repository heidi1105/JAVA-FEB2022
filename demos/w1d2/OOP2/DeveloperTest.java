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



    }
}