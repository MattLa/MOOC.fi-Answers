/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author laurie
 */
public class TripleTacoBox implements TacoBox {
    
    private int amount;
    
    public TripleTacoBox() {
        amount = 3;
    }
    
    public int tacosRemaining() {
        return amount;
    }
    
    public void eat() {
        if (amount > 0) {
            amount--;
        }
    }
}
