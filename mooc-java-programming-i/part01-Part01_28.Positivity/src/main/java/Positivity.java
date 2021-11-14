
import java.util.Scanner;

public class Positivity {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here
        
        //Prompt the user for input
        System.out.println("Give a number:");
        
        //Instantiate a variable to hold the given number
        int num = Integer.valueOf(scan.nextLine());
        
        //Is the number greater than 0?
        if(num > 0) {
            //If yes, print The number is positive
            System.out.println("The number is positive.");
        } else {
            //Otherwise the number must be negative
            System.out.println("The number is not positive.");
        }
    }
}
