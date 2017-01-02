/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package player_tests;

import arctic.cards.Card;
import java.util.Iterator;
import org.junit.Assert;
import org.junit.Test;
import arctic.player.PlayerDeck;

/**
 *
 * @author Joshua
 */
public class PlayerDeckTest {
    
    @Test
    public void initializeDeckTest(){
        // card counts        
        int numRefugees = 0;
        int numScavengers = 0;
        int numShovels = 0;
        int numBrawlers = 0;
        int numSpears = 0;
                
        // create and seed a new player deck
        PlayerDeck deck = new PlayerDeck();
        deck.seedDeck();
        
        // iterate and keep track of card counts
        Iterator traveler = deck.getDeck().iterator();
        while(traveler.hasNext()){
            switch(((Card)traveler.next()).getCardName()){
                case REFUGEE:
                    numRefugees++;
                    break;
                case SCAVENGER:
                    numScavengers++;
                    break;
                case BRAWLER:
                    numBrawlers++;
                    break;
                case SPEAR:
                    numSpears++;
                    break;
                case SHOVEL:
                    numShovels++;
                    break;
                default:
                    Assert.fail("Illegal card type");
            }
        }
        
        // assert that card counts equal the expected values
        Assert.assertEquals(4, numRefugees);
        Assert.assertEquals(3, numScavengers);
        Assert.assertEquals(1, numBrawlers);
        Assert.assertEquals(1, numSpears);
        Assert.assertEquals(1, numShovels);
    }
}
