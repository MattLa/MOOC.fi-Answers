
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
public class Box implements Packable {
    
    private double capacity;
    private ArrayList<Packable> contents;
    
    public Box(double capacity) {
        this.capacity = capacity;
        contents = new ArrayList<>();
    }
    
    public void add(Packable item) {
        if (this.weight() + item.weight() <= capacity) {
            contents.add(item);
        }
    }
    
    @Override
    public double weight() {
        double sum = 0;
        for (Packable p : contents) {
            sum += p.weight();
        }
        return sum;
    }
   //Box: 6 items, total weight 4.0 kg
    @Override
    public String toString() {
        return "Box: " + contents.size() + " items, total weight " + this.weight() + " kg";
    }
}
