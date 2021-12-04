
import java.util.Scanner;

public class AverageOfPositiveNumbers {

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
            
            /*
            Otherwise if the number is positive add the value to the sum and
            increment count
            */
            if (num > 0) {
                sum += num;
                count++;
            }
        }
        /*
        If no numbers were entered print "cannot calculate the average"
        Otherwise print the average
        */
        if (count == 0) {
            System.out.println("Cannot calculate the average");
        } else {
            System.out.println("Average of the numbers: " + ((double)sum/count));
        }
    }
}
