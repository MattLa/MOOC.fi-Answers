
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> list = new ArrayList<>();
        
        while (true) {
            System.out.println("Input the name of the book, empty stops: ");
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }
            System.out.println("Input the age recommendation: ");
            int age = Integer.parseInt(scanner.nextLine());
            
            list.add(new Book(name, age));
        }
        sortList(list);
        System.out.println("\n" + list.size() + " books in total.\n");
        System.out.println("Books:");
        
        for (Book b: list) {
            System.out.println(b);
        }
    }

    public static void sortList(ArrayList<Book> list) {
        Comparator comparator = Comparator
                .comparing(Book::getAge)
                .thenComparing(Book::getName);
        Collections.sort(list, comparator);
    }
}
