
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }
    
    public Money plus(Money addition) {
        int euro = this.euros + addition.euros;
        int cent = this.cents + addition.cents;
        
        return new Money(euro, cent);
    }
    
    public boolean lessThan(Money compared) {
        int value = (euros * 100) + cents;
        int comparedValue = (compared.euros() * 100) + compared.cents();
        
        if (value < comparedValue) {
            return true;
        }
        return false;
    }
    
    public Money minus(Money decreaser) {
        int value = (euros * 100) + cents;
        int minus = (decreaser.euros() * 100) + decreaser.cents();
        
        if (value - minus < 0) {
            return new Money(0,0);
        }
        return new Money(0, value - minus);
    }

}
