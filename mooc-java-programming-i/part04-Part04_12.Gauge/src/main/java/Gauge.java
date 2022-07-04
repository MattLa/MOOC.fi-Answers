/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author laurie
 */
public class Gauge {
    
    private int value;
    
    public Gauge() {
        value = 0;
    }
    
    /**
     * grows the value instance variable's value by one. It does not grow the 
     * value beyond five.
     */
    public void increase() {
        if (value < 5) {
            value++;
        }
    }
    
    /**
     * decreases the value instance variable's value by one. It does not decrease 
     * the value to negative numbers.
     */
    public void decrease() {
        if (value > 0) {
            value--;
        }
    }
    
    public int value() {
        return value;
    }
    
    /**
     * 
     * @return true if the instance variable value has the value five. 
     *         Otherwise, it returns false.
     */
    public boolean full() {
        return value == 5;
    }
}
