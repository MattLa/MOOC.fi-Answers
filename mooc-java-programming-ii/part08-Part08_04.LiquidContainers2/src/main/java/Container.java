/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author laurie
 */
public class Container {
    
    private int contents;
    
    public Container() {
        contents = 0;
    }
    
    /**
     * returns the amount of liquid in a container as an integer.
     * @return returns the amount of liquid in a container as an integer.
     */
    public int contains() {
        return contents;
    }
    
    /**
     * adds the amount of liquid given as a parameter to the container. If the 
     * amount is negative, no liquid is added. A container can hold a maximum of 
     * 100 units of liquid.
     * @param amount 
     */
    public void add(int amount) {
        if (amount > 0) {
            contents += amount;
            if (contents > 100) {
                contents = 100;
            }
        }
    }
    
    /**
     * removes the amount of liquid given as a parameter from the container. If 
     * the amount is negative, no liquid is removed. A container can never hold 
     * less than 0 units of liquid.
     * @param amount 
     */
    public void remove(int amount) {
        if (amount > 0) {
            contents -= amount;
            if (contents < 0) {
                contents = 0;
            }
        }
    }
    
    /**
     * returns the container as a string formatted "amount of liquid/100, for 
     * example "32/100".
     * @return 
     */
    @Override
    public String toString() {
        return contents + "/100";
    }
}
