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
 * @author Joshua
 */
public class Market {

    private final Deck brawlers;
    private final Deck hunters;
    private final Deck saboteurs;
    private final Deck scouts;
    private final Deck groupLeaders;
    private final Deck sniperTeams;
    private final Deck thugs;
    private final Deck scavengers;

    public Market(int numPlayers) {
        brawlers = new Deck();
        hunters = new Deck();
        saboteurs = new Deck();
        scouts = new Deck();
        groupLeaders = new Deck();
        sniperTeams = new Deck();
        thugs = new Deck();
        scavengers = new Deck();

        // add brawlers to market
        for (int i = 0; i < 10 - numPlayers; i++) {
            brawlers.add(new BrawlerCard());
        }

        // add hunters, saboteurs, and scouts to market
        for (int i = 0; i < 8; i++) {
            hunters.add(new HunterCard());
            saboteurs.add(new SaboteurCard());
            scouts.add(new ScoutCard());
        }

        // add group leaders, sniper teams, and thugs to market
        for (int i = 0; i < 5; i++) {
            groupLeaders.add(new GroupLeadersCard());
            sniperTeams.add(new SniperTeamCard());
            thugs.add(new ThugsCard());
        }

        // add scavengers to market
        for (int i = 0; i < 20 - (numPlayers * 3); i++) {
            scavengers.add(new ScavengerCard());
        }
    }
}
