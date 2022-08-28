
import java.util.Comparator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author laurie
 */
public class BySuitInValueOrder implements Comparator<Card> {
    
    /**
     * returns a negative value if the card c1 should be sorted before card c2, a 
     * positive value if card c2 comes before card c1, and zero if they are equal.
     * @param c1
     * @param c2
     * @return 
     */
    public int compare(Card c1, Card c2) {
        if (c1.getSuit().ordinal() == c2.getSuit().ordinal()) {
            return c1.getValue() - c2.getValue();
        }
        return c1.getSuit().ordinal() - c2.getSuit().ordinal();
    }
}
