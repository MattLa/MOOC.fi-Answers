
import java.util.Scanner;

public class IntegerInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // write your program here
        //Prompt for the input
        System.out.println("Give a number:");
        
        //Variable to store the number input
        int number = Integer.valueOf(scanner.nextLine());
        
        //Print the value to the console
        System.out.println("You gave the number " + number);

    }
}
