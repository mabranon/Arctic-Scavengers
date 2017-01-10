/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arctic.board;

import arctic.cards.Card;
import arctic.communal_decks.ContestedResources;
import arctic.communal_decks.Junkyard;
import arctic.communal_decks.Market;
import java.util.List;

/**
 *
 * @author AppleGrocer
 */
public class Board {
    
    private final int numPlayers; 
    
    private final Junkyard junkyard;
    private final Market market;
    private final ContestedResources contestedResources;
    
    public Board(int numPlayers){
        this.numPlayers = numPlayers;
        
        junkyard = new Junkyard(this.numPlayers);
        market = new Market(this.numPlayers);
        contestedResources = new ContestedResources();        
    }
    
    /**
     * Draws the top card of the junkyard
     * @return a card
     */
    public Card drawFromJunkyard(){
        return junkyard.draw();
    }
    
    /**
     * Adds a list of cards to the bottom of the junkyard
     * @param cardsIgnored a list of cards 
     */
    public void returnToJunkyard(List<Card> cardsIgnored){
        junkyard.add(cardsIgnored);
    }
    
    public Market getMarket(){
        return market;
    }
    
    public ContestedResources getContestedResources(){
        return contestedResources;
    }
}
