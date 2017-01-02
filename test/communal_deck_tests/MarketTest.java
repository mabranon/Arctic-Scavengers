/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package communal_deck_tests;

import org.junit.Test;

import arctic.communal_decks.Market;
import java.util.Random;
import org.junit.Assert;

/**
 *
 * @author Michael Branon
 */
public class MarketTest {
    
    @Test
    public void intializeNewMarket(){
        // create a new mercenary market for a random number of players
        int numPlayers = new Random().nextInt(5)+1;
        Market market = new Market(numPlayers);
        
        // assert that card counts equal the expected values
        Assert.assertEquals((10 - numPlayers), 
                market.getBrawlers().getDeck().size());
        Assert.assertEquals(8, market.getHunters().getDeck().size());
        Assert.assertEquals(8, market.getSaboteurs().getDeck().size());
        Assert.assertEquals(8, market.getScouts().getDeck().size());
        Assert.assertEquals(5, market.getGroupLeaders().getDeck().size());
        Assert.assertEquals(5, market.getSniperTeams().getDeck().size());
        Assert.assertEquals(5, market.getThugs().getDeck().size());
        Assert.assertEquals((20 - (numPlayers * 3)), 
                market.getScavengers().getDeck().size());
        Assert.assertEquals(8, market.getSaboteurs().getDeck().size());
    }
}
