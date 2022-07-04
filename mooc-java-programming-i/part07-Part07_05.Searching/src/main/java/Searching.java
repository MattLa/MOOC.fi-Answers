
import java.util.ArrayList;
import java.util.Scanner;

public class Searching {

    public static void main(String[] args) {
        // The program below is meant for testing the search algorithms you'll write
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();
        System.out.println("How many books to create?");
        int numberOfBooks = Integer.valueOf(scanner.nextLine());
        for (int i = 0; i < numberOfBooks; i++) {
            books.add(new Book(i, "name for the book " + i));
        }

        System.out.println("Id of the book to search for?");
        int idToSearchFor = Integer.valueOf(scanner.nextLine());

        System.out.println("");
        System.out.println("Searching with linear search:");
        long start = System.currentTimeMillis();
        int linearSearchId = linearSearch(books, idToSearchFor);
        System.out.println("The search took " + (System.currentTimeMillis() - start) + " milliseconds.");
        if (linearSearchId < 0) {
            System.out.println("Book not found");
        } else {
            System.out.println("Found it! " + books.get(linearSearchId));
        }

        System.out.println("");

        System.out.println("");
        System.out.println("Seaching with binary search:");
        start = System.currentTimeMillis();
        int binarySearchId = binarySearch(books, idToSearchFor);
        System.out.println("The search took " + (System.currentTimeMillis() - start) + " milliseconds.");
        if (binarySearchId < 0) {
            System.out.println("Book not found");
        } else {
            System.out.println("Found it! " + books.get(binarySearchId));
        }

    }

    /**
     * which searches the list it received as a parameter, for a book with an id 
     * variable that matches the value of searchedId variable it received as a 
     * parameter. If that book is found, the method, should return the index it's 
     * located at in the list it received as a parameter. If the book isn't found, 
     * the method should return the value -1.
     * @param books
     * @param searchedId
     * @return 
     */
    public static int linearSearch(ArrayList<Book> books, int searchedId) {
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getId() == searchedId) {
                return i;
            }
        }
        return -1;
    }

    /**
     * which searches the list it received as a parameter, for a book with an id 
     * variable that matches the value of searchedId variable it received as a 
     * parameter. If that book is found, the method, should return the index it's 
     * located at in the list it received as a parameter. If the book isn't found, 
     * the method should return the value -1.
     * 
     * The method must be implemented as a binary search, which assumes the list 
     * is ordered. You should also assume, that the ids towards the beginning of 
     * the list, are always smaller than the ids towards the end of the list.
     * @param books
     * @param searchedId
     * @return 
     */
    public static int binarySearch(ArrayList<Book> books, long searchedId) {
        /*
        pseudocode for Binary Search implementation
        
        repeat until begin is larger than end:
            middle = (end + begin) / 2

            if the value at list[middle] is searched
                return the value of the variable middle

            if the value at list[middle] is smaller than searched
                begin = middle + 1

            if the value at list[middle] is larger than searched
                end = middle

        return value -1
        */
        int begin = 0;
        int end = books.size();
        
        while(begin < end) {
            int middle = (begin + end) / 2;
            
            if (books.get(middle).getId() == searchedId) {
                return middle;
            }
            
            if (books.get(middle).getId() < searchedId) {
                begin = middle + 1;
            }
            
            if (books.get(middle).getId() > searchedId) {
                end = middle;
            }
        }
        return -1;
    }
}

