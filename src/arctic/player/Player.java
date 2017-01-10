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
    
    private final PlayerType type;
    private final PlayerDeck deck;
    private final List<Card> hand;
    private final List<Card> discardPile;
    
    private int foodStore;
    private int medicineStore;
        
    public Player(PlayerType type){
        this.type = type;
                
        deck = new PlayerDeck();
        deck.shuffle();
        
        hand = new ArrayList<>();
        
        discardPile = new ArrayList<>();
        
        foodStore = 0;
        medicineStore = 0;
    }
    
    /**
     * draws a hand of 5 cards from the deck and adds them to the player's hand
     */
    public void drawNewHand(){
        for(int i=0; i<5; i++){
            hand.add(deck.draw());
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
     * @param discardedCard
     */
    public void discardFromHand(Card discardedCard){
        hand.remove(discardedCard);
        discardPile.add(discardedCard);
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
     * Adds the passed card to the bottom of the player's discard pile
     * @param card 
     */
    public void addCardToDiscardPile(Card card){
        discardPile.add(card);
    }
    
    /**
     * method re-shuffles the discard pile into the deck
     */
    public void recyCycleDiscard(){
        deck.add(discardPile);
        deck.shuffle();
        
        discardPile.clear();
    }  
    
    /**
     * method resets food and medicine stores of player to 0. This is meant to
     * be reset at the end of the players turn
     */
    public void resetStores(){
        foodStore = 0;
        medicineStore = 0;
    }

    public PlayerType getType() {
        return type;
    }

    public int getFoodStore() {
        return foodStore;
    }

    public void addToFoodStore(int food) {
        this.foodStore += food;
    }

    public int getMedicineStore() {
        return medicineStore;
    }

    public void addToMedicineStore(int medicine) {
        this.medicineStore += medicine;
    }
}
