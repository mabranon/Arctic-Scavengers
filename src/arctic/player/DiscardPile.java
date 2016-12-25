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
public class DiscardPile {
    
    private List<Card> discardPile;
    
    public DiscardPile(){
        discardPile=new ArrayList<>();
    }
    
    public List getDiscardPile(){
        return discardPile;
    }
    
    /**
     * adds a card to the discard pile
     * @param card 
     */
    public void add(Card card){
        discardPile.add(card);
    }
}
