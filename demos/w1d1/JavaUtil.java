import java.util.*;

public class JavaUtil{
    public void printHello(){
        System.out.println("Hello from JavaUtil");
    }

    public String greetMessage(){
        return "Hello!";
    }

    // 1 string
    public String greetMessage(String name){
        return "Hello, " + name;
    }

    // 1 int
    public String greetMessage(int age){
        return "Hello, I am " + age + " years old. ";
    }

    // 2 String, 1 int ("Hello, I am Heidi. I like Pepper. She is ___ years old")
    public String greetMessage(String name, String petName, int age){
        return String.format("Hello, I am %s. I like %s. She is %d years old.", name, petName, age);
    }

    public String getCurrentDate(){
        Date d = new Date();
        //option1:
        String dStr = d.toString();
        //option2: chain the string
        String testStr = new Date().toString();
        //option3: ""+d
        return testStr;
    }

    public void printIntArray(int[] numArr){
        for(int i=0;i<numArr.length; i++){
            System.out.println(numArr[i]);
        }
    }

    public void printDoubleArray(double[] numArr){
        for(int i=0;i<numArr.length; i++){
            System.out.println(numArr[i]);
        }
    }

    public void printArrayList(ArrayList<String> strArr){
        //------ for loops -----------
        System.out.println("Option 1");
        for (int i =0; i<strArr.size(); i++){
            System.out.println("Hashtag "+ i + " : "+ strArr.get(i));
        }

        System.out.println("Option 2");   
        for(String element : strArr){
            System.out.println(element);
        }


    }



}

