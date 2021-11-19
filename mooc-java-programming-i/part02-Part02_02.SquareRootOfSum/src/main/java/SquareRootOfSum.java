
import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        /*
        The server doe not expect a prompt for input. Simply make a couple 
        variables to accept input.
        */
        int num1 = Integer.valueOf(scanner.nextLine());
        int num2 = Integer.valueOf(scanner.nextLine());
        
        /*
        Now add the numbers together and print the square root of the sum.
        */
        
        System.out.println(Math.sqrt(num1 + num2));

    }
}
