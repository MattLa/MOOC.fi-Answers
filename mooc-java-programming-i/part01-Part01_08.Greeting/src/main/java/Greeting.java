
import java.util.Scanner;

public class Greeting {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        /*
        Prompt the user for their name
        */
        System.out.println("What's your name?");
        
        /*
        Get the user input. Strong in a String variable
        */
        String name = scanner.nextLine();
        
        /*
        Print a greeting to the console. 
        Concatenate 'Hi ' to the start of the response.
        */
        
        System.out.println("Hi " + name);

    }
}
