
import java.util.Scanner;

public class OnlyPositives {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //Start an infinite loop
        while(true) {
            System.out.println("Give a number:");
            int num = Integer.valueOf(scanner.nextLine());
            
            //If the number equals 0, break;
            if(num == 0) {
                break;
            }
            //If the number is less than 0 print "Unsuitable number"
            if(num < 0) {
                System.out.println("Unsuitable number");
                continue;
            }
            //If the number is greater than 0, print the num to the power of 2
            if(num > 0) {
                System.out.println(num * num);
                continue;
            }
        }

    }
}
