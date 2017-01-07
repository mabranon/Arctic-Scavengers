/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arctic.communal_decks;

import arctic.cards.JunkCard;
import arctic.cards.MedkitCard;
import arctic.cards.MultitoolCard;
import arctic.cards.NetCard;
import arctic.cards.PickaxeCard;
import arctic.cards.PillsCard;
import arctic.cards.ShovelCard;
import arctic.cards.SpearCard;
import arctic.util.Deck;

/**
 *
 * @author Joshua
 */
public class Junkyard extends Deck{  
    
    int numPlayers;
    
    /**
     * Constructs a junkyard
     *  - 4 multitools
     *  - 4 pickaxes
     *  - 4 nets
     *  - 6 medkits
     *  - 9 pills
     *  - 7 junks
     *  - up to 6 shovels (dependent on number of players)
     *  - up to 6 spears ( dependent on number of players)
     * @param numPlayers
     */    
    public Junkyard(int numPlayers){
        this.numPlayers = numPlayers;
        
        // add multitools, nets, and pickaxes to junkyard
        for(int i=0; i<4; i++){
            deck.add(new MultitoolCard());
            deck.add(new NetCard());
            deck.add(new PickaxeCard());
        }
        
        // add player number dependent tools
        for(int i=0; i<6-numPlayers; i++){
            deck.add(new ShovelCard());
            deck.add(new SpearCard());
        }
        
        // add medkits
        for(int i=0; i<6; i++){
            deck.add(new MedkitCard());
        }
        
        // add pills
        for(int i=0; i<9; i++){
            deck.add(new PillsCard());
        }
        
        // add junk
        for(int i=0; i<7; i++){
            deck.add(new JunkCard());
        }
    }    
}
