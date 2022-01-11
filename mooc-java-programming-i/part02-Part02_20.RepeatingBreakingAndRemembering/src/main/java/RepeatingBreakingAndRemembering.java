
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        
        // This exercise is worth five exercise points, and it is 
        // gradually extended part by part.
        
        // If you want, you can send this exercise to the server
        // when it's just partially done. In that case the server will complain about 
        // the parts you haven't done, but you'll get points for the finished parts.
        
        Scanner scanner = new Scanner(System.in);
        
        /*
        Instantiate variables to hold values for sum, count, and even numbers
        */
        int sum = 0;
        int count = 0;
        int even = 0;
        
        /*
        Ask the user to type some numbers. Entering -1 quits.
        */
        
        System.out.println("Give numbers:");
        
        while(true) {
            int num = Integer.parseInt(scanner.nextLine());
            
            if (num == -1) {
                System.out.println("Thx!Bye!");
                break;
            }
            sum += num;
            count++;
            
            /*
            If the entered number divided by 2 produces no remainder, it must
            be even.
            */
            if (num % 2 == 0) {
                even++;
            }
        }
        /*
        Print the results
        */
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + count);
        System.out.println("Average: " + ((double)sum / count));
        System.out.println("Even: " + even);
        
        /*
        If no odd numbers were entered ensure the printed value is at least 0
        */
        if (count - even < 0) {
            System.out.println("Odd: 0");
        } else {
            System.out.println("Odd: " + (count - even));
        }
    }
}
