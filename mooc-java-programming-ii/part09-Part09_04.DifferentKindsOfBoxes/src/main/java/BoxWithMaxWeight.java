
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
public class BoxWithMaxWeight extends Box {
    
    private int max;
    private ArrayList<Item> contents;
    
    public BoxWithMaxWeight(int capacity) {
        max = capacity;
        contents = new ArrayList<>();
    }
    
    @Override
    public void add(Item item) {
        if (currentWeight() + item.getWeight() <= max) {
            contents.add(item);
        }
    }
    
    @Override
    public boolean isInBox(Item item) {
        return contents.contains(item);
    }
    
    public int currentWeight() {
        int sum = 0;
        for (Item i : contents) {
            sum += i.getWeight();
        }
        return sum;
    }
}
