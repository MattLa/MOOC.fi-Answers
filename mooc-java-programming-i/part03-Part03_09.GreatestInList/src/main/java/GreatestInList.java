
import java.util.ArrayList;
import java.util.Scanner;

public class GreatestInList {

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

        // implement finding the greatest number in the list here
        
        /*
        Set the greatest number to the first number in the list. 
        We cannot us 0 or some other number we believe might be the smallest. 
        If we set the number to 0 and the user enters all negative numnbers then
        our 0 will be the largest number. 
        */
        int greatest = list.get(0);
        
        /*
        Use an enhanced for loop to iterate through the list looking for the 
        largest number.
        */
        for (int num : list) {
            /*
            If the current number is larger than the currently found greatest
            number, set that number equal to greatest. 
            */
            if (num > greatest) {
                greatest = num;
            }
            /*
            Note we could save a single comparison if we used a traditional 
            for loop. However, we would be saving 1 cycle of work but using
            a bit more memory. 
            */
        }
        
        //Print the number
        System.out.println("The greatest number: " + greatest);
    }
}
