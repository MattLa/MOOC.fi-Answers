
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *The pipe works, such that we can add values into it and values can be taken out. 
 * Adding to the pipe happens from one end, and taking out from the other end. 
 * In other words, we always remove the value which has been inside the pipe the 
 * longest and add to it the newest value.
 * @author laurie
 */
public class Pipe<T> {
    
    private List<T> pipe;
    
    public Pipe() {
        pipe = new ArrayList<>();
    }
    
    /**
     * puts an object with a type in accordance with the type parameter given to 
     * the the class into the pipe.
     * @param value 
     */
    public void putIntoPipe(T value) {
        pipe.add(0, value);
    }
    
    /**
     * takes out the value, which has been in the pipe the longest. In case there 
     * is nothing in the pipe, return null. Calling the method returns the value, 
     * which has been in the pipe the longest, and removes it from the pipe.
     * @return 
     */
    public T takeFromPipe() {
        if (pipe.isEmpty()) {
            return null;
        }
        T item = pipe.get(pipe.size() -1);
        pipe.remove(pipe.size() -1);
        return item;
    }
    
    /**
     * returns the value true if the pipe has values. In case the pipe is empty, 
     * it returns the value false.
     * @return 
     */
    public boolean isInPipe() {
        return !pipe.isEmpty();
    }
}
