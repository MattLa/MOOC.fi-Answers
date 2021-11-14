
import java.util.Scanner;

public class SumOfTwoNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        
        /*
        Prompt the user for both numbers and setup 2 variables to store the input
        */
        
        System.out.println("Give the first number:");
        int num1 = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int num2 = Integer.valueOf(scanner.nextLine());
        
        //Print the sum to the console
        System.out.println("The sum of the numbers is " + (num1 + num2));

    }
}
