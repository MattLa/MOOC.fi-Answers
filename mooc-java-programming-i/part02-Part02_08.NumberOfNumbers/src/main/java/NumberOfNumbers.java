
import java.util.Scanner;

public class NumberOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Instantiate a variable to hold the count
        int count = 0;

        //Start and infinite loop
        while(true) {
            System.out.println("Give a number:");
            int num = Integer.valueOf(scanner.nextLine());
            if (num == 0) {
                break;
            }
            count++;
        }
        
        //Print the number of times we went through the loop
        System.out.println("Number of numbers: " + count);
    }
}
