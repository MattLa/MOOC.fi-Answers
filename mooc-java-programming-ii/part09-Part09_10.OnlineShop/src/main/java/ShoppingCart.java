
import java.util.HashMap;
import java.util.Map;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author laurie
 */
public class ShoppingCart {
    
    private Map<String, Item> cart;
    
    public ShoppingCart() {
        cart = new HashMap<>();
    }
    
    /**
     * adds an item to the cart that matches the product given as a parameter, 
     * with the price given as a parameter.
     * @param product
     * @param price 
     */
    public void add(String product, int price) {
        if (cart.containsKey(product)) {
            cart.get(product).increaseQuantity();
        } else {
            cart.put(product, new Item(product, 1, price));
        }
    }
    
    /**
     * returns the total price of the shopping cart.
     * @return 
     */
    public int price() {
        int sum = 0;
        for (String s : cart.keySet()) {
            sum += cart.get(s).price();
        }
        return sum;
    }
    
    public void print() {
        for (String s : cart.keySet()) {
            System.out.println(cart.get(s));
        }
    }
    
    
}
