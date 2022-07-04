import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        // implement here the program that allows the user to enter 
        // book information and to examine them
        ArrayList<Book> books = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        
        while(true) {
            System.out.print("Title: ");
            String title = sc.nextLine();
            
            if (title.isEmpty()) {
                System.out.println("");
                break;
            }
            
            System.out.print("Pages: ");
            int pages = Integer.parseInt(sc.nextLine());
            
            System.out.println("Publication year: ");
            int year = Integer.parseInt(sc.nextLine());
            
            books.add(new Book(title, pages, year));
        }

        System.out.print("What information will be printed? ");
        String query = sc.nextLine();
        
        if (query.equals("everything")) {
            for (Book b : books) {
                System.out.println(b);
            }
        }
        
        if (query.equals("name")) {
            for (Book b : books) {
                System.out.println(b.getTitle());
            }
        }
    }
}
