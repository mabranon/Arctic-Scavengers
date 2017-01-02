/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arctic.communal_decks;

import arctic.cards.BrawlerCard;
import arctic.cards.CardName;
import arctic.cards.GroupLeadersCard;
import arctic.cards.HunterCard;
import arctic.cards.SaboteurCard;
import arctic.cards.ScavengerCard;
import arctic.cards.ScoutCard;
import arctic.cards.SniperTeamCard;
import arctic.cards.ThugsCard;
import arctic.util.Deck;

/**
 *
 * @author AppleGrocer
 */
public class MercenaryDeck extends Deck{
    
    CardName mercenaryName;
    int numPlayers;
    
    public MercenaryDeck(int numPlayers, CardName mercenaryName){
        switch(mercenaryName){
            case BRAWLER:
            case HUNTER:
            case SABOTEUR:
            case SCAVENGER:
            case SCOUT:
            case SNIPER_TEAMS:
            case THUGS:
            case GROUP_LEADERS:
                this.mercenaryName = mercenaryName;
                this.numPlayers = numPlayers;
                break;
            default:
                throw new IllegalArgumentException("Card name is not a valid "
                        + "mercenary");
        }
    }
    
      
    /**
     * adds the starter cards for a mercenary deck
     */
    @Override
    public void seedDeck() {
        switch(mercenaryName){
            case BRAWLER:
                for(int i=0; i<10-numPlayers; i++){
                    this.add(new BrawlerCard());
                }
                break;
            case HUNTER:
                for(int i=0; i<8; i++){
                    this.add(new HunterCard());
                }
                break;
            case SABOTEUR:
                for(int i=0; i<8; i++){
                    this.add(new SaboteurCard());
                }
                break;
            case SCOUT:
                for(int i=0; i<8; i++){
                    this.add(new ScoutCard());
                }
                break;
            case SCAVENGER:
                for(int i=0; i<20-(numPlayers*3); i++){
                    this.add(new ScavengerCard());
                }
                break;
            case SNIPER_TEAMS:
                for(int i=0; i<5; i++){
                    this.add(new SniperTeamCard());
                }
                break;
            case THUGS:
                for(int i=0; i<5; i++){
                    this.add(new ThugsCard());
                }
                break;
            case GROUP_LEADERS:
                for(int i=0; i<5; i++){
                    this.add(new GroupLeadersCard());
                }
        }
    }
}
