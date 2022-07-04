
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *The program must implement the following commands:

    Add - adds a bird

    Observation - adds an observation

    All - prints all birds

    One - prints one bird

    Quit - ends the program

 * Incorrect input must also be handled.
 * @author laurie
 */
public class UserInterface {
    
    private Database data;
    private Scanner sc;
    
    public UserInterface(Scanner sc) {
        data = new Database();
        this.sc = sc;
    }
    
    public void start() {
        while(true) {
            System.out.print("? ");
            String command = sc.nextLine();
            
            if (command.equalsIgnoreCase("quit")) {
                break;
            }
            if (command.equalsIgnoreCase("add")) {
                addBird();
            }
            if (command.equalsIgnoreCase("observation")) {
                observeBird();
            }
            if (command.equalsIgnoreCase("all")) {
                printAll();
            }
            if (command.equalsIgnoreCase("one")) {
                printOne();
            }
        }
    }
    
    private void addBird() {
        System.out.print("Name:");
        String name = sc.nextLine();
        System.out.print("Name in Latin: ");
        String latinName = sc.nextLine();
        
        boolean add = data.add(name, latinName);
        
    }
    
    private void observeBird() {
        System.out.print("Bird? ");
        String name = sc.nextLine();
        
        boolean observed = data.observe(name);
        if (!observed) {
            System.out.println("Not a bird!");
        }
    }
    
    private void printAll() {
        ArrayList<Bird> birds = data.getAll();
        for (Bird b : birds) {
            System.out.println(b);
        }
    }
    
    private void printOne() {
        System.out.print("Bird? ");
        String name = sc.nextLine();
        
        Bird bird = data.get(name);
        
        if (bird == null) {
            System.out.println("Not a bird!");
        } else {
            System.out.println(bird);
        }
    }
}
