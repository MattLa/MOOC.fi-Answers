
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
public class Abbreviations {
    
    private HashMap<String, String> abbreviations;
    
    public Abbreviations() {
        abbreviations = new HashMap<>();
    }
    
    /**
     * adds a new abbreviation and its explanation.
     * @param abbreviation The abbreviated term added as a key
     * @param explanation The explanation term to be added as a value
     */
    public void addAbbreviation(String abbreviation, String explanation) {
        if (!abbreviations.containsKey(abbreviation)) {
            abbreviations.put(abbreviation, explanation);
        }
    }
    
    /**
     * checks if an abbreviation has already been added; returns true if it has 
     * and false if it has not.
     * @param abbreviation The abbreviation being searched
     * @return true if the abbreviation is in the keyset
     */
    public boolean hasAbbreviation(String abbreviation) {
        return abbreviations.containsKey(abbreviation);
    }
    
    /**
     * finds the explanation for an abbreviation; returns null if the abbreviation 
     * has not been added yet.
     * @param abbreviation The abbreviation being searched
     * @return The explanation of the requests abbreviation
     */
    public String findExplanationFor(String abbreviation) {
        return abbreviations.get(abbreviation);
    }
}
