
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Get the factorial from the user
        System.out.println("Give a number:");
        int num = Integer.valueOf(scanner.nextLine());
        
        /*
        Instantiate a variable to hold the running product
        multiply the running product by the count
        */
        int product = 1;
        
        //Check that the user entered at least 1
        //Otherwise product already = 1 and is ready to print.
        if (num >= product) {
            for (int i = 1; i <= num; i++) {
                product *= i;
            }
        }
        System.out.println("Factorial: " + product);
    }
}
