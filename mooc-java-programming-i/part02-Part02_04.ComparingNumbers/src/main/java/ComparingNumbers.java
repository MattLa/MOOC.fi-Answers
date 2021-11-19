
import java.util.Scanner;

public class ComparingNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*
        Get two integers from the user
        */
        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        
        //If the numbers are equal
        if (num1 == num2) {
            System.out.println(num1 + " is equal to " + num2 + ".");
        //Else if number 1 is less than number 2
        } else if (num1 < num2) {
            System.out.println(num1 + " is smaller than " + num2 + ".");
        //Otherwise number 1 MUST be greater than 2
        } else {
            System.out.println(num1 + " is greater than " + num2 + ".");
        }
    }
}
