
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author laurie
 */
public class Warehouse {
    
    private Map<String, Integer> priceList;
    private Map<String, Integer> stockList;
    
    public Warehouse() {
        priceList = new HashMap<>();
        stockList = new HashMap<>();
    }
    
    /**
     * which adds a product to the warehouse with the price and stock balance 
     * given as parameters.
     * @param product
     * @param price
     * @param stock 
     */
    public void addProduct(String product, int price, int stock) {
        if (!priceList.containsKey(product)) {
            priceList.put(product, price);
        }
        if (!stockList.containsKey(product)) {
            stockList.put(product, stock);
        }
    }
    
    /**
     * which returns the price of the product it received as a parameter. If the 
     * product hasn't been added to the warehouse, the method must return -99.
     * @param product
     * @return 
     */
    public int price(String product) {
        if (priceList.containsKey(product)) {
            return priceList.get(product);
        }
        return -99;
    }
    
    /**
     * returns the current remaining stock of the product in the warehouse. If 
     * the product hasn't been added to the warehouse, the method must return 0.
     * @param product
     * @return 
     */
    public int stock(String product) {
        if (stockList.containsKey(product)) {
            return stockList.get(product);
        }
        return 0;
    }
    
    /**
     * reduces the stock remaining for the product it received as a parameter by 
     * one, and returns true if there was stock remaining. If the product was not 
     * available in the warehouse the method returns false. A products stock can't 
     * go below zero.
     * @param product
     * @return 
     */
    public boolean take(String product) {
        int amount = stock(product);
        if (amount <= 0) {
            return false;
        }
        stockList.put(product, amount - 1);
        return true;
    }
    
    /**
     * returns the names of the products in the warehouse as a Set
     * @return 
     */
    public Set<String> products() {
        return stockList.keySet();
    }
    
    
}
