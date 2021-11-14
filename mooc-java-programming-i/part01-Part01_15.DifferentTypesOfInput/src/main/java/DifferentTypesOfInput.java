
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here
        //Prompt for the input
        System.out.println("Give a string:");
        
        //Variable to store the string input
        String str = scan.nextLine();
        
        //Prompt for the input
        System.out.println("Give an integer:");
        
        //Variable to store the integer input
        int num1 = Integer.valueOf(scan.nextLine());
        
        //Prompt for the input
        System.out.println("Give a double:");
        
        //Variable to store the double input
        double num2 = Double.valueOf(scan.nextLine());
        
        //Prompt for the input
        System.out.println("Give a boolean:");
        
        //Variable to store the boolean input
        boolean bool = Boolean.valueOf(scan.nextLine());
        
        //Print the value to the console
        System.out.println("You gave the string " + str);
        System.out.println("You gave the integer " + num1);
        System.out.println("You gave the double " + num2);
        System.out.println("You gave the boolean " + bool);

    }
}
