/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package setup;

import arctic.engine.Board;

import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author AppleGrocer
 */
public class NewBoardTest {
        
    private final int NUM_PLAYERS = 3;
    private final Board board = new Board(NUM_PLAYERS);
    
    @Test
    public void hasTheRightNumberOfPlayers(){
        Assert.assertEquals(NUM_PLAYERS, board.getNumPlayers());
    }
    
    @Test
    public void hasAJunkyard(){
        Assert.assertNotNull(board.getJunkyard());
    }
    
    @Test
    public void hasAMarket(){
        Assert.assertNotNull(board.getMarket());
    }
    
    @Test
    public void hasContestedResources(){
        Assert.assertNotNull(board.getContestedResources());
    }
}
