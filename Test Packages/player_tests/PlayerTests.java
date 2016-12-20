/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package player_tests;

import cards.Card;
import java.util.ArrayList;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

import player.Player;

/**
 *
 * @author Joshua
 */
public class PlayerTests {
    
    @Test
    public void drawStartingHandTest(){
        Player player = new Player();
        
        List<Card> topDeck = new ArrayList<>();
        for(int i=0; i<7; i++){
            topDeck.add(player.getDeck().getCards().get(i));
        }
        
        player.drawStartingHand();
        Assert.assertEquals(7, player.getHand().getCards().size());
        
        for(int i=0; i<player.getHand().getCards().size(); i++){
            if(player.getHand().getCards().get(i) != topDeck.get(i)){
                Assert.fail("Hand does not match what should have been drawn");
            }
        }        
    }
}
