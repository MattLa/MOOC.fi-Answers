
public class Greatest {

    public static int greatest(int number1, int number2, int number3) {
        //write some code here
        
        if (number1 > number2) {
            if (number1 > number3) {
                //number1 must be the greatest
                return number1;
            }
        }
        /*
        At this point we know for certain number1 is smaller than number 2
        but we dont know if number2 is larger than number3
        */
        if (number2 > number3) {
            return number2;
        }
        /*
        At this point we know number3 is greater than number2 and number2 was 
        greater than number1. So number3 must be the alrgest number. Just 
        return it.
        */
        return number3;
    }

    public static void main(String[] args) {
        int result = greatest(2, 7, 3);
        System.out.println("Greatest: " + result);
    }
}
