
public class SumOfArray {

    public static void main(String[] args) {
        // You can try the method here
        int[] array = {5, 1, 3, 4, 2};
        System.out.println(sumOfNumbersInArray(array));
    }

    /**
     * Calculates the sum of the values contained in the array
     * @param array The list of values
     * @return Sum of the values
     */
    public static int sumOfNumbersInArray(int[] array) {
        // Write some code here
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum;
    }
}
