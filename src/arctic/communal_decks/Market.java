/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arctic.communal_decks;

import arctic.cards.CardName;

/**
 *
 * @author Joshua
 */
public class Market {
    
    private MercenaryDeck brawlers;
    private MercenaryDeck hunters;
    private MercenaryDeck saboteurs;
    private MercenaryDeck scouts;
    private MercenaryDeck groupLeaders;
    private MercenaryDeck sniperTeams;
    private MercenaryDeck thugs;
    private MercenaryDeck scavengers;
    
    public Market(int numPlayers){
        brawlers = new MercenaryDeck(numPlayers, CardName.BRAWLER);
        brawlers.seedDeck();
        
        hunters = new MercenaryDeck(numPlayers, CardName.HUNTER);
        hunters.seedDeck();
        
        saboteurs = new MercenaryDeck(numPlayers, CardName.SABOTEUR);
        saboteurs.seedDeck();
        
        scouts = new MercenaryDeck(numPlayers, CardName.SCOUT);
        scouts.seedDeck();
        
        groupLeaders = new MercenaryDeck(numPlayers, CardName.GROUP_LEADERS);
        groupLeaders.seedDeck();
        
        sniperTeams = new MercenaryDeck(numPlayers, CardName.SNIPER_TEAMS);
        sniperTeams.seedDeck();
        
        thugs = new MercenaryDeck(numPlayers, CardName.THUGS);
        thugs.seedDeck();
        
        scavengers = new MercenaryDeck(numPlayers, CardName.SCAVENGER);
        scavengers.seedDeck();
    }

    /**
     * @return the brawlers available on the market
     */
    public MercenaryDeck getBrawlers() {
        return brawlers;
    }

    /**
     * @return the hunters available on the market
     */
    public MercenaryDeck getHunters() {
        return hunters;
    }

    /**
     * @return the saboteurs available on the market
     */
    public MercenaryDeck getSaboteurs() {
        return saboteurs;
    }

    /**
     * @return the scouts available on the market
     */
    public MercenaryDeck getScouts() {
        return scouts;
    }

    /**
     * @return the groupLeaders available on the market
     */
    public MercenaryDeck getGroupLeaders() {
        return groupLeaders;
    }

    /**
     * @return the sniperTeams available on the market
     */
    public MercenaryDeck getSniperTeams() {
        return sniperTeams;
    }

    /**
     * @return the thugs available on the market
     */
    public MercenaryDeck getThugs() {
        return thugs;
    }

    /**
     * @return the scavengers available on the market
     */
    public MercenaryDeck getScavengers() {
        return scavengers;
    }
}
