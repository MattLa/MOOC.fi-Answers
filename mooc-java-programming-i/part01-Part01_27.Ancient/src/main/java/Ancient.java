
import java.util.Scanner;

public class Ancient {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here
        
        //Prompt the user for input
        System.out.println("Give a year:");
        
        //Instantiate a variable to hold the given number
        int year = Integer.valueOf(scan.nextLine());
        
        //Is the number less than 2015?
        if(year < 2015) {
            //If yes, print Ancient history!
            System.out.println("Ancient history!");
        }
    }
}
