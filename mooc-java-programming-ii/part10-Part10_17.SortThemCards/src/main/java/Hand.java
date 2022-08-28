
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author laurie
 */
public class Hand implements Comparable<Hand> {
    
    private List<Card> hand;
    
    public Hand() {
        hand = new ArrayList<>();
    }
    
    /**
     * adds a card to the hand
     * @param card 
     */
    public void add(Card card) {
        hand.add(card);
    }
    
    public void print() {
        hand.stream().forEach(System.out::println);
    }
    
    /**
     * sorts the cards in the hand. After sorting, the cards are printed in order
     */
    public void sort() {
        Collections.sort(hand);
        print();
    }

    public int totalValue() {
        int sum = 0;
        for (Card c : hand) {
            sum += c.getValue();
        }
        return sum;
    }
    @Override
    public int compareTo(Hand o) {
        int thisTotal = totalValue();
        int comparedTotal = o.totalValue();
        
        if (thisTotal == comparedTotal) {
            return 0;
        }
        return thisTotal > comparedTotal ? 1 : -1;
    }
    
    public void sortBySuit() {
        Collections.sort(hand, new BySuitInValueOrder());
        //Collections.sort(cards, (c1, c2) -> c1.getSuit().ordinal() - c2.getSuit().ordinal());
    }
}
