
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * A class to read the file provided by the user
 */

/**
 *
 * @author laurie
 */
public class ReadFile {
    
    RecipeDatabase database;
    
    public ReadFile(RecipeDatabase database) {
        this.database = database;
    }
    
    public void readFile(String file) {
        
        
        try (Scanner sc = new Scanner(Paths.get(file))){
            
            //read through the entire file
            while(sc.hasNextLine()) {
                
                //read until a blank line has been ecnoutered. Store everything 
                //in an Arraylist
                ArrayList<String> recipe = new ArrayList<>();
                
                while(sc.hasNextLine()) {
                    String line = sc.nextLine();
                    //System.out.println(line);
                    if (line.isEmpty()) {
                        break;
                    } else {
                        recipe.add(line);
                    }
                }
                /*
                At this point the recipe list is either empty or contains a full
                recipe. The first element of the list will be the name. The 
                second element will always be the cooking time. All 
                following elements will be the ingredients.
                */
                if (!recipe.isEmpty()) {
                   Recipe r = new Recipe(recipe.get(0), Integer.parseInt(recipe.get(1)));
                   for (int i = 2; i < recipe.size(); i++) {
                       r.addIngredient(recipe.get(i));
                   }
                   database.add(r);
                }
                for (String s : recipe) {
                    System.out.println(s);
                }
            }
        } catch (Exception e) {
            
        }
    }
}
