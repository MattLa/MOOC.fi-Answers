/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author laurie
 */
public class Student extends Person {
    
    private int credits;
    
    public Student(String name, String address) {
        super(name, address);
        credits = 0;
    }
    
    public int credits() {
        return credits;
    }
    
    public void study() {
        credits++;
    }

    @Override
    public String toString() {
        String st = super.toString();
        st += "\n  Study credits " + credits;
        return st;
    }
    
    
}
