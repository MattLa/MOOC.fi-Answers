
import java.util.ArrayList;
import java.util.Scanner;

public class LastInList {

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
        We want to prinnt the last name in the list. The last name will be the 
        size of the list minus 1 because the size starts counting at 1 but the
        index values start counting at 0.
        */
        
        System.out.println(list.get(list.size() - 1));
    }
}
