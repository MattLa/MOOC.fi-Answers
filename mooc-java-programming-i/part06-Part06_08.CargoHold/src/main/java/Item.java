/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *Create an Item class from which objects can be instantiated to represent 
 * different items. The information to store is the name and weight of the 
 * item (kg).
 * @author laurie
 */
public class Item {
    
    private String name;
    private int weight;
    
    //Constructor that takes the name and the weight of the item as parameters
    public Item(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }
    
    public String getName() {
        return name;
    }
    
    public int getWeight() {
        return weight;
    }
    
    
    //returns the string "name (weight kg)"
    @Override
    public String toString() {
        return name + " (" + weight + " kg)";
    }
}
