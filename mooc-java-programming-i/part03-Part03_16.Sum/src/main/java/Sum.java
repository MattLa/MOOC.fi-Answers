
import java.util.ArrayList;

public class Sum {

    public static void main(String[] args) {
        // Try your method here
    }
    
    /**
     * This method returns the sum of the numbers  contained in the ArrayList
     * @param numbers A list of numbers
     * @return The sum of the numbers in the list
     */
    public static int sum(ArrayList<Integer> numbers) {
        int sum = 0;
        //For-each loop
        for (int num : numbers) {
            //add the value to the running total
            sum += num;
        }
        //Return the total
        return sum;
    }

}
