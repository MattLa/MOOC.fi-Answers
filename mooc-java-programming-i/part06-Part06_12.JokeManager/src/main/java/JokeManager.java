
import java.util.ArrayList;
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author laurie
 */
public class JokeManager {
    
    private ArrayList<String> jokes;
    
    public JokeManager() {
        jokes = new ArrayList<>();
    }
    
    /**
     * adds a joke to the manager.
     * @param joke 
     */
    public void addJoke(String joke) {
        jokes.add(joke);
    }
    
    /**
     * chooses one joke at random and returns it. If there are no jokes stored 
     * in the joke manager, the method should return the string "Jokes are in 
     * short supply.".
     * @return A random joke
     */
    public String drawJoke() {
        if (jokes.isEmpty()) {
            return "Jokes are in short supply.";
        }
        Random rand = new Random();
        int num = rand.nextInt(jokes.size());
        return jokes.get(num);
    }
    
    /**
     * prints all the jokes stored in the joke manager.
     */
    public void printJokes() {
        for (String s : jokes) {
            System.out.println(s);
        }
    }
}
