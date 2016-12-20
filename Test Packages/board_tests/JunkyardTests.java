/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package board_tests;

import java.util.Random;
import org.junit.Test;

import board.Junkyard;
import cards.Card;
import java.util.Iterator;
import org.junit.Assert;
/**
 *
 * @author Joshua
 */
public class JunkyardTests {
    
    @Test
    public void initializeNewJunkyard() throws Exception{
        int numJunk = 0;
        int numMultitools = 0;
        int numNets = 0;
        int numSpears = 0;
        int numPickaxes = 0;
        int numShovels = 0;
        int numMedkits = 0;
        int numPills = 0;
                
        int numPlayers = new Random().nextInt(5)+1;
        Junkyard junkyard = new Junkyard(numPlayers);
        
        Iterator traveler = junkyard.getYardContents().iterator();
        
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
