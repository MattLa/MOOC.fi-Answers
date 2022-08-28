
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // test your method here

    }

    /**
     * The method must calculate the sum of the elements in the array between the 
     * lower and the upper limits. Only numbers smaller or equal to the int 
     * largest and larger or equal to the int smallest are added to the sum.
     * 
     * The method must also check that the lower and the upper limit are valid 
     * indexes in the array. If the parameter fromWhere is smaller than 0, the 
     * lower limit becomes 0 instead. Accordingly, if the parameter toWhere is 
     * larger than the size of the array, the upper limit becomes the last index 
     * of the array instead.
     * @param array
     * @param fromWhere
     * @param toWhere
     * @param smallest
     * @param largest
     * @return 
     */
    public static int sum(int[] array, int fromWhere, int toWhere, int smallest, int largest) {
        if (fromWhere < 0) {
            fromWhere = 0;
        }
        if (toWhere > array.length) {
            toWhere = array.length;
        }
        int sum = 0;
        if (!(toWhere < fromWhere)) {
            for (int i = fromWhere; i < toWhere; i++) {
                if (array[i] >= smallest && array[i] <= largest) {
                    sum += array[i];
                }
            }
        }
        return sum;
    }
}
