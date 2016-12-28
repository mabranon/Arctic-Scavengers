/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arctic.core;

import arctic.board.ContestedResources;
import arctic.board.Junkyard;
import arctic.board.Market;
import arctic.player.Player;
import java.util.List;

/**
 *
 * @author Michael Branon
 */
public class MainGameEngine {
    
    private Market mercenaryMarket;
    private ContestedResources contestedResources;
    private Junkyard junkyard;
    
    private List<Player> players;
    
    public MainGameEngine(int numPlayers){
        for(int i=numPlayers; i>0; i--){
            players.add(new Player());
        }
        
        mercenaryMarket = new Market(numPlayers);
        
        contestedResources = new ContestedResources();
        contestedResources.seedDeck();
        
        junkyard = new Junkyard(numPlayers);
        junkyard.seedDeck();
    }
    
    public void drawStartingHands(){
        for(Player player : players){
            player.drawNewHand();
        }
    }
}
