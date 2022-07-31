
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
public class DictionaryOfManyTranslations {
    
    private HashMap<String, ArrayList<String>> dictionary;
    
    public DictionaryOfManyTranslations() {
        dictionary = new HashMap<>();
    }
    
    /**
     * adds the translation for the word and preserves the old translations.
     * @param word The key value for the hashmap
     * @param translation  Adds a translation to an existing word or creates the 
     * initial entry in the hashmap
     */
    public void add(String word, String translation) {
        if (!dictionary.containsKey(word)) {
            ArrayList<String> list = new ArrayList<>();
            list.add(translation);
            dictionary.put(word, list);
        } else {
            ArrayList<String> list = dictionary.get(word);
            list.add(translation);
        }
    }
    
    /**
     * returns a list of the translations added for the word. If the word has no 
     * translations, the method should return an empty list.
     * @param word The word you want translated
     * @return An arraylist containing all existing known translations. 
     */
    public ArrayList<String> translate(String word) {
        if (dictionary.keySet().contains(word)) {
            return dictionary.get(word);
        }
        return new ArrayList<String>();
    }
    
    /**
     * removes the word and all its translations from the dictionary.
     * @param word The word you want removed
     */
    public void remove(String word) {
        if (dictionary.keySet().contains(word)) {
            dictionary.remove(word);
        }
    }
}
