
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program that reads user input
        // until the user enters 9999
        
        // after that, the program prints the smallest number
        // and its index -- the smallest number
        // might appear multiple times

        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == 9999) {
                break;
            }

            list.add(input);
        }

        System.out.println("");

        // implement here finding the indices of a number
        
        //A variable to hold thesmallest number
        int smallest = list.get(0);

        //For loop to find the smallest number
        for (int num : list) {
            if (num < smallest) {
                smallest = num;
            }
        }
        //For loop to iterate through the list. This cannot be a enhanced loop
        
        System.out.println("Smallest number: " + smallest);
        for (int i = 0; i < list.size(); i++) {
            
            /*
            If the element at index i is equivalent to num
            print the index i
            */
            if (list.get(i) == smallest) {
                
                System.out.println("Found at index: " + i);
            }
        }
        
    }
}
