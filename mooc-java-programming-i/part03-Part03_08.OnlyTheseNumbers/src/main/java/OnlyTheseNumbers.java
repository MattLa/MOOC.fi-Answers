
import java.util.ArrayList;
import java.util.Scanner;

public class OnlyTheseNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();
        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            if (number == -1) {
                break;
            }

            numbers.add(number);
        }
        /*
        This will use much of the knowledge that has been taught to this point.
        */
        
        //Two variables to hold that start and end points to be defined by the user
        int start = 0;
        int end = 0;
        
        /*
        Get the start point. We can assume an integer will be entered
        */
        System.out.print("From where? ");
        start = Integer.valueOf(scanner.nextLine());
        
        /*
        Get the end point.
        */
        System.out.print("To where? ");
        end = Integer.valueOf(scanner.nextLine());
        
        /*
        Loop using the start and end points. 
        */
        
        while(start <= end) {
            System.out.println(numbers.get(start));
            start++;
        }
    }
}
