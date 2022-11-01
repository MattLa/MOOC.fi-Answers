package application;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class UserInterface {

    private Scanner scanner;
    private TodoDao database;

    public UserInterface(Scanner scanner, TodoDao database) {
        this.scanner = scanner;
        this.database = database;
    }

    public void start() throws SQLException {
        while (true) {
            System.out.println("");
            System.out.println("Enter command:");
            System.out.println("1) list");
            System.out.println("2) add");
            System.out.println("3) mark as done");
            System.out.println("4) remove");
            System.out.println("x) quit");

            System.out.print("> ");
            String command = this.scanner.nextLine();
            if (command.equals("x")) {
                break;
            }
            
            if (command.equals("1")) {
                list();
            }
            
            if (command.equals("2")) {
                add();
            }
            
            if (command.equals("3")) {
                markAsDone();
            }
            
            if (command.equals("4")) {
                remove();
            }

            // implement the functionality here
        }

        System.out.println("Thank you!");
    }
    
    public void list() {
        try {
            List<Todo> list = database.list();
            System.out.println("Listing the database contents");
            for (Todo t : list) {
                System.out.println(t);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void add() {
        System.out.println("Adding a new todo"
                + "\nEnter name");
        String name = scanner.nextLine();
        System.out.println("Enter description");
        String description = scanner.nextLine();
        Todo toAdd = new Todo(name, description, false);
        try {
            database.add(toAdd);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
    }
    
    public void markAsDone() {
        System.out.println("Which todo should be marked as done (give the id)?");
        int id = Integer.parseInt(scanner.nextLine());
        try {
            database.markAsDone(id);
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void remove() {
        System.out.println("Which todo should be removed (give the id)?");
        int id = Integer.parseInt(scanner.nextLine());
        try {
            database.remove(id);
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
