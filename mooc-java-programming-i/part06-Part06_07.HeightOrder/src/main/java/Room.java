
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *Create Room class. The class should contain a list of persons as an instance 
 * variable, and it should have a parameterless constructor
 * @author laurie
 */
public class Room {
    
    private ArrayList<Person> room;
    
    public Room() {
        room = new ArrayList<>();
    }
    
    /**
     * add the person passed as a paramter to the list.
     * @param person 
     */
    public void add(Person person) {
        room.add(person);
    }
    
    /**
     * returns a boolean-type value true or false, that tells whether the room 
     * is empty or not.
     * @return 
     */
    public boolean isEmpty() {
        return room.isEmpty();
    }
    
    /**
     * returns a list of the persons in the room.
     * @return 
     */
    public ArrayList<Person> getPersons() {
        return room;
    }
    
    /**
     * returns the shortest person added to the room. If the room is empty, 
     * a null reference is returned.
     * @return The shortest person in the room. Null if the room is empty
     */
    public Person shortest() {
        if (room.isEmpty()) {
            return null;
        }
        //At this point there is at least 1 person in the room.
        Person shortest = room.get(0);
        for(Person p : room) {
            if (p.getHeight() < shortest.getHeight()) {
                shortest = p;
            }
        }
        return shortest;
    }
    
    /**
     * takes the shortest person in the room. When a room is empty, 
     * it returns a null reference.
     * @return The shortest person in the room. Null if the room is empty
     */
    public Person take() {
        Person shortest = shortest();
        if (shortest == null) {
            return null;
        }
        //At this point we know there must be people ni the room otherwise
        //shortest would have been null
        
        room.remove(shortest);
        return shortest;
    }
}
