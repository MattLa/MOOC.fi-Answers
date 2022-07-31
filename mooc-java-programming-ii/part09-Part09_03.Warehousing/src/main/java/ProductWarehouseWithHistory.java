/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author laurie
 */
public class ProductWarehouseWithHistory extends ProductWarehouse {
    
    private ChangeHistory history;
    
    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance) {
        super(productName, capacity);
        history = new ChangeHistory();
        history.add(initialBalance);
        super.addToWarehouse(initialBalance);
    }
    
    public String history() {
        return history.toString();
    }
    
   
    /**
     * works just like the method in the Warehouse class, but we also record the 
     * changed state to the history. NB: the value recorded in the history should 
     * be the warehouse's balance after adding, not the amount added!
     * @param amount 
     */
    public void addToWarehouse(double amount) {
        super.addToWarehouse(amount);
        history.add(this.getBalance());
    }
    
    /**
     * works just like the method in the Warehouse class, but we also record the 
     * changed state to the history. NB: the value recorded in the history should 
     * be the warehouse's balance after removing, not the amount removed!
     * @param amount
     * @return 
     */
    public double takeFromWarehouse(double amount) {
        double num = super.takeFromWarehouse(amount);
        history.add(this.getBalance());
        return num;
    }
    
    /*
    Prints in the format:
    Product: Juice
    History: [1000.0, 988.7, 989.7]
    Largest amount of product: 1000.0
    Smallest amount of product: 988.7
    Average: 992.8
    */
    public void printAnalysis() {
        String toPrint = "Product: " + this.getName()
                + "\nHistory: " + this.history()
                + "\nLargest amount of product: " + history.maxValue()
                + "\nSmallest amount of product: " + history.minValue()
                + "\nAverage: " + history.average();
        System.out.println(toPrint);
    }
}
