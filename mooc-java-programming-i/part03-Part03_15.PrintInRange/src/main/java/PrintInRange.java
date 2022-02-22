
import java.util.ArrayList;

public class PrintInRange {

    public static void main(String[] args) {
        // Try your method here
    }
    
    /*
    Prints the numbers in the ArrayList from index lowerLimit to index upperLimit
    to the console
    
    @param numbers The list if integer values
    @param lowerLimit The initial index to be printed
    @param upperLimit The final index to be printed
    */
    public static void printNumbersInRange(ArrayList<Integer> numbers, int lowerLimit, int upperLimit) {
        //Iterate through each index in the list
        for (int i = 0; i < numbers.size(); i++) {
            //Put the number in a temp variable just for readability
            int num = numbers.get(i);
            //if the number is within the range given
            if (num >= lowerLimit && num <= upperLimit) {
                System.out.println(num);
            }
        }
    }
}
