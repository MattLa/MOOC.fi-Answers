

public class Division {

    public static void main(String[] args) {
        
        // Once you have implemented the division method, you can
        // try it out here. Fopr example division(3,5);
        // should print "0.6"

        // division(3, 5);
    }

    // implement the method here
    public static void division(int numerator, int denominator) {
        
        //Division by zero is not a real number and not allowed.
        if (denominator != 0) {
            
            //We want a floating point number so store the result in a double
            //Cast either number to a double
            double result = (double)numerator / denominator;
            System.out.println(result);
        }
    }
}
