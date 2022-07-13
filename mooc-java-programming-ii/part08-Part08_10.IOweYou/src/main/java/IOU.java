
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author laurie
 */
public class IOU {
    
    private HashMap<String, Double> iou;
    
    public IOU() {
        iou = new HashMap<>();
    }
    
    /**
     * saves the amount owed and the person owed to to the IOU.
     * @param toWhom The person who is owed a debt
     * @param amount The debt owed
     */
    public void setSum(String toWhom, double amount) {
        iou.put(toWhom, amount);
    }
    
    /**
     * returns the amount owed to the person whose name is given as a parameter. 
     * If the person cannot be found, it returns 0.
     * @param toWhom
     * @return 
     */
    public double howMuchDoIOweTo(String toWhom) {
        return iou.getOrDefault(toWhom, 0.00);
    }
}
