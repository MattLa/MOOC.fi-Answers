
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
public class ChangeHistory {
    
    private ArrayList<Double> history;
    
    public ChangeHistory() {
        history = new ArrayList<>();
    }
    
    /**
     * adds provided status as the latest amount to remember in the change history.
     * @param status The change added to the history
     */
    public void add(double status) {
        history.add(status);
    }
    
    //Clears the history
    public void clear() {
        history = new ArrayList<>();
    }
    
    @Override
    public String toString() {
        return history.toString();
    }
    
    /**
     * returns the largest value in the change history. If the history is empty, 
     * the method should return zero.
     * @return The largest value in the list
     */
    public double maxValue() {
        double num = 0;
        for (double d : history) {
            if (d > num) {
                num = d;
            }
        }
        return num;
    }
    
    /**
     * returns the smallest value in the change history. If the history is empty, 
     * the method should return zero.
     * @return The smallest value in the list
     */
    public double minValue() {
        if (history.isEmpty()) {
            return 0;
        }
        double num = history.get(0);
        for (double d : history) {
            if (d < num) {
                num = d;
            }
        }
        return num;
    }
    
    /**
     * returns the average of the values in the change history. If the history is 
     * empty, the method should return zero.
     * @return 
     */
    public double average() {
        if (history.isEmpty()) {
            return 0;
        }
        double sum = 0;
        for (double d : history) {
            sum += d;
        }
        return sum / history.size();
    }
}
