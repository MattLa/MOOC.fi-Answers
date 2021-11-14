
import java.util.Scanner;

public class DoubleInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // write your program here
        //Prompt for the input
        System.out.println("Give a number:");
        
        //Variable to store the number input
        double number = Double.valueOf(scanner.nextLine());
        
        //Print the value to the console
        System.out.println("You gave the number " + number);
    }
}
