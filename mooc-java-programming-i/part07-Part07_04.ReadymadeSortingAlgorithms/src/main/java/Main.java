
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;



public class Main {

    public static void main(String[] args) {
        // insert test code here
        int[] array = {3, 1, 5, 99, 3, 12};
    }

    /**
     * sorts an array of integers.
     * @param array The array to be sorted
     */
    public static void sort(int[] array) {
        Arrays.sort(array);
    }
    
    /**
     * sorts an array of strings.
     * @param array The array to be sorted
     */
    public static void sort(String[] array) {
        Arrays.sort(array);
    }
    
    /**
     * sorts a list of integers.
     * @param integers The ArrayList to be sorted
     */
    public static void sortIntegers(ArrayList<Integer> integers) {
        Collections.sort(integers);
    }
    
    /**
     * sorts a list of strings.
     * @param strings The ArrayList to be sorted
     */
    public static void sortStrings(ArrayList<String> strings) {
        Collections.sort(strings);
    }

}
