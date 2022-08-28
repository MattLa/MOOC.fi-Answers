package FlightControl;

import FlightControl.logic.FlightControl;
import FlightControl.ui.TextUI;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        // Write the main program here. It is useful to create some classes of your own.
        
        /*
        You can just copy and paste the code from the website. The point of this
        exercise is not a coding exercise but to get you in the habit of 
        splitting your application parts in to packages. The code below is the
        only code you'll need to write. 
        */
        Scanner scanner = new Scanner(System.in);
        FlightControl control = new FlightControl();
        TextUI ui = new TextUI(control, scanner);
        ui.start();
    }
}
