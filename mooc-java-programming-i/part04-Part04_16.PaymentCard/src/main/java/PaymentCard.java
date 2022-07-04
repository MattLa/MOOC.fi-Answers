/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author laurie
 */
public class PaymentCard {
    
    private double balance;
    
    public PaymentCard(double balance) {
        this.balance = balance;
    }
    
    @Override
    public String toString() {
        return "The card has a balance of " + balance + " euros";
    }
    
    public void eatAffordably() {
        if (balance - 2.6 >= 0) {
            balance -= 2.6;
        }
    }
    
    public void eatHeartily() {
        if (balance - 4.6 >= 0) {
            balance -= 4.6;
        }
    }
    
    public void addMoney(double value) {
        if (value >= 0) {
            balance += value;
            if (balance > 150) {
                balance = 150;
            }
        }
    }
}
