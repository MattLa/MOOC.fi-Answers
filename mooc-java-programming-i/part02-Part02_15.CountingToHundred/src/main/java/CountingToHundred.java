
import java.util.Scanner;

public class CountingToHundred {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Get a number from the user
        int num = Integer.valueOf(scanner.nextLine());
        
        /*
        Print the numbers from the entered number to 100
        */
        
        for (int i = num; i <= 100; i++) {
            System.out.println(i);
        }
    }
}
