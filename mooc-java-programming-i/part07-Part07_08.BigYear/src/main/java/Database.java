
import java.util.ArrayList;
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
public class Database {
    
    private HashMap<String, Bird> data;
    
    public Database() {
        data = new HashMap<>();
    }
    
    /**
     * Add a bird to the list
     * @param name the name of the bird
     * @param latinName the Latin name of the bird
     * @return true if the bird is added to the list. false if the bird could not 
     * be added for whatever reason. Birds are considered equal if they have the 
     * same name. 
     */
    public boolean add(String name, String latinName) {
        if (!data.containsKey(name)) {
            data.put(name, new Bird(name, latinName));
            return true;
        }
        return false;
    }
    
    /**
     * If the bird exists in the database, increment it's observed variable
     * @param bird The bird to be observed
     * @return true if the bird is in the database. False otherwise.
     */
    public boolean observe(String bird) {
        if (data.containsKey(bird)) {
            data.get(bird).observe();
            return true;
        }
        return false;
    }
    
    /**
     * Find a bird contained in the database
     * @param name The name of the bird being searched for
     * @return The bird if found. null if nothing is found. 
     */
    public Bird get(String name) {
        if (data.containsKey(name)) {
            return data.get(name);
        }
        return null;
    }
    
    public ArrayList<Bird> getAll() {
        ArrayList<Bird> birds = new ArrayList<>();
        for (String s : data.keySet()) {
            birds.add(data.get(s));
        }
        return birds;
    }
}
