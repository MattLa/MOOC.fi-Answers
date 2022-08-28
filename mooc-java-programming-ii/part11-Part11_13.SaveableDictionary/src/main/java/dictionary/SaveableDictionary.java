/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;

import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author laurie
 */
public class SaveableDictionary {
    
    private Map<String, String> dictionary;
    private String file;
    
    public SaveableDictionary() {
        dictionary = new HashMap<>();
    }
    
    public SaveableDictionary(String file) {
        dictionary = new HashMap<>();
        this.file = file;
    }
    
    /**
     * adds a word to the dictionary. Every word has just one translation, and if 
     * the same word is added for the second time, nothing happens.
     * @param word
     * @param translation 
     */
    public void add(String word, String translation) {
        if (!dictionary.containsKey(word)) {
            dictionary.put(word, translation);
        }
    }
    
    /**
     * returns the translation for the given word. If the word is not in the 
     * dictionary, returns null.
     * @param word
     * @return 
     */
    public String translate(String word) {
        if (dictionary.containsValue(word)) {
            for (String s : dictionary.keySet()) {
                if (dictionary.get(s).equals(word)) {
                    return s;
                } 
            }
        }
        return dictionary.get(word);
    }
    
    /**
     * deletes the given word and its translation from the dictionary.
     * @param word 
     */
    public void delete(String word) {
        if (dictionary.containsKey(word)) {
            dictionary.remove(word);
        }
        if (dictionary.containsValue(word)) {
            String toRemove = translate(word);
            dictionary.remove(toRemove);
        }
    }
    
    /**
     * loads the dictionary from the file given to the constructor as a parameter. 
     * If the program is unable to open the file or read from it, the method 
     * returns false, otherwise it returns true.
     * @return 
     */
    public boolean load() {
        try (Scanner sc = new Scanner(Paths.get(file))) {
            
            while(sc.hasNextLine()) {
                String[] in = sc.nextLine().split(":");
                add(in[0], in[1]);
            }
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return false;
    }
    
    /**
     * saves the dictionary to the file given to the dictionary as a parameter to 
     * the constructor. If the program cannot save to the file, the method 
     * returns false. Otherwise it returns true. The dictionary files have to be 
     * saved in the form described above, so the program can read the files it 
     * has written.
     * @return 
     */
    public boolean save() {
        try {
            PrintWriter writer = new PrintWriter(file);
            for (String s : dictionary.keySet()) {
                StringBuilder toStore = new StringBuilder();
                toStore.append(s);
                toStore.append(":");
                toStore.append(dictionary.get(s));
                writer.println(toStore.toString());
            }
            writer.close();
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return false;
    }
}
