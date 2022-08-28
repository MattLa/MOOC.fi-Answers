/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.Random;

/**
 *At first a temperature sensor is off. When the method read is called and the 
 * sensor is on, the sensor randomly chooses an integer in the range -30...30 and 
 * returns it. If the sensor is off, the method read throws an 
 * IllegalStateException.
 * @author laurie
 */
public class TemperatureSensor implements Sensor {
    
    private boolean isOn;
    
    public TemperatureSensor() {
        isOn = false;
    }

    @Override
    public boolean isOn() {
        return isOn;
    }

    @Override
    public void setOn() {
        isOn = true;
    }

    @Override
    public void setOff() {
        isOn = false;
    }

    @Override
    public int read() {
        if (isOn) {
            int rand = new Random().nextInt(61) - 30;
            return rand;
        }
        throw new IllegalStateException();
    }
    
    
}
