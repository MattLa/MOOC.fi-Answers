/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 *An average sensor includes multiple sensors. In addition to the methods defined 
 * in the Sensor interface, the AverageSensor has the method public void 
 * addSensor(Sensor toAdd) that can be used to add a new sensor for the average 
 * sensor to control.
 * 
 * An AverageSensor is on when all its sensors are on. When setOn is called, all 
 * the sensors must be set on. When setOff is called, at least one of the sensors 
 * must be set off. It's also acceptable to set off all the sensors.
 * 
 * The method read of AverageSensor returns the average of the read methods of 
 * its sensors (since the return value is int, the number is rounded down as is 
 * the case with integer division). If this method is called while the 
 * AverageSensor is off, or if no sensors have been added to it, the method 
 * should throw an IllegalStateException.
 * 
 * @author laurie
 */
public class AverageSensor implements Sensor {

    private List<Sensor> list;
    private List<Integer> readings;
    
    public AverageSensor() {
        list = new ArrayList<>();
        readings = new ArrayList<>();
    }
    
    public void addSensor(Sensor toAdd) {
        list.add(toAdd);
    }
    
    @Override
    public boolean isOn() {
        for (Sensor s : list) {
            if (!s.isOn()) {
                return false;
            }
        }
        return true;
    }

    @Override
    public void setOn() {
        for (Sensor s : list) {
            s.setOn();
        }
    }

    @Override
    public void setOff() {
        if (!list.isEmpty()) {
            list.get(0).setOff();
        }
    }

    @Override
    public int read() {
        int average = list.stream()
                .mapToInt(value -> value.read())
                .sum() / list.size();
                
        readings.add(average);
        return average;
    }
    
    /*
    The method should return the results of all the executed readings that the 
    average sensor has done as a list.
    */
    public List<Integer> readings() {
        return readings;
    }
}
