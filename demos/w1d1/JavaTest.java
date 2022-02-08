import java.util.ArrayList;

public class JavaTest{

    public static void main(String[] args){
        //dependency injection / class instantiation
        JavaUtil utilApp = new JavaUtil(); 

        utilApp.printHello();

        String greet1 = utilApp.greetMessage();
        System.out.println(greet1);

        String greetSomeone = utilApp.greetMessage("Pepper");
        System.out.println(greetSomeone);

        String greetAge = utilApp.greetMessage(13);
        System.out.println(greetAge);

        String complicatedGreet = utilApp.greetMessage("Heidi", "Pepper", 13);
        System.out.println(complicatedGreet);

        String current = utilApp.getCurrentDate();
        System.out.println(current);

        //type casting
        // implicit casting (no loss of data)
        int intPrice = 50;
        double intToDoublePrice = intPrice;
        System.out.println(intToDoublePrice);

        //explicit casting (invole loss of data)
        double doublePrice = 19.99;
        int doubleToIntPrice = (int) doublePrice;
        System.out.println(doubleToIntPrice);

        Integer testNullClass = null;
        // int testNullPri = null;

        // Arrays --> datatype of the array!!!!!!!!!
        // array to store likes per day (5 days)

        // option 1
        int[] likesPerDay = {100,200,500,1000,2000};
        // option 2
        double[] earningPerDay = new double[5];
        earningPerDay[0] = 1000;

        // utilApp.printIntArray(likesPerDay);
        // utilApp.printDoubleArray(earningPerDay);

        //Dynamic array --> ArrayList<Type> 
        ArrayList<String> hashtag = new ArrayList<String>();
        // .add() ,  .get(), .set(pos, num), .size(), .contains()
        System.out.println("Hashtag size: " +hashtag.size());
        hashtag.add("codingdojo");
        hashtag.add("java");
        hashtag.add("Heidi");
        hashtag.add("Pepper's life");
        System.out.println("First hashtag: " +hashtag.get(0));
        System.out.println("Contains java: " +hashtag.contains("java"));
        hashtag.set(3, "No pineapple on a pizza");
        System.out.println("Fourth hashtag: " +hashtag.get(3));
        // hashtag.remove(3);

        //need to be an object type
        ArrayList<Integer> intArrayList = new ArrayList<Integer>();

        ArrayList<Object> objectArrayList = new ArrayList<Object>();
        objectArrayList.add(10);
        objectArrayList.add("Heidi");
        objectArrayList.add(50.55);

        utilApp.printArrayList(hashtag);



    }
}