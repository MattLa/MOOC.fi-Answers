
import java.util.Scanner;

public class MessageThreeTimes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write a message:");
        // Write your program here
        
        /*
        Get the message from the user
        */
        String message = scanner.nextLine();
        
        /*
        Print the message to the console 3 times using 3 println calls
        */
        System.out.println(message);
        System.out.println(message);
        System.out.println(message);

    }
}
