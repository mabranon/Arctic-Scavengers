/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arctic.player;

import arctic.cards.Card;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Joshua
 */
public class Hand {
    
    private List<Card> hand;
    
    public Hand(){
        hand = new ArrayList<>();
    }
    
    /**
     * Adds a card to hand
     * @param card 
     */
    public void add(Card card){
        hand.add(card);
    }
    
    /**
     * @return the number of cards in hand
     */
    public int getHandSize(){
        return hand.size();
    }

    /**
     * @return the hand of cards
     */
    public List<Card> getCards() {
        return hand;
    }
}
