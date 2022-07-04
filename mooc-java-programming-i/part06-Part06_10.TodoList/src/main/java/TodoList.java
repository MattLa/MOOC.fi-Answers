
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *Create a class called TodoList. It should have a constructor without parameters
 * @author laurie
 */
public class TodoList {
    
    private ArrayList<String> list;
    
    public TodoList() {
        list = new ArrayList<>();
    }
    
    /**
     * add the task passed as a parameter to the todo list.
     * @param task The task to be added to the list.
     */
    public void add(String task) {
        list.add(task);
    }
    
    /**
     * prints the exercises. Each task has a number associated with it on the 
     * print statement 
     */
    public void print() {
        for (int i = 0; i < list.size(); i++) {
            System.out.println((i + 1) + ": " + list.get(i));
        }
    }
    
    /**
     * removes the task associated with the given number; the number is the one 
     * seen associated with the task in the print.
     * @param number 
     */
    public void remove(int number) {
        list.remove(number - 1);
    }
}
