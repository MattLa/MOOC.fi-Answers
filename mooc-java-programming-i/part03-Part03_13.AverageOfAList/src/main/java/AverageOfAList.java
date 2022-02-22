
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program, that first reads user input
        // adding them on a list until user gives -1.
        // Then it computes the average of the numbers on the list
        // and prints it.
        
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
        //A variable to hold the average. Dont forget to cast one number to a double
        double average = (double)sum / list.size();
        
        //print the result
        System.out.println("Average: " + average);
    }
}
