/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arctic.communal_decks;

import arctic.cards.FieldCrewCard;
import arctic.cards.GrenadeCard;
import arctic.cards.SledTeamCard;
import arctic.cards.TribeFiveCard;
import arctic.cards.TribeFourCard;
import arctic.cards.TribeThreeCard;
import arctic.cards.WolfPackCard;
import arctic.util.Deck;

/**
 *
 * @author Joshua
 */
public class ContestedResources extends Deck{
    
    @Override
    public void seedDeck() {
        for(int i=0; i<2; i++){
            this.add(new GrenadeCard());
            this.add(new FieldCrewCard());
            this.add(new SledTeamCard());
            this.add(new WolfPackCard());
            this.add(new TribeThreeCard());
            this.add(new TribeFourCard());
            this.add(new TribeFiveCard());
        }
    }
    
}
