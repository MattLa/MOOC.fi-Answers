
public class ArrayPrinter {

    public static void main(String[] args) {
        // You can test your method here
        int[] array = {5, 1, 3, 4, 2};
        printNeatly(array);
    }

    /**
     * Prints the values of the array in the format n, n, n, n
     * @param array The list of values
     */
    public static void printNeatly(int[] array) {
        // Write some code in here
        int index = 0;
        while (index < array.length) {
            //Check if it's the last index in the list
            //We dont want a comma after the final index prints
            if (index == array.length - 1) {
                System.out.println(array[index]);
            } else {
                System.out.print(array[index] + ", ");
            }
            index++;
        }
    }
}
