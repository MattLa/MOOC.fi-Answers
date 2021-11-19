
import java.util.Scanner;

public class CarryOn {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Start an infinite loop
        while (true) {
            System.out.println("Shall we carry on?");
            String st = scanner.nextLine();
            //If the user inputs 'no' then stop. Otherwise carry on indefinitely
            if (st.equals("no")) {
                break;
            }
        }
    }
}
