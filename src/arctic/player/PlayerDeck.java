/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arctic.player;

import arctic.cards.BrawlerCard;
import arctic.cards.RefugeeCard;
import arctic.cards.ScavengerCard;
import arctic.cards.ShovelCard;
import arctic.cards.SpearCard;
import arctic.util.Deck;

/**
 *
 * @author Joshua
 */
public class PlayerDeck extends Deck {

    /**
     * Constructs a new player deck
     * 4 Refugees - 3 Scavengers - 1 Brawler - 1 Spear - 1 Shovel
     */
    public PlayerDeck() {
        // add refugee cards
        for (int i = 0; i < 4; i++) {
            deck.add(new RefugeeCard());
        }

        // add scavenger cards
        for (int i = 0; i < 3; i++) {
            deck.add(new ScavengerCard());
        }

        // add brawler cards
        deck.add(new BrawlerCard());

        // add spear card
        deck.add(new SpearCard());

        // add shovel
        deck.add(new ShovelCard());
    }

    

}
