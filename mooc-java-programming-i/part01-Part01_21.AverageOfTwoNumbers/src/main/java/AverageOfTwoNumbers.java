
import java.util.Scanner;

public class AverageOfTwoNumbers {

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
        
        //Calculate the average
        double average = (double)(num1 + num2) / 2;
        
        //Print the average to the console
        System.out.println("The average is " + average);

    }
}
