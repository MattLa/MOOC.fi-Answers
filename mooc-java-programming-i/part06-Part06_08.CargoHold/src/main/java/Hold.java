
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
public class Hold {
    
    private int maxWeight;
    private ArrayList<Suitcase> contents;
    
    //a constructor, to which the maximum weight is given
    public Hold(int maxWeight) {
        this.maxWeight = maxWeight;
        contents = new ArrayList<>();
    }
    
    
    /**
     * Not part of the question. Used to make other methods more readable.
     * @return total weight of the contents in the hold.
     */
    private int totalWeight() {
        int sum = 0;
        for (Suitcase s : contents) {
            sum += s.totalWeight();
        }
        return sum;
    }
    
    /**
     * adds the specified luggage to the hold
     * @param suitcase The luggage to be added
     */
    public void addSuitcase(Suitcase suitcase) {
        if (totalWeight() + suitcase.totalWeight() <= maxWeight) {
            contents.add(suitcase);
        }
    }
    
    //prints all the items contained in the hold's suitcases.
    public void printItems() {
        for (Suitcase s : contents) {
            s.printItems();
        }
    }
    
    /**
     * 
     * @return returns the string "x suitcases (y kg)"
     */
    @Override
    public String toString() {
        
       String printOutput = " suitcases (";
       if (contents.size() == 1) {
           printOutput = " suitcase (";
       }
       return contents.size() + printOutput + totalWeight() + " kg)";
    }
}
