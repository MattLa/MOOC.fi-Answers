/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author laurie
 */

/*
At last, we are on our own. Commenting will be better from here on out. The 
comments were lacking on the initial portion of this section because the 
exercises gave a very detailed specification. 
*/
public class Book {
    
    //Variables to hold necessary info
    private String title;
    private int pages;
    private int publicationYear;
    
    /**
     * Constructor initializes all variables
     * @param title The book title
     * @param pages The number of pages in the book
     * @param publicationYear  The year the book was published
     */
    public Book(String title, int pages, int publicationYear) {
        this.title = title;
        this.pages = pages;
        this.publicationYear = publicationYear;
    }
    
    /*
    Getters and Setters -------------------------------------------------------
    */
    
    public String getTitle() {
        return title;
    }
    
    public int getPages() {
        return pages;
    }
    
    public int getPublicationYear() {
        return publicationYear;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    
    public void setPages(int pages) {
        this.pages = pages;
    }
    
    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }
    
    /*
    Override inherited methods from the Object class
    */
    
    @Override
    public String toString() {
        //example output: To Kill a Mockingbird, 281 pages, 1960
        return title + ", " + pages + " pages, " + publicationYear;
    }
    
}
