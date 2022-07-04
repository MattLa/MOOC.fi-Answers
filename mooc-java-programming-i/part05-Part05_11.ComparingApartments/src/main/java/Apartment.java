
public class Apartment {

    private int rooms;
    private int squares;
    private int pricePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.pricePerSquare = pricePerSquare;
    }
    
    /**
     * Create a method public boolean largerThan(Apartment compared) that returns 
     * true if the apartment object whose method is called has a larger total area 
     * than the apartment object that is being compared.
     * @param compared Apartment to be compared
     * @return True if the compared apartment is smaller
     */
    public boolean largerThan(Apartment compared) {
        return this.squares > compared.squares;
    }
    
    /**
     * Returns the price difference of the apartment object whose method was 
     * called and the apartment object received as the parameter. The price 
     * difference is the absolute value of the difference of the prices (price 
     * can be calculated by multiplying the price per square by the number of 
     * squares).
     * @param compared
     * @return Dollar value difference between the two apartments.
     */
    public int priceDifference(Apartment compared) {
        return Math.abs((squares * pricePerSquare) - (compared.squares * compared.pricePerSquare));
    }
    
    public boolean moreExpensiveThan(Apartment compared) {
        return (squares * pricePerSquare) > (compared.squares * compared.pricePerSquare);
    }
}
