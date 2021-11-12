
import java.util.Scanner;

public class Message {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write a message:");
        // Write your program here
        //A variable of type String which will be used to hold the message from
        //the user
        String message = "";
        
        //Get that input here using the provided scanner
        message = scanner.nextLine();
        
        //Print the message to the console
        System.out.println(message);

    }
}
