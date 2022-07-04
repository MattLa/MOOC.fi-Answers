
import java.util.ArrayList;

public class Menu {

    private ArrayList<String> meals;

    public Menu() {
        this.meals = new ArrayList<>();
    }

    // implement the required methods here
    
    /**
     * Add a meal to the menu
     * @param meal The name of the meal to be added. A meal may only appear on 
     * the menu once.
     */
    public void addMeal(String meal) {
        if (!meals.contains(meal))
            meals.add(meal);
    }
    
    /**
     * Print the menu
     */
    public void printMeals() {
        for(String s : meals) {
            System.out.println(s);
        }
    }
    
    /**
     * Empty the menu
     */
    public void clearMenu() {
        meals = new ArrayList<>();
    }
}
