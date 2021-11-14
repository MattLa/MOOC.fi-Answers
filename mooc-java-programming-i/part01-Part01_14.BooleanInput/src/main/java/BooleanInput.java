
import java.util.Scanner;

public class BooleanInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // write your program here
        //Prompt for the input
        System.out.println("Write something:");
        
        //Variable to store the boolean input
        boolean bool = Boolean.valueOf(scanner.nextLine());
        
        //Print the value to the console
        System.out.println("True or false? " + bool);

    }
}
