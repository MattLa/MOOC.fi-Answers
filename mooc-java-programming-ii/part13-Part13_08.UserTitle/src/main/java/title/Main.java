package title;

import java.util.Scanner;
import javafx.application.Application;


public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a title for the window: ");
        String title = sc.nextLine();
        
        Application.launch(UserTitle.class, "--title=" + title);

    }
}
