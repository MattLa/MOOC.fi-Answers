
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //Variables to hold the name and age of the oldest.
        //Start with them empty
        
        String name = "";
        int sum = 0;
        int num = 0;
        
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
            if (parts[0].length() > name.length()) {
                name = parts[0];
            }
            sum += Integer.valueOf(parts[1]);
            num++;
        }
        double average = (double)sum / num;
        System.out.println("Longest name: " + name);
        System.out.println("Average of the birth years: " + average);
        
    }
}
