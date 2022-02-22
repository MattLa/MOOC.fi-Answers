
public class Printer {

    public static void main(String[] args) {
        // You can test the method here
        int[] array = {5, 1, 3, 4, 2};
        printArrayInStars(array);
    }

    /**
     * Prints n rows of stars. n = array.length
     * @param array The list of values.
     */
    public static void printArrayInStars(int[] array) {
        // Write some code in here
        for (int num : array) {
            printStars(num);
        }
    }
    
    /**
     * Prints a row of n stars.
     * @param num The number of stars to be printed
     */
    public static void printStars(int num) {
        for (int i = 0; i < num; i++) {
            System.out.print("*");
        }
        System.out.println("");
    }

}
