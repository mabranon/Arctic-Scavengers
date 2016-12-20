/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package player_tests;

import cards.Card;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import org.junit.Assert;
import org.junit.Test;
import player.Deck;

/**
 *
 * @author Joshua
 */
public class DeckTests {
    
    @Test
    public void initializeDeckTest(){
                
        int numRefugees = 0;
        int numScavengers = 0;
        int numShovels = 0;
        int numBrawlers = 0;
        int numSpears = 0;
                
        Deck deck = new Deck();
        
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
        
        Assert.assertEquals(4, numRefugees);
        Assert.assertEquals(3, numScavengers);
        Assert.assertEquals(1, numBrawlers);
        Assert.assertEquals(1, numSpears);
        Assert.assertEquals(1, numShovels);
    }
    
    @Test
    public void shuffleDeckTest(){
        Deck deck = new Deck();
        boolean mismatch = false;
        
        List<Card> deckOriginal = new ArrayList(deck.getDeck());
        deck.shuffleDeck();
        
        for(int i=0; i<deckOriginal.size(); i++){
            if(deckOriginal.get(i) != deck.getDeck().get(i)){
                mismatch = true;
            }
        }
        
        Assert.assertEquals(true, mismatch);
    }
    
}
