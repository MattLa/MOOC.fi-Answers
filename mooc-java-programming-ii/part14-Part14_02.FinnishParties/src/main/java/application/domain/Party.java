/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application.domain;

import java.util.HashMap;
import java.util.Objects;

/**
 *A basic class used to hold the data of each party.
 * @author laurie
 */
public class Party {
    
    private String name;
    private HashMap<Integer, Double> support;
    
    public Party(String name) {
        this.name = name;
        support = new HashMap<>();
    }

    public String getName() {
        return name;
    }
    
    public void addYearAndRating(int year, double rating) {
        support.put(year, rating);
    }
    
    public HashMap<Integer, Double> getSupport() {
        return support;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.name);
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
        final Party other = (Party) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }
    
    @Override
    public String toString() {
        StringBuilder toReturn = new StringBuilder();
        toReturn.append(name + ": ");
        for (int i : support.keySet()) {
            toReturn.append(i + ": " + support.get(i) + " - ");
        }
        return toReturn.toString();
    }
    
}
