
import java.util.Scanner;

public class Squared {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        /*
        There is no prompt for user input. The server expects nothing
        So, just get user input.
        */
        int num = Integer.valueOf(scanner.nextLine());
        
        //Now print the square of the input to the console
        System.out.println((num * num));

    }
}
