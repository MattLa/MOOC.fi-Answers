
import java.util.Scanner;

public class SumOfThreeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here

        /*
        Prompt the user for all three numbers and setup 3 variables to store the 
        input
        */
        
        System.out.println("Give the first number:");
        int num1 = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int num2 = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the third number:");
        int num3 = Integer.valueOf(scanner.nextLine());
        
        //Print the sum to the console
        System.out.println("The sum of the numbers is " + (num1 + num2 + num3));
    }
}
