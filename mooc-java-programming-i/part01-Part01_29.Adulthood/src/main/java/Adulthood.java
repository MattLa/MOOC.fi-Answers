
import java.util.Scanner;

public class Adulthood {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here 
        
        //Prompt the user for input
        System.out.println("How old are you?:");
        
        //Instantiate a variable to hold the given number
        int age = Integer.valueOf(scan.nextLine());
        
        //Is the number greater than or equal to 18?
        if(age >= 18) {
            //If yes, they're an adult
            System.out.println("You are an adult");
        } else {
            //Otherwise they are not an adult
            System.out.println("You are not an adult");
        }
    }
}
