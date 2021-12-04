
import java.util.Scanner;

public class Counting {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Get a number from the user
        int num = Integer.valueOf(scanner.nextLine());
        
        /*
        Using a for loop print up to the users entered number.
        Print i to print the incrementing count.
        */
        for (int i = 0; i <= num; i++) {
            System.out.println(i);
        }
    }
}
