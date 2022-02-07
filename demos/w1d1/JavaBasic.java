public class JavaBasic{
    public static void main(String[] args){ // this is the entry point to run the program
        // string, int, float, boolean, character, double

        // variables for an instagram post
        // title -- String needs to be double quote
        String title = "A New Jouney in Java"; // var title = "A New Jour......"
        // likes -- int, Integer  var likes = 50000
        int likes = 50000;
        

        // earning -- double 
        double earning = 9999.0; // var earning = 9999.0

        // difficulty: S,A,B,C,D,E -- characters need to be single quote
        char difficulty = 'A';

        // posted -- boolean
        boolean posted=false;
        
        System.out.println("Title: " + title);
        System.out.println("Likes: " + likes);
        System.out.println("Earning: " + earning);
        System.out.println("Difficulty: " + difficulty);
        System.out.println("posted: " + posted);


        if(posted){
            System.out.println("This is posted");
        }else{
            System.out.println("This is not posted");
        }

        // ------------STRING ---------------
        String creator1 = "Heidi";
        String creator2 = new String("Heidi");
        String creator3 = "Heidi";


        // String -- .length(), String.format(), .indexOf("Keyword") ,  .trim(), .equals
        System.out.println("Title length: " + title.length());

        boolean creatorEqual = creator1.equals(creator2); // == will return false as it will compare the memory address
        System.out.println("Creator1 == creator2 : " + creatorEqual);

        // A new journey in Java was posted by Heidi. It costs $9999.0 if you want me to create it. . 
        // title + "was posted by " + creator1 + ". It costs $" +earning
        System.out.println(title + "  was posted by " + creator1 + ". It costs $"+ earning + " to create it. ");
        // String.format --- %s for string, %.2f 
        System.out.println(String.format("%s was posted by %s. It costs $%.0f to create it", title, "Pepper", earning ));

        //.indexOf -- like a search (-1: cannot find the word; 10: the index of the word)
        System.out.println("position of 'Java' in the title : " + title.indexOf("Java"));

    }


}