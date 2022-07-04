
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author laurie
 */
public class Stack {
    
    private ArrayList<String> stack;
    
    public Stack() {
        stack = new ArrayList<>();
    }
    
    public boolean isEmpty() {
        return stack.isEmpty();
    }
    
    /**
     * Adds a new item as the last element of the stack
     * @param item The item to be added
     */
    public void add(String item) {
        stack.add(item);
    }
    
    /**
     * Get the values in the stack as a list
     * @return The ArrayList containing the values
     */
    public ArrayList<String> values() {
        return stack;
    }
    
    public String take() {
        if(!stack.isEmpty()) {
            String value = stack.get(stack.size() - 1);
            stack.remove(value);
            return value;
        }
        return null;
    }
}
