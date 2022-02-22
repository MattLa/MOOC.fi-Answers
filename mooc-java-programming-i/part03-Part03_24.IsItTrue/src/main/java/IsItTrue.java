
import java.util.Scanner;

public class IsItTrue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*
        Get a string from the user
        */
        System.out.print("Give a String: ");
        String st = scanner.nextLine();
        
        //If user input is 'true'
        if (st.equals("true")) {
            System.out.println("You got it right!");
        } else {
            System.out.println("Try again!");
        }
    }
}
