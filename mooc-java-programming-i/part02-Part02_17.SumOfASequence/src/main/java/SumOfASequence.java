
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Get the last digit from the user
        System.out.println("Last number?");
        int num = Integer.valueOf(scanner.nextLine());
        
        /*
        Instantiate a variable sums to hold the total value
        Loop until the user number and add the value to sum
        */
        
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum += i;
        }
        
        //Print the sum
        
        System.out.println("The sum is " + sum);
        
        /*
        As a while loop
        int count = 1;
        while (count <= num) {
            sum += count;
            count++;
        }
        
        As a do...while loop
        int count = 1;
        do {
            sum += count;
            count++;
        } while(count <= sum);
        */ 
    }
}
