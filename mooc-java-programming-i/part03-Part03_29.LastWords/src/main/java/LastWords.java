
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Start an infinite loop
        while(true) {
            //Get input from the user
            String input = scanner.nextLine();
            //End and halt if the input is empty
            if (input.isEmpty()) {
                break;
            }
            //Split the input using a single white space as a delimiter
            String[] parts = input.split(" ");
            //Print the last word
            System.out.println(parts[parts.length - 1]);
        }
    }
}
