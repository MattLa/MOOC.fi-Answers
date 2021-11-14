
import java.util.Scanner;

public class SecondsInADay {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        //Prompt for input
        System.out.println("How many days would you like to convert to seconds?");
        
        //Variable to store the number of days
        int days = Integer.valueOf(scanner.nextLine());
        
        //Print the value to the console
        System.out.println(days * 86400);

    }
}
