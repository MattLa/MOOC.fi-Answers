
import java.util.Scanner;

public class Conversation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        //Prompt the user for input with a greeting
        System.out.println("Greetings! How are you doing?");
        
        //Get input from the user
        String response = scanner.nextLine();
        
        //A canned response prompting for more input
        System.out.println("Oh, how interesting. Tell me more!");
        
        //Use the same variable to save some space. We aren't doing anything with
        //the responses anyways
        response = scanner.nextLine();
        
        //Thank the user for their time!
        System.out.println("Thanks for sharing!");

    }
}
