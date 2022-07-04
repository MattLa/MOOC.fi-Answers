/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author laurie
 */
public class Whistle {
    
    private String sound;
    
    
    /**
     *  Construct a Whistle object
     * @param sound Set the default string to be printed
     */
    public Whistle(String sound) {
        this.sound = sound;
    }
    
    /**
     * Prints the string passed in through the constructor
     */
    public void sound() {
        System.out.println(sound);
    }
}
