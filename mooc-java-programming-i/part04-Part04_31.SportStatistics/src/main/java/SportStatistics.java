
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Game> games = new ArrayList<>();
        
        System.out.print("File: ");
        String file = scan.nextLine();
        
        try (Scanner sc = new Scanner(Paths.get(file))) {
            
            while(sc.hasNextLine()) {
                String[] line = sc.nextLine().split(",");
                games.add(new Game(line[0], line[1], Integer.parseInt(line[2]), Integer.parseInt(line[3])));
                
            }
            
            System.out.println("Name: ");
            String name = scan.nextLine();
            
            int played = 0;
            int wins = 0;
            int loss = 0;
            
            for (Game g : games) {
                if (g.getHome().equals(name)) {
                    played++;
                    if (g.getHomeScore() > g.getAwayScore()) {
                        wins++;
                    } else {
                        loss++;
                    }
                }
                if (g.getAway().equals(name)) {
                    played++;
                    if (g.getAwayScore() > g.getHomeScore()) {
                        wins++;
                    } else {
                        loss++;
                    }
                }
                
            }
            
            System.out.println("Games: " + played +
                    "\nWins: " + wins +
                    "\nLosses: " + loss);
            
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

}
