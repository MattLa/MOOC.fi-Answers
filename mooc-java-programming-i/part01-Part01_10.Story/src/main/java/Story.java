
import java.util.Scanner;

public class Story {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        //Prompt the user for some information
        
        System.out.println("I will tell you a story, but I need some information first.");
        System.out.println("What is the main character called?");
        
        //Store the name in a String type variable
        String name = scanner.nextLine();
        
        //Store the job in it's own variable. We are using this info again.
        System.out.println("What is their job?");
        String job = scanner.nextLine();
        
        //Tell a little story. Dont forget to concatenate the name and job
        System.out.println("Here is the story:");
        System.out.println("Once upon a time there was " + name + ", who was " + job + ".");
        System.out.println("On the way to work, " + name + " reflected on life.");
        System.out.println("Perhaps " + name + " will not be " + job + " forever.");

    }
}
