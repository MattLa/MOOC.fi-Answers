
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOf {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }

            list.add(input);
        }

        System.out.println("");

        // implement here finding the indices of a number
        
        //A variable to hold the number being searched
        int num = 0;
        System.out.print("Search for? ");
        num = Integer.valueOf(scanner.nextLine());
        
        //For loop to iterate through the list. This cannot be a enhanced loop
        
        for (int i = 0; i < list.size(); i++) {
            
            /*
            If the element at index i is equivalent to num
            print the index i
            */
            if (list.get(i) == num) {
                
                System.out.println(num + " is at index " + i);
            }
        }
    }
}
