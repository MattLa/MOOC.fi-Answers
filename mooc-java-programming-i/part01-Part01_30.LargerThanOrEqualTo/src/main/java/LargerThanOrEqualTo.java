
import java.util.Scanner;

public class LargerThanOrEqualTo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        /*
        Prompt the user for both numbers and setup 2 variables to store the input
        */
        
        System.out.println("Give the first number:");
        int num1 = Integer.valueOf(scan.nextLine());
        System.out.println("Give the second number:");
        int num2 = Integer.valueOf(scan.nextLine());
        
        //If the numbers are equal
        if (num1 == num2) {
            System.out.println("The numbers are equal!");
        //Else if number 1 is greater
        } else if(num1 > num2) {
            System.out.println("Greater number is: " + num1);
        //Otherwise number 2 MUST be greater
        } else {
            System.out.println("Greater number is: " + num2);
        }
    }
}
