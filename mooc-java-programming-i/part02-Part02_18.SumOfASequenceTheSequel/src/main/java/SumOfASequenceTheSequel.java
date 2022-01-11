
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Get the start and end digits from the user
        System.out.println("First number?");
        int start = Integer.valueOf(scanner.nextLine());
        System.out.println("Last number?");
        int end = Integer.valueOf(scanner.nextLine());
        
        /*
        Instantiate a variable sums to hold the total value
        Loop until the user number and add the value to sum
        */
        
        int sum = 0;
        for (int i = start; i <= end; i++) {
            sum += i;
        }
        
        //Print the sum
        
        System.out.println("The sum is " + sum);
        
        /*
        As a while loop
        while (start <= end) {
            sum += start;
            start++;
        }
        
        As a do...while loop
        do {
            sum += start;
            start++;
        } while(start <= end);
        */ 
    }
}
