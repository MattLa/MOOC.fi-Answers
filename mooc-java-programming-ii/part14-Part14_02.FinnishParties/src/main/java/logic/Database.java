/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

import application.domain.Party;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author laurie
 */

public class Database {
    
    private List<Party> list;
    
    public Database() {
        list = new ArrayList<>();
    }
    
    /**
     * Add a new party to the list. If the party already exists in the list,
     * add the support value to the existing party.
     * @param name The name of the party
     * @param support The support for that year
     * @param year  The year being recorded
     */
    public void addNew(String name, double support, int year) {
        Party party = new Party(name);
        
        //Check if a party with this name already exists in the list
        if (list.contains(party)) {
            
            //It does. Retrieve it and add the support stat for a given year.
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).equals(party)) {
                    party = list.get(i);
                }
            }
            party.addYearAndRating(year, support);
        } else {
            
            //The party didn't exist yet. Add the new one. 
            party.addYearAndRating(year, support);
            list.add(party);
        }
    }
    
    /**
     * Get the list of all existing parties.
     * @return A List containing all currently added parties. An empty list if no 
     * parties have been added yet.
     */
    public List<Party> getList() {
        return list;
    }
    
    public void printEntries() {
        for (Party p : list) {
            System.out.println(p);
        }
    }
}
