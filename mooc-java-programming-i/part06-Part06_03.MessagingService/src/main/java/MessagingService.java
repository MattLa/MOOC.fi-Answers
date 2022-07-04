
import java.util.ArrayList;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author laurie
 */
public class MessagingService {
    
    private ArrayList<Message> list;
    
    public MessagingService() {
        list = new ArrayList<>();
    }
    
    /**
     * adds a message passed as a parameter to the messaging service as long as 
     * the message content is at most 280 characters long.
     * @param message The message to be added to the list
     */
    public void add(Message message) {
        if (message.getContent().length() <= 280) {
            list.add(message);
        }
    }
    
    /**
     * returns the messages added to the messaging service.
     * @return the messages in an ArrayList.
     */
    public ArrayList<Message> getMessages() {
        return list;
    }
}
