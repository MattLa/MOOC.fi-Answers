
import java.util.Scanner;

public class AdditionFormula {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // write your program here
        
        /*
        Prompt the user for both numbers and setup 2 variables to store the input
        */
        
        System.out.println("Give the first number:");
        int num1 = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int num2 = Integer.valueOf(scanner.nextLine());
        
        //Print the sum to the console
        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
    }
}
