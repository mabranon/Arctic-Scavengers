/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arctic.board;

import arctic.cards.CardName;
import arctic.util.Deck;

/**
 *
 * @author AppleGrocer
 */
public class MercenaryDeck extends Deck{
    
    CardName mercenaryName;
    
    public MercenaryDeck(CardName mercenaryName){
        this.mercenaryName = mercenaryName;
    }
    
    /**
     * 
     */
    @Override
    public void seedDeck(){
        
    }
}
