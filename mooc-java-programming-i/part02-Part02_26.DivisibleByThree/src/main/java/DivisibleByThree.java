
import java.util.Scanner;

public class DivisibleByThree {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    }

    public static void divisibleByThreeInRange(int beginning, int end) {
        //A for loop works well here because we know exactly how many times
        //we want to iterate.
        
        for (int i = beginning; i <= end; i++) {
            //Now check if i divided by 3 has a remainder of 0
            //Print i if it does.
            if (i % 3 == 0) {
                System.out.println(i);
            }
        } 
    }
}
