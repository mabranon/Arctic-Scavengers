/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arctic.board;

import arctic.communal_decks.ContestedResources;
import arctic.communal_decks.Junkyard;
import arctic.communal_decks.Market;
import arctic.player.Player;

import java.util.ArrayList;
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
    
    public Junkyard getJunkyard(){
        return junkyard;
    }
    
    public Market getMarket(){
        return market;
    }
    
    public ContestedResources getContestedResources(){
        return contestedResources;
    }
}
