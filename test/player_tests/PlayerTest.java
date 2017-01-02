/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package player_tests;

import arctic.cards.Card;
import arctic.player.Player;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author Joshua
 */
public class PlayerTest {
    
    @Test
    public void drawStartingHandTest(){
        Player player = new Player();
        
        List<Card> topDeck = new ArrayList<>();
        for(int i=0; i<5; i++){
            topDeck.add(player.getDeck().getDeck().get(i));
        }
        
        player.drawNewHand();
        Assert.assertEquals(5, player.getHand().size());
        
        for(int i=0; i<player.getHand().size(); i++){
            if(player.getHand().get(i) != topDeck.get(i)){
                Assert.fail("Hand does not match what should have been drawn");
            }
        }        
    }
    
    @Test
    public void trashCardTest(){
        // create a new player and draw a hand
        Player player = new Player();
        player.drawNewHand();
        
        // record original player hand
        List<Card> originalCards = new ArrayList<>();
        originalCards.addAll(player.getHand());
        // list of cards to trash
        List<Card> listToTrash = new ArrayList<>();
        listToTrash.addAll(Arrays.asList(
                player.getHand().get(0),
                player.getHand().get(2),
                player.getHand().get(3)
        ));
        
        // trash the cards
        player.trash(listToTrash);
        
        Assert.assertEquals(2, player.getHand().size());
        Assert.assertFalse(player.getHand().contains(originalCards.get(0)));
        Assert.assertFalse(player.getHand().contains(originalCards.get(2)));
        Assert.assertFalse(player.getHand().contains(originalCards.get(3)));
    }
}
