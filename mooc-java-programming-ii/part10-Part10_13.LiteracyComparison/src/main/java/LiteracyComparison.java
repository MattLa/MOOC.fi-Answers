
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;

public class LiteracyComparison {
    
    public static void main(String[] args) {

        ArrayList<Item> list = new ArrayList<>();
        
        try {
            
            Files.lines(Paths.get("literacy.csv")).map(lines -> lines.split(","))
                    .map(parts -> new Item(parts[0], parts[1], parts[2], parts[3], parts[4], Double.parseDouble(parts[5])))
                    .forEach(list::add);
                          
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        Collections.sort(list);
        
        for (Item i : list) {
            System.out.println(i);
        }
    }
}
