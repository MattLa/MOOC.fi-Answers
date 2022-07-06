
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
    
    private TodoList list;
    private Scanner scanner;
    
    public UserInterface(TodoList list, Scanner scanner) {
        this.list = list;
        this.scanner = scanner;
    }
    
    public void start() {
        while (true) {
            System.out.print("Command: ");
            String cmd = scanner.nextLine();
            
            if (cmd.equals("stop")) {
                break;
            }
            
            if (cmd.equals("add")) {
                add();
            }
            
            if (cmd.equals("list")) {
                list();
            }
            
            if (cmd.equals("remove")) {
                remove();
            }
        }
    }
    
    public void add() {
        System.out.print("To add: ");
        String st = scanner.nextLine();
        list.add(st);
    }
    
    public void list() {
        list.print();
    }
    
    public void remove() {
        System.out.print("Which one is removed? ");
        int toBeRemoved = Integer.parseInt(scanner.nextLine());
        list.remove(toBeRemoved);
    }
}
