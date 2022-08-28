
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author laurie
 */
public class Herd implements Movable {
    
    private List<Movable> herd;
    
    public Herd() {
        herd = new ArrayList<>();
    }
    
    /**
     * Adds an object that implements the Movable interface to the herd.
     * @param movable 
     */
    public void addToHerd(Movable movable) {
        herd.add(movable);
    }
    
    /**
     * Moves the herd with by the amount specified by the parameters. Notice that 
     * here you have to move each member of the herd.
     * @param dx
     * @param dy 
     */
    public void move(int dx, int dy) {
        for (Movable m : herd) {
            m.move(dx, dy);
        }
    }
    
    /**
     * Returns a string representation of the positions of the members of the 
     * herd, each on its own line.
     * @return 
     */
    @Override
    public String toString() {
        StringBuilder text = new StringBuilder();
        for (Movable m : herd) {
            text.append(m);
            text.append("\n");
        }
        return text.toString();
    }
}
