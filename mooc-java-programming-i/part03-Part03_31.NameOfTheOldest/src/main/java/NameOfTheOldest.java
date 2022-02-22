
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Variables to hold the name and age of the oldest.
        //Start with them empty
        
        String name = "";
        int age = 0;
        
        //Start an infinite loop
        while (true) {
            //Get input from the user
            String in = scanner.nextLine();
            if (in.isEmpty()) {
                break;
            }
            
            //Split the input. It will be in CSV format
            String[] parts = in.split(",");
            
            //Check the current highest age
            if (Integer.valueOf(parts[1]) > age) {
                name = parts[0];
                age = Integer.valueOf(parts[1]);
            }
        }
        System.out.println("Name of the oldest: " + name);
    }
}
