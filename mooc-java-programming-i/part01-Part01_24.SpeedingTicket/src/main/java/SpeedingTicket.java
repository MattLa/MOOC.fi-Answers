
import java.util.Scanner;

public class SpeedingTicket {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here. 
        
        //Prompt the user for input
        System.out.println("Give speed:");
        int speed = Integer.valueOf(scanner.nextLine());
        
        //Is input greater than 120?
        if (speed > 120) {
            //If so, print speeding ticket
            System.out.println("Speeding ticket!");
        }
    }
}
