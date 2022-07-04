
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }
    
    
    @Override
    public String toString() {
        
        //First check for an empty list
        if (elements.isEmpty()) {
            return "The collection " + name + " is empty.";
        }
        
        //Next check if there is 1 or more elements in the list to ensure the 
        //output is singular or plural
        String printOutput = "";
        if (elements.size() == 1) {
            printOutput = "The collection " + name + " has 1 element:";
        } else {
            printOutput = "The collection " + name + " has " + elements.size() + " elements:";
        }
        
        //Add the elements of the list to their own String
        String listElements = "";
        for (String s : elements) {
            listElements += "\n" + s;
        }
        
        //Print everything formatted as required. 
        return printOutput + listElements;
    }
}
