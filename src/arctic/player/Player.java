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
public class Player {
    
    private final PlayerDeck deck;
    private final List<Card> hand;
    private final List<Card> discardPile;
        
    public Player(){
        deck = new PlayerDeck();
        deck.shuffle();
        
        hand = new ArrayList<>();
        
        discardPile = new ArrayList<>();
        
    }
    
    /**
     * draws a hand of 5 cards from the deck and adds them to the player's hand
     */
    public void drawNewHand(){
        for(int i=0; i<5; i++){
            hand.add(getDeck().draw());
        }
    }

    /**
     * method draws a number of cards from the player's deck and adds them to
     * the players hand
     * @param numCards number of cards to draw 
     */
    public void draw(int numCards){
        while(numCards>0){
            if(deck.isEmpty()){
                this.recyCycleDiscard();
            }
            hand.add(deck.draw());
            numCards--;
        }
    }
    
    /**
     * method removes a card from players hand
     * @param index the index of the card to be removed in the hand
     */
    public void discard(int index){
        discardPile.add(hand.remove(index));
    }
    
    /**
     * @return the player's current deck
     */
    public PlayerDeck getDeck() {
        return deck;
    }

    /**
     * @return the player's current hand
     */
    public List<Card> getHand() {
        return hand;
    }
    
    public void trash(List<Card> cardsToTrash){
        hand.removeAll(cardsToTrash);
    }
    
    /**
     * @return the players discard pile 
     */
    public List getDiscardPile(){
        return discardPile;
    }
    
    /**
     * method re-shuffles the discard pile into the deck
     */
    public void recyCycleDiscard(){
        deck.add(discardPile);
        deck.shuffle();
        
        discardPile.clear();
    }  
}
