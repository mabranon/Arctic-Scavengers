/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arctic.engine;

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
    
    private final int NUM_PLAYERS; 
    private final List<Player> players;
    
    private final Junkyard junkyard;
    private final Market market;
    private final ContestedResources contestedResources;
    
    public Board(int numPlayers){
        NUM_PLAYERS = numPlayers;
        players = new ArrayList<>();
        for(int i=0; i<NUM_PLAYERS; i++){
            players.add(new Player());
        }
        
        junkyard = new Junkyard(NUM_PLAYERS);
        market = new Market(NUM_PLAYERS);
        contestedResources = new ContestedResources();        
    }
    
    public int getNumPlayers(){
        return players.size();
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
