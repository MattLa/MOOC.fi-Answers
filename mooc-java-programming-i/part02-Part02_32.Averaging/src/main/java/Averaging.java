
public class Averaging {

    // implement the sum method here again
    public static int sum(int number1, int number2, int number3, int number4) {
        // write some code here
        //Same method as the previous exercise.
        return number1 + number2 + number3 + number4;
    }

    public static double average(int number1, int number2, int number3, int number4) {
        //write some code here
        /*
        Let call the method sum and cast the result to a double
        */
        double sum = (double)sum(number1, number2, number3, number4);
        
        /*
        We know there will always be 4 numbers so the average is sum / 4
        */
        return sum / 4;
    }

    public static void main(String[] args) {
        double result = average(4, 3, 6, 1);
        System.out.println("Average: " + result);
    }
}
