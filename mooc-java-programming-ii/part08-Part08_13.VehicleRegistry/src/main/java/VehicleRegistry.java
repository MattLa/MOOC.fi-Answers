
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
public class VehicleRegistry {
    
    private HashMap<LicensePlate, String> registry;
    
    public VehicleRegistry() {
        registry = new HashMap<>();
    }
    /**
     * assigns the owner it received as a parameter to a car that corresponds to 
     * the license plate received as a parameter. If the license plate doesn't 
     * have an owner, the method returns true. If the license already has an 
     * owner attached, the method returns false and does nothing.
     * @param licensePlate The license plate to become the hashmap key
     * @param owner The owner of the vehicle
     * @return 
     */
    public boolean add(LicensePlate licensePlate, String owner) {
        if (!registry.containsKey(licensePlate)) {
            registry.put(licensePlate, owner);
            return true;
        }
        return false;
    }
    
    /**
     * returns the owner of the car corresponding to the license plate received 
     * as a parameter. If the car isn't in the registry, the method returns null.
     * @param licensePlate The plate being searched for
     * @return the owner of the plate. null if the plate is not in the registry
     */
    public String get(LicensePlate licensePlate) {
        return registry.get(licensePlate);
    }
    
    /**
     * removes the license plate and attached data from the registry. The method 
     * returns true if removed successfully and false if the license plate wasn't 
     * in the registry.
     * @param licensePlate The plate to be removed
     * @return true if the plate was removed. false if the plate wasn't there to 
     * begin with
     */
    public boolean remove(LicensePlate licensePlate) {
        String check = registry.get(licensePlate);
        return registry.remove(licensePlate, check);
    }
    
    /**
     * prints the license plates in the registry.
     */
    public void printLicensePlates() {
        for (LicensePlate l : registry.keySet()) {
            System.out.println(l);
        }
    }
    
    /**
     * prints the owners of the cars in the registry. Each name should only be 
     * printed once, even if a particular person owns more than one car.
     */
    public void printOwners() {
        /*
        Using streams is easy. Just follow each step.
        registry.values - get all the values
        .stream() - make a stream of all values
        .distinct() - ensure there are only unique values in the stream
        .forEach() - for each vaue, perform this task
        */
        registry.values().stream().distinct().forEach(System.out::println);
    }
}
