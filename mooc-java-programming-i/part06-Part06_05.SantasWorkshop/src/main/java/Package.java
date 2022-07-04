
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
public class Package {
    
    private ArrayList<Gift> packages;
    
    //A parameterless constructor
    public Package() {
        packages = new ArrayList<>();
    }
    
    /**
     * adds the gift passed as a parameter to the package. 
     * The method returns no value.
     * @param gift the gift to be added
     */
    public void addGift(Gift gift) {
        packages.add(gift);
    }
    
    /**
     * returns the total weight of the package's gifts
     * @return the total weight of the package's gifts
     */
    public int totalWeight() {
        int sum = 0;
        for (Gift g : packages) {
            sum += g.getWeight();
        }
        return sum;
    }
}
