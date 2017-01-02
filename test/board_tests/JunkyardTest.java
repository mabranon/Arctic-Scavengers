/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package board_tests;

import java.util.Random;
import org.junit.Test;

import arctic.board.Junkyard;
import arctic.cards.Card;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.junit.Assert;
/**
 *
 * @author Joshua
 */
public class JunkyardTest {
    
    @Test
    public void initializeNewJunkyard() throws Exception{
        // card counts        
        int numJunk = 0;
        int numMultitools = 0;
        int numNets = 0;
        int numSpears = 0;
        int numPickaxes = 0;
        int numShovels = 0;
        int numMedkits = 0;
        int numPills = 0;
                
        // create and seed a new junkyard for a random number of players
        int numPlayers = new Random().nextInt(5)+1;
        Junkyard junkyard = new Junkyard(numPlayers);
        junkyard.seedDeck();
        
        // iterate over the junkyard and keep track of card counts
        Iterator traveler = junkyard.getDeck().iterator();
        while(traveler.hasNext()){
            switch(((Card)traveler.next()).getCardName()){
                case JUNK:
                    numJunk++;
                    break;
                case MULTITOOL:
                    numMultitools++;
                    break;
                case NET:
                    numNets++;
                    break;
                case SPEAR:
                    numSpears++;
                    break;
                case PICKAXE:
                    numPickaxes++;
                    break;
                case SHOVEL:
                    numShovels++;
                    break;
                case MEDKIT:
                    numMedkits++;
                    break;
                case PILLS:
                    numPills++;
                    break;
                default:
                    Assert.fail("Illegal card type");
            }
        }
        
        // ensure card counts equal expected values
        Assert.assertEquals(7, numJunk);
        Assert.assertEquals(4, numMultitools);
        Assert.assertEquals(4, numNets);
        Assert.assertEquals(6-numPlayers, numSpears);
        Assert.assertEquals(4, numPickaxes);
        Assert.assertEquals(6-numPlayers, numShovels);
        Assert.assertEquals(6, numMedkits);
        Assert.assertEquals(9, numPills);
    }
}
