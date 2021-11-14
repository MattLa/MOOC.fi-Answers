
import java.util.Scanner;

public class Orwell {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here
        
        //Prompt the user for input
        System.out.println("Give a number:");
        
        //Instantiate a variable to hold the given number
        int num = Integer.valueOf(scan.nextLine());
        
        //Is the number equivalent to 1984?
        if(num == 1984) {
            //If yes, print Orwell
            System.out.println("Orwell");
        }
    }
}
