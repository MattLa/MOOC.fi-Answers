
import java.util.Scanner;

public class AbsoluteValue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*
        The server doe not expect a prompt for input. 
        */
        int num1 = Integer.valueOf(scanner.nextLine());
        
        /*
        Now print the absolute difference between thes numbers
        */
        
        System.out.println(Math.abs(num1));
    }
}
