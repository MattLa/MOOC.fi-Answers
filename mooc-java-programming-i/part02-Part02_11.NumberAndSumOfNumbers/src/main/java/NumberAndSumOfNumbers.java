
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*
        Create a variable to hold the sum and count of numbers entered by the user
        */
        int count = 0;
        int sum = 0;
        
        //Start and infinite loop
        
        while (true) {
            System.out.println("Give a number:");
            int num = Integer.valueOf(scanner.nextLine());
            
            //Break if input is 0
            if (num == 0) {
                break;
            }
            
            //Otherwise add the value to the running total and increment count
            sum += num;
            count++;
        }
        //Print the sum and count
        System.out.println("Number of numbers: " + count);
        System.out.println("Sum of the numbers: " + sum);
    }
}
