/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arctic.board_tests;

import org.junit.Test;

import arctic.board.Market;
import java.util.Random;
import org.junit.Assert;

/**
 *
 * @author Michael Branon
 */
public class MarketTests {
    
    @Test
    public void intializeNewMarket(){
        int numPlayers = new Random().nextInt(5)+1;
        Market market = new Market(numPlayers);
        
        Assert.assertEquals((10 - numPlayers), market.getBrawlers().size());
        Assert.assertEquals(8, market.getHunters().size());
        Assert.assertEquals(8, market.getSaboteurs().size());
        Assert.assertEquals(8, market.getScouts().size());
        Assert.assertEquals(5, market.getGroupLeaders().size());
        Assert.assertEquals(5, market.getSniperTeams().size());
        Assert.assertEquals(5, market.getThugs().size());
        Assert.assertEquals((20 - (numPlayers * 3)), 
                market.getScavengers().size());
        Assert.assertEquals(8, market.getSaboteurs().size());
    }
}
