
import java.util.ArrayList;

/*
 * A simple database used to store Recipe objects.
 * Will use an ArrayList to store Recipes. 
 */

/**
 *
 * @author laurie
 */
public class RecipeDatabase {
    
    private ArrayList<Recipe> recipes;
    
    public RecipeDatabase() {
        recipes = new ArrayList<>();
    }
    
    /*
    Basic functionaly to insert a recipe and search for a recipe. 
    */
    public void add(Recipe recipe) {
        //check that there is actually a recipe included as a parameter
        if (recipe != null) {
            recipes.add(recipe);
        }
    }
    
    /**
     * Find a recipe in the list. 
     * @param name The name of the recipe you're looking for
     * @return The recipe if it's found. 
     * @return null if no recipe is found in the list. 
     */
    public Recipe getRecipe(String name) {
        //We've decided two recipes are equivalent if they have the same name.
        //So, we can simply iterate until we find the recipe with a matching name
        
        for (Recipe r : recipes) {
            if (r.getName().equals("name")) {
                return r;
            }
        }
        return null;
    }
    
    /**
     * Finds all recipes containing the searched term
     * @param term The term searched
     * @return An empty list if nothing found. Otherwise all recipes containing
     * the searched word.
     */
    public ArrayList<Recipe> findAllWithNameContaining(String term) {
        ArrayList<Recipe> list = new ArrayList<>();
        for (Recipe r : recipes) {
            if (r.getName().contains(term)) {
                list.add(r);
            }
        }
        return list;
    }
    
    /**
     * Returns a list of the recipes with a cook time equal to or lower than the 
     * given cook time. 
     * @param term
     * @return 
     */
    public ArrayList<Recipe> findByCookTime(int time) {
        ArrayList<Recipe> list = new ArrayList<>();
        for (Recipe r : recipes) {
            if (r.getCookTime() <= time) {
                list.add(r);
            }
        }
        return list;
    }
    
    
    public ArrayList<Recipe> findAllContaining(String ingredient) {
        ArrayList<Recipe> list = new ArrayList<>();
        
        for (Recipe r : recipes) {
            ArrayList<String> ingredients = r.getIngredients();
            for (String s : ingredients) {
                if (s.equals(ingredient)) {
                    list.add(r);
                }
            }
        }
        return list;
    }
    
    public void printRecipes() {
        for (Recipe r : recipes) {
            System.out.println(r);
        }
    }
}
