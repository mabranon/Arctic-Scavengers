/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.player_tests;

import org.junit.Test;

import arctic.cards.BrawlerCard;
import arctic.cards.Card;
import arctic.cards.RefugeeCard;
import arctic.cards.SpearCard;
import org.junit.Assert;
import arctic.player.Hand;

/**
 *
 * @author Joshua
 */
public class HandTest {
    
    @Test
    public void addCardToHandTest(){
 
        int numBrawlers = 0;
        int numRefugees = 0;
        Hand hand = new Hand();
        
        hand.add(new RefugeeCard());
        hand.add(new BrawlerCard());
        hand.add(new RefugeeCard());
        
        for(Card card : hand.getCards()){
            switch(card.getCardName()){
                case BRAWLER:
                    numBrawlers++;
                    break;
                case REFUGEE:
                    numRefugees++;
                    break;
                default:
                    Assert.fail(card.getCardName() + 
                            " is an illegal card name");
            }
        }     
        
        Assert.assertEquals(2, numRefugees);
        Assert.assertEquals(1, numBrawlers);
    }
}
