
import java.util.Scanner;

public class NumberOfNegativeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
        Instantiate a variable to count the amount of negative numbers entered
        by the user
        */
        int count = 0;
        
        //Start a infinite loop
        
        while(true) {
            System.out.println("Give a number:");
            int num = Integer.valueOf(scanner.nextLine());
            if (num == 0) {
                break;
            }
            //If the number entered is negative, increment count
            if (num < 0) {
                count++;
            }
        }
        System.out.println("Number of negative numbers: " + count);
    }
}
