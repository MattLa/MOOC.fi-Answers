
import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
        Create a variable to hold the sum of numbers entered by the user
        */
        int sum = 0;
        
        //Start and infinite loop
        
        while (true) {
            System.out.println("Give a number:");
            int num = Integer.valueOf(scanner.nextLine());
            
            //Break if input is 0
            if (num == 0) {
                break;
            }
            
            //Otherwise add the value to the running total
            sum += num;
        }
        //Print the sum
        System.out.println("Sum of the numbers: " + sum);

    }
}
