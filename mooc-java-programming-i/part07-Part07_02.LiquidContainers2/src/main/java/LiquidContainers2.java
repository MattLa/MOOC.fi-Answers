
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Container first = new Container();
        Container second = new Container();

        while (true) {
            System.out.println("First"
                    + ": " + first);
            System.out.println("Second: " + second);
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
                first.add(num);
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
                if (num <= first.contains()) {
                    first.remove(num);
                    second.add(num);
                } else {
                    int contents = first.contains();
                    first.remove(num);
                    second.add(num + (contents - num));
                }
            }
            
            /*
            removes the amount of liquid specified by the parameter from the 
            second container. If the program is requested to remove more liquid 
            than the container currently holds, remove all the remaining liquid.
            */
            if (parts[0].equals("remove")) {
                second.remove(num);
            }
            System.out.println("");
        }
    }

}
