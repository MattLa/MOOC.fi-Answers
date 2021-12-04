
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        
        //Get the end value
        System.out.println("Where to?");
        int end = Integer.valueOf(scanner.nextLine());
        
        //Get the starting value
        System.out.println("Where from?");
        int start = Integer.valueOf(scanner.nextLine());
        
        if (start <= end) {
            for (int i = start; i <= end; i++) {
                System.out.println(i);
            }
        }
    }
}
