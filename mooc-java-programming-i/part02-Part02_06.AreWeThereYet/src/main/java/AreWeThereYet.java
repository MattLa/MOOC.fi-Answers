
import java.util.Scanner;

public class AreWeThereYet {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Start and infinite loop
        while(true) {
            System.out.println("Give a number:");
            int num = Integer.valueOf(scanner.nextLine());
            //Does the input equal 4?
            if (num == 4) {
                break;
            }
        }
    }
}
