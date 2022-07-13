
import java.util.HashMap;

public class Program {

    public static void main(String[] args) {
        // Test your program here!
    }

    /**
     * prints all the keys in the hashmap given as a parameter.
     * @param HashMap print all keys contained in this map
     */
    public static void printKeys(HashMap<String,String> hashmap) {
        for (String s : hashmap.keySet()) {
            System.out.println(s);
        }
    }
    
    /**
     * prints the keys in the hashmap given as a parameter, which contain the 
     * string given as a parameter.
     * @param hashmap The hashmap which keyset we want to search for the given string
     * @param text The string being searched for in the keyset
     */
    public static void printKeysWhere(HashMap<String,String> hashmap, String text) {
        for (String s : hashmap.keySet()) {
            if (s.contains(text)) {
                System.out.println(s);
            }
        }
    }
    
    /**
     * prints the values in the given hashmap which keys contain the given string.
     * @param hashmap The hashmap to search
     * @param text The text to look for in the keyset
     */
    public static void printValuesOfKeysWhere(HashMap<String,String> hashmap, String text) {
        for (String s : hashmap.keySet()) {
            if (s.contains(text)) {
                System.out.println(hashmap.get(s));
            }
        }
    }
}
