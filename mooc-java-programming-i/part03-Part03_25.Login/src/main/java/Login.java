
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*
        Get the username and password
        */
        System.out.print("Enter username: ");
        String user = scanner.nextLine();
        System.out.print("Enter password: ");
        String pass = scanner.nextLine();
        
        boolean success = false;
        
        /*
        Check if the username and password grant access.
        */
        
        if (user.equals("alex")) {
            if (pass.equals("sunshine")) {
                success = true;
            }
        }
        
        if (user.equals("emma")) {
            if (pass.equals("haskell")) {
                success = true;
            }
        }
        
        if (success) {
            System.out.println("You have successfully logged in!");
        } else {
            System.out.println("Incorrect username or password!");
        }
    }
}
