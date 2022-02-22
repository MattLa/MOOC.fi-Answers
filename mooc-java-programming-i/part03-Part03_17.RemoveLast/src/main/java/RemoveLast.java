
import java.util.ArrayList;

public class RemoveLast {

    public static void main(String[] args) {
        // Try your method in here
    }
    
    /**
     * Removes the value contained in the last index of the list
     * @param strings The list to be modified
     */
    public static void removeLast(ArrayList<String> strings) {
        //Check that the list is not empty
        if(!strings.isEmpty()) {
            strings.remove(strings.size() - 1);
        }
    }

}
