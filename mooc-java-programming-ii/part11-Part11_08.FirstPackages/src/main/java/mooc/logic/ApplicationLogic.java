/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mooc.logic;

import mooc.ui.UserInterface;

/**
 *
 * @author laurie
 */
public class ApplicationLogic {
    
    private UserInterface ui;
    
    public ApplicationLogic(UserInterface ui) {
        this.ui = ui;
    }
    
    /**
     * Prints the string "Application logic is working" the number of times that 
     * is indicated by the variable times. After each print, the method should 
     * call the update() method of the object that was received as a constructor 
     * parameter (which implements the UserInterface interface).
     * @param times 
     */
    public void execute(int times) {
        for (int i = 0; i < times; i++) {
            System.out.println("Application logic is working");
            ui.update();
        }
    }
}
