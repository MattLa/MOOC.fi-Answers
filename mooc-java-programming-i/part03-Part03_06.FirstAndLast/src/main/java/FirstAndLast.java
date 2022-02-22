
import java.util.ArrayList;
import java.util.Scanner;

public class FirstAndLast {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            list.add(input);
        }

        /*
        Very similar to the previous exercise. The first name will always be 
        element 0. The last name will always be size() - 1.
        */
        System.out.println(list.get(0));
        System.out.println(list.get(list.size() - 1));
    }
}
