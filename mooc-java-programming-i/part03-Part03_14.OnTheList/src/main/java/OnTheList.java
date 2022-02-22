
import java.util.ArrayList;
import java.util.Scanner;

public class OnTheList {

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
        Get the name being searched
        */
        System.out.print("Search for? ");
        String name = scanner.nextLine();
        
        /*
        Search the list
        */
        boolean found = false;
        
        for (String s : list) {
            if (s.equals(name)) {
                found = true;
            }
        }
        
        if (found) {
            System.out.println(name + " was found!");
        } else {
            System.out.println(name + " was not found!");
        }
    }
}
