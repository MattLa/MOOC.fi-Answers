
import java.util.Scanner;

/*
This is meant to be programmed using a procedural paradigm. 
The use of classes and methods is not permitted(Although functions/methods
could be used in a procedural paradigm).
*/
public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int first = 0;
        int second = 0;

        while (true) {
            System.out.println("First: " + first + "/100");
            System.out.println("Second: " + second + "/100");
            System.out.print("> ");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            String[] parts = input.split(" ");
            int num = Integer.parseInt(parts[1]);
            if (num <= 0)
                continue;
            
            /*
            adds the amount of liquid specified by the parameter to the first 
            container. The inserted amount must be specified as an integer. The 
            container can't hold more than a hundred liters and everything added 
            past that will go to waste.
            */
            if (parts[0].equals("add")) {
                first += num;
                if (first > 100)
                    first = 100;
            }
            
            /*
            moves the amount of liquid specified by the parameter from the first 
            container to the second container. The given amount must be specified 
            as an integer. If the program is requested to move more liquid than 
            than the first container currently holds, move all the remaining 
            liquid. The second container can't hold more than one hundred liters 
            of liquid and everything past that will go to waste.
            */
            if (parts[0].equals("move")) {
                if (num > first) {
                    num = first;
                }
                first -= num;
                second += num;
                if (second > 100)
                    second = 100;
            }
            
            /*
            removes the amount of liquid specified by the parameter from the 
            second container. If the program is requested to remove more liquid 
            than the container currently holds, remove all the remaining liquid.
            */
            if (parts[0].equals("remove")) {
                if (num >= second) {
                    second = 0;
                    continue;
                }
                second -= num;
            }
            System.out.println("");
        }
    }

}
