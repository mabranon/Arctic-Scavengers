/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arctic.player;

/**
 *
 * @author Joshua
 */
public class Player {
    
    private PlayerDeck deck;
    private Hand hand;
    
    public Player(){
        deck = new PlayerDeck();
        deck.seedDeck();
        deck.shuffle();
        
        hand = new Hand();
    }
    
    /**
     * draws a hand of 5 cards from the deck and adds them to the player's hand
     */
    public void drawNewHand(){
        for(int i=0; i<5; i++){
            getHand().add(getDeck().draw());
        }
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
    public Hand getHand() {
        return hand;
    }
    
}
