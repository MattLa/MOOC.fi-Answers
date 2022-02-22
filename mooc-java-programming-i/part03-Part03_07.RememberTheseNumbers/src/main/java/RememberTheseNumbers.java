
import java.util.ArrayList;
import java.util.Scanner;

public class RememberTheseNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();
        while (true) {
            int luku = Integer.valueOf(scanner.nextLine());
            if (luku == -1) {
                break;
            }

            numbers.add(luku);
        }

        /*
        We will use an enhanced for list to print the values of the list.
        One of these loops was shown in a previous exercise.
        */
        for (int num : numbers) {
            System.out.println(num);
        }
        /*
        You may be confused by the list taking an Integer(an Object) as a value but the for 
        loop reading an int(a primitive value). 
        An Integer is a wrapper class for primitive int values.
        */
    }
}
