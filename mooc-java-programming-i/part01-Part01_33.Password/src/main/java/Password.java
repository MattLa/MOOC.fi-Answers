
import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here 
        //The password we are looking for
        String passWord = "Caput Draconis";
        
        /*
        Get input from the user
        */
        
        System.out.println("Password?");
        String password = scan.nextLine();
        
        //Check to see if the given password is correct
        if (password.equals(passWord)) {
            System.out.println("Welcome!");
        } else {
            System.out.println("Off with you!");
        }
    }
}
