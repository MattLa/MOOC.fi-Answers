
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author laurie
 */
public class UserInterface {
    
    private JokeManager manager;
    private Scanner sc;
    
    public UserInterface (JokeManager manager, Scanner sc) {
        this.manager = manager;
        this.sc = sc;
    }
    
    public void start() {
        while (true) {
            System.out.println("Commands:\n" +
                                "1 - add a joke\n" +
                                "2 - draw a joke\n" +
                                "3 - list jokes\n" +
                                "X - stop");
            String command = sc.nextLine();
            if (command.equals("X")) {
                break;
            }
            if (command.equals("1")) {
                addJoke();
                continue;
            }
            if (command.equals("2")) {
                drawJoke();
                continue;
            }
            if (command.equals("3")) {
                listJoke();
                continue;
            }
        }
    }
    
    private void addJoke() {
        System.out.println("Write the joke to be added:");
        String joke = sc.nextLine();
        manager.addJoke(joke);
    }
    
    private void drawJoke() {
        System.out.println(manager.drawJoke());
    }
    
    private void listJoke() {
        System.out.println("Printing the jokes.");
        manager.printJokes();
    }
}
