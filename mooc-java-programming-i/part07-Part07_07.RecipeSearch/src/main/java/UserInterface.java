
import java.util.ArrayList;
import java.util.Scanner;

/*
 * This class is a little bloated and could have many elements moved to their own 
 * class.
 */

/**
 *
 * @author laurie
 */
public class UserInterface {
    
    Scanner sc;
    ReadFile file;
    RecipeDatabase database;
    
    public UserInterface(Scanner sc, RecipeDatabase database) {
        this.sc = sc;
        this.database = database;
        this.file = new ReadFile(database);
    }
    
    public void start() {
        System.out.print("File to read: ");
        String fileName = sc.nextLine();
        
        file.readFile(fileName);
        
        System.out.println("Commands: " +
                    "\nlist - lists the recipes" +
                    "\nstop - stops the program" +
                    "\nfind name - searches recipes by name" +
                    "\nfind cooking time - searches recipes by cooking time" +
                    "\nfind ingredient - searches recipes by ingredient");
        
        while (true) {
            System.out.println("\nEnter command: ");
            String command = sc.nextLine();
            
            if (command.equals("stop")) {
                break;
            }
            
            if (command.equals("list")) {
                System.out.println("Recipes:");
                database.printRecipes();
            }
            
            if (command.equals("find name")) {
                System.out.print("Searched word: ");
                String search = sc.nextLine();
                
                ArrayList<Recipe> list = database.findAllWithNameContaining(search);
                printRecipe(list);
            }
            
            if (command.equals("find cooking time")) {
                System.out.print("Max cooking time: ");
                int cookTime = Integer.parseInt(sc.nextLine());
                ArrayList<Recipe> list = database.findByCookTime(cookTime);
                printRecipe(list);
            }
            
            if (command.equals("find ingredient")) {
                System.out.print("Ingredient: ");
                String search = sc.nextLine();
                ArrayList<Recipe> list = database.findAllContaining(search);
                printRecipe(list);
            }
        }
    }
    
    private void printRecipe(ArrayList<Recipe> list) {
        System.out.println("\nRecipes:");
        for (Recipe r : list) {
            System.out.println(r);
        }
    }
}
