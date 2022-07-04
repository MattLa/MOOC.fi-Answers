/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author laurie
 */
public class Gift {
    
    private String name;
    private int weight;
    
    //Constructor for which the name and weight of the gift are given as 
    //parameters
    public Gift(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    //returns the name of the gift
    public String getName() {
        return name;
    }

    //returns the weight of the gift
    public int getWeight() {
        return weight;
    }
    
    //returns a string in the form "name (weight kg)"
    @Override
    public String toString() {
        return name + "(" + weight + " kg)";
    }
}
