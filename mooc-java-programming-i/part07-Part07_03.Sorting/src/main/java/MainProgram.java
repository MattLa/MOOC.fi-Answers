
public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] array = {3, 1, 5, 99, 3, 12};
    }
    
    /**
     * that takes an integer array as a parameter. It should return the smallest 
     * value in the array.
     * @param array An array of integers values
     * @return the smallest number in the array provided
     */
    public static int smallest(int[] array){
        int smallest = array[0];
        for (int i : array) {
            if (i < smallest) {
                smallest = i;
            }
        }
        return smallest;
    }

    /**
     * It should return the index of the smallest number in the array that it 
     * receives as a parameter.
     * @param array the array to check through
     * @return the index of the smallest integer value
     */
    public static int indexOfSmallest(int[] array) {
        int smallest = array[0];
        int index = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
                index = i;
            }
        }
        return index;
    }
    
    /**
     * It works similarly to indexOfSmallest in the previous section, but only 
     * considers the table values from a certain index forwards.
     * @param array The array to check
     * @param startIndex The first index to check
     * @return The index of the smallest integer
     */
    public static int indexOfSmallestFrom(int[] array, int startIndex) {
        int smallest = array[startIndex];
        int index = startIndex;
        for (int i = startIndex + 1; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
                index = i;
            }
        }
        return index;
    }
    
    /**
     * The method swaps the numbers in these indices with each other.
     * @param array The array you want to swap values in
     * @param index1 Index of the first value to be swapped
     * @param index2 Index of the last value to be swapped
     */
    public static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
    
    /**
     * Sorts the provided array from smallest to largest
     * @param array The array to be sorted
     */
    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int smallest = indexOfSmallestFrom(array, i);
            swap(array, i, smallest);
        }
    }
}
