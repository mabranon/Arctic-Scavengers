/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arctic.player;

import arctic.cards.BrawlerCard;
import arctic.cards.Card;
import arctic.cards.RefugeeCard;
import arctic.cards.ScavengerCard;
import arctic.cards.ShovelCard;
import arctic.cards.SpearCard;
import arctic.util.Deck;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Joshua
 */
public class PlayerDeck extends Deck{

    /**
     * Adds the 10 starter cards to a player's deck
     *  - 4 Refugees
     *  - 3 Scavengers
     *  - 1 Brawler
     *  - 1 Spear
     *  - 1 Shovel
     */
    @Override
    public void seedDeck(){
        // add refugee cards
        for(int i=0; i<4; i++){
            this.add(new RefugeeCard());
        }
        
        // add scavenger cards
        for(int i=0; i<3; i++){
            this.add(new ScavengerCard());
        }
        
        // add brawler cards
        this.add(new BrawlerCard());
        
        // add spear card
        this.add(new SpearCard());
        
        // add shovel
        this.add(new ShovelCard());
    }    
}
