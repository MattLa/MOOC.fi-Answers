
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *The suitcase has items and a maximum weight that determines the maximum 
 * total weight of the items.
 * @author laurie
 */
public class Suitcase {
    
    private int maxWeight;
    private ArrayList<Item> contents;
    
    //Constructor, to which the maximum weight is provided
    public Suitcase(int maxWeight) {
        this.maxWeight = maxWeight;
        contents = new ArrayList<>();
    }
    
    /**
     * which adds the item passed as a parameter to the suitcase. 
     * The method does not return a value.
     * @param item The item to be added to the case
     */
    public void addItem(Item item) {
        if (totalWeight() + item.getWeight() <= maxWeight) {
            contents.add(item);
        }
    }
    
    /**
     * Totals the weight of the Items currently in the contents list
     * @return Weight of the suitcase
     */
    public int totalWeight() {
        int sum = 0;
        for (Item i : contents) {
            sum += i.getWeight();
        }
        return sum;
    }
    
    /**
     * prints all the items in the suitcase
     */
    public void printItems() {
        for (Item i : contents) {
            System.out.println(i);
        }
    }
    
    /**
     * returns the largest item based on weight. If several items share the 
     * heaviest weight, the method can return any one of them. The method should 
     * return an object reference. If the suitcase is empty, return the value 
     * null.
     * @return The heaviest item in the contents list
     */
    public Item heaviestItem() {
        Item item = null;
        if(contents.size() > 0) {
            item = contents.get(0);
            for (Item i : contents) {
                if (i.getWeight() > item.getWeight()) {
                    item = i;
                }
            }
        }
        return item;
    }
    
    //returns the string "x items (y kg)"
   @Override
   public String toString() {
       if (contents.size() == 0) {
           return "no items (0 kg)";
       }
       String printOutput = " items (";
       if (contents.size() == 1) {
           printOutput = " item (";
       }
       return contents.size() + printOutput + totalWeight() + " kg)";
   }
}
