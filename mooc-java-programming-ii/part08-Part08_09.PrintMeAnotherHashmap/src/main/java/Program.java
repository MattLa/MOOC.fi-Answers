
import java.util.HashMap;

public class Program {

    public static void main(String[] args) {
        // Test your program here!
    }
    
    /**
     * which prints all the values in the hashmap given as a parameter using the 
     * toString method of the Book objects.
     * @param hashmap The hashmap containing the values we want to print
     */
    public static void printValues(HashMap<String,Book> hashmap) {
        for (String s : hashmap.keySet()) {
            System.out.println(hashmap.get(s));
        }
    }
    
    /**
     * which prints only the Books in the given hashmap which name contains the 
     * given string. You can find out the name of a Book with the method getName.
     * @param hashmap
     * @param text 
     */
    public static void printValueIfNameContains(HashMap<String,Book> hashmap, String text) {
        for (String s : hashmap.keySet()) {
            if (hashmap.get(s).getName().contains(text)) {
                System.out.println(hashmap.get(s));
            }
        }
    }
}
