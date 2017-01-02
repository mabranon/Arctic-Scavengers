/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package board_tests;

import arctic.board.ContestedResources;
import arctic.cards.Card;

import java.util.Iterator;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author AppleGrocer
 */
public class ContestedResourcesTest {

    @Test
    public void initializeNewContestedRsourcesDeck() throws Exception {
        // card counts
        int numCrew = 0;
        int numGrenade = 0;
        int numSled = 0;
        int numFam3 = 0;
        int numFam4 = 0;
        int numFam5 = 0;
        int numWolves = 0;

        // create and seed contested resources
        ContestedResources resources = new ContestedResources();
        resources.seedDeck();

        // iterate over contested recourses and keep track of card counts
        Iterator traveler = resources.getDeck().iterator();
        while (traveler.hasNext()) {
            switch (((Card) traveler.next()).getCardName()) {
                case FIELD_CREW:
                    numCrew++;
                    break;
                case GRENADE:
                    numGrenade++;
                    break;
                case SLED_TEAM:
                    numSled++;
                    break;
                case TRIBE_FAMILY_3:
                    numFam3++;
                    break;
                case TRIBE_FAMILY_4:
                    numFam4++;
                    break;
                case TRIBE_FAMILY_5:
                    numFam5++;
                    break;
                case WOLF_PACK:
                    numWolves++;
                    break;
                default:
                    Assert.fail("Illegal card type");
            }
        }
        
        // assert that counts equal expected values
        Assert.assertEquals(2, numCrew);
        Assert.assertEquals(2, numGrenade);
        Assert.assertEquals(2, numSled);
        Assert.assertEquals(2, numFam3);
        Assert.assertEquals(2, numFam4);
        Assert.assertEquals(2, numFam5);
        Assert.assertEquals(2, numWolves);
    }

}
