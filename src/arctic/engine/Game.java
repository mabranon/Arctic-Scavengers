/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arctic.engine;

import arctic.board.Board;
import arctic.player.Player;
import arctic.player.PlayerType;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author AppleGrocer
 */
public class Game {
    
    private final int numPlayers;
    private final Board board;
    private final List<Player> playerList;
    private Player initiatorPlayer;
    private Player playerTakingTurn;
    
    public Game(int numPlayers){
        this.numPlayers = numPlayers;
        
        board = new Board(this.numPlayers);
        
        playerList = new ArrayList<>();
        playerList.add(new Player(PlayerType.HUMAN));
        for(int i=0; i<this.numPlayers-1; i++){
            playerList.add(new Player(PlayerType.CPU));
        }
        
        // randomly picks first initiator
        initiatorPlayer = playerList.get(new Random().nextInt(numPlayers));
        playerTakingTurn = initiatorPlayer;
    }
           
    /**
     * completes the turn of the current player, resetting their stores and 
     * passing play
     */
    public void completeTurn(){
        playerTakingTurn.resetStores();
        playerTakingTurn = nextPlayer(playerTakingTurn);
    }
    
    /**
     * method passes the initiative to the next player while also passing the
     * the next turn to that initiating player
     */
    public void passInitiative(){
        initiatorPlayer = nextPlayer(initiatorPlayer);
        playerTakingTurn = initiatorPlayer;
    }
    
    private Player nextPlayer(Player current){
        return playerList.get(playerList.indexOf(current)+1 % numPlayers);
    }
}
