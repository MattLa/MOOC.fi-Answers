
import java.util.ArrayList;
import java.util.Objects;

/*
 * A class which will be the blueprint for a recipe and its ingredients.
 */

/**
 *
 * @author laurie
 */
public class Recipe {
    
    /*
    Variables to hold the name and incredients included. 
    */
    private String name;
    private int cookTime;
    private ArrayList<String> ingredients;
    
    //A basic constructor
    public Recipe(String name, int cookTime) {
        this.name = name;
        this.cookTime = cookTime;
        ingredients = new ArrayList<>();
    }
    
    /**
     * Add an ingredient to the list so long as the argument is not null
     * @param toAdd The ingredient to add
     */
    public void addIngredient(String toAdd) {
        if (!toAdd.equals(null)) {
            ingredients.add(toAdd);
        }
    }
    
    //Get the name of the recipe
    public String getName() {
        return name;
    }
    
    //Get the cook time for the recipe
    public int getCookTime() {
        return cookTime;
    }
    
    //Get the list of ingredients
    public ArrayList<String> getIngredients() {
        return ingredients;
    }

    /*
    Generated with the equals method. Will likely do nothing in the end product.
    */
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + Objects.hashCode(this.name);
        return hash;
    }

    /**
     * Used to compare if 2 recipes are the same. We will consider 2 recipes the 
     * same if they have the same name. This is just a basic auto generated
     * method.
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Recipe other = (Recipe) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return name + ", cooking time: " + cookTime;
    }
    
    
}
