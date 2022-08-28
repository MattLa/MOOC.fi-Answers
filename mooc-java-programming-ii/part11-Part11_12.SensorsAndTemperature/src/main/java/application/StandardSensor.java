/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

/**
 *A standard sensor is always on. Calling the methods setOn and setOff have no 
 * effect. The StandardSensor must have a constructor that takes one integer 
 * parameter. The method call read returns the number that was given to the 
 * constructor.
 * @author laurie
 */
public class StandardSensor implements Sensor {

    private int value;
    
    public StandardSensor(int value) {
        this.value = value;
    }
    
    @Override
    public boolean isOn() {
        return true;
    }

    @Override
    public void setOn() {
        
    }

    @Override
    public void setOff() {
        
    }

    @Override
    public int read() {
        return value;
    }
}
