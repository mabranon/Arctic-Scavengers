/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arctic.util;

import arctic.cards.Card;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author AppleGrocer
 */
public abstract class Deck {
    
    private List<Card> deck;
    
    public Deck(){
        deck = new ArrayList<>();
    }
    
    /**
     * draws the top card off the deck
     * @return the first card on the deck 
     */
    public Card draw(){
        return getDeck().remove(0);
    }
    
    /**
     * shuffles the deck
     */
    public void shuffle(){
        Collections.shuffle(getDeck());
    }
    
    /**
     * adds a card to the deck
     * @param card 
     */
    public void add(Card card){
        getDeck().add(card);
    }
    
    /**
     * adds a list of cards to the deck
     * @param list 
     */
    public void add(List<Card> list){
        getDeck().addAll(list);
    }

    /**
     * @return the deck
     */
    public List<Card> getDeck() {
        return deck;
    }
    
    public abstract void seedDeck();
}
