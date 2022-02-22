
import java.util.ArrayList;
import java.util.Scanner;

public class SumOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }

            list.add(input);
        }

        System.out.println("");

        // toteuta listan lukujen summan laskeminen tänne
        
        //Variable to hold the running sum
        int sum = 0;
        
        /*
        For-each number in the list, add the value to the running total sum
        */
        for (int num : list) {
            sum += num;
        }
        //Print the result
        System.out.println("Sum: " + sum);
    }
}
