
import java.util.Objects;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author laurie
 */
public class Bird {
    
    private String name;
    private String latinName;
    private int observed;
    
    public Bird(String name, String latinName) {
        this.name = name;
        this.latinName = latinName;
        observed = 0;
    }
    
    //Bird has been spotted. Increment the count. 
    public void observe() {
        observed++;
    }

    public String getName() {
        return name;
    }

    public String getLatinName() {
        return latinName;
    }

    public int getObserved() {
        return observed;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 17 * hash + Objects.hashCode(this.name);
        hash = 17 * hash + Objects.hashCode(this.latinName);
        hash = 17 * hash + this.observed;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Bird other = (Bird) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.latinName, other.latinName)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        if (observed == 1) {
            return name + " (" + latinName + "): " + observed + "observation";
        }
        else {
            return name + " (" + latinName + "): " + observed + "observations";
        }
    }
    
    
}
