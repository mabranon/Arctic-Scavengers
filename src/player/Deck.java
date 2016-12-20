/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package player;

import cards.BrawlerCard;
import cards.Card;
import cards.RefugeeCard;
import cards.ScavengerCard;
import cards.ShovelCard;
import cards.SpearCard;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Joshua
 */
public class Deck {
    
    private List<Card> deck;
    
    public Deck(){
        deck = new ArrayList<>();
        
        // add refugee cards
        for(int i=0; i<4; i++){
            deck.add(new RefugeeCard());
        }
        
        // add scavenger cards
        for(int i=0; i<3; i++){
            deck.add(new ScavengerCard());
        }
        
        // add brawler cards
        deck.add(new BrawlerCard());
        
        // add spear card
        deck.add(new SpearCard());
        
        // add shovel
        deck.add(new ShovelCard());
    }

    /**
     * @return the deck
     */
    public List<Card> getDeck() {
        return deck;
    }
    
    /**
     * shuffles deck
     */
    public void shuffleDeck(){
        Collections.shuffle(deck);
    }
    
    /**
     * draws the top card off the deck
     * @return the first card on the deck 
     */
    public Card draw(){
        return deck.remove(0);
    }
    
}
