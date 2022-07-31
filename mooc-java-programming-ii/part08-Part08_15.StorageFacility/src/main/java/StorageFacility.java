
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
public class StorageFacility {
    
    private HashMap<String, ArrayList<String>> storageUnit;
    
    public StorageFacility() {
        storageUnit = new HashMap<>();
    }
    
    /**
     * adds the parameter item to the storage unit that is also given as a 
     * parameter.
     * @param unit The unit used as the key value in the hashmap
     * @param item Th item to be stored in the unit. 
     */
    public void add(String unit, String item) {
        if (!storageUnit.keySet().contains(unit)) {
            ArrayList<String> itemList = new ArrayList<>();
            itemList.add(item);
            storageUnit.put(unit, itemList);
        } else {
         ArrayList<String> itemList = storageUnit.get(unit);
         itemList.add(item);
        }
    }
    
    /**
     * returns a list that contains all the items in the storage unit indicated 
     * by the parameter. If there is no such storage unit or it contains no items, 
     * the method should return an empty list.
     * @param storageUnit
     * @return 
     */
    public ArrayList<String> contents(String storageUnit) {
        if(this.storageUnit.containsKey(storageUnit)) {
            return this.storageUnit.get(storageUnit);
        }
        return new ArrayList<String>();
    }
    
    /**
     * removes the given item from the given storage unit. NB! Only removes one 
     * item — if there are several items with the same name, the rest still 
     * remain. If the storage unit would be empty after the removal, the method 
     * also removes the unit.
     * @param unit
     * @param item 
     */
    public void remove(String unit, String item) {
        if (storageUnit.containsKey(unit)) {
            ArrayList<String> items = storageUnit.get(unit);
            items.remove(item);
            if (items.isEmpty()) {
                storageUnit.remove(unit);
            }
        }
    }
    
    /**
     * returns the names of the storage units as a list. NB! Only the units that 
     * contain items are listed.
     * @return The keyset for the storage unit in an ArrayList
     */
    public ArrayList<String> storageUnits() {
        ArrayList<String> unitList = new ArrayList<>();
        storageUnit.keySet().stream().forEach(item -> unitList.add(item));
        /*
        This stream is equivalent to the code:
        for (String item : storageUnit.keySet()) {
            unitList.add(item);
        }
        in terms of functionality
        */
        return unitList;
    }
}
