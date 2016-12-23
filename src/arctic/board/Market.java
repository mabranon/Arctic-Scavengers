/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arctic.board;

import arctic.cards.BrawlerCard;
import arctic.cards.GroupLeadersCard;
import arctic.cards.HunterCard;
import arctic.cards.SaboteurCard;
import arctic.cards.ScavengerCard;
import arctic.cards.ScoutCard;
import arctic.cards.SniperTeamCard;
import arctic.cards.ThugsCard;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Joshua
 */
public class Market {
    
    private List<BrawlerCard> brawlers;
    private List<HunterCard> hunters;
    private List<SaboteurCard> saboteurs;
    private List<ScoutCard> scouts;
    private List<GroupLeadersCard> groupLeaders;
    private List<SniperTeamCard> sniperTeams;
    private List<ThugsCard> thugs;
    private List<ScavengerCard> scavengers;
    
    public Market(int numPlayers){
        brawlers = new ArrayList();
        for(int i=0; i<10-numPlayers; i++){
            brawlers.add(new BrawlerCard());
        }
        
        hunters = new ArrayList();
        for(int i=0; i<8; i++){
            hunters.add(new HunterCard());
        }
        
        saboteurs = new ArrayList();
        for(int i=0; i<8; i++){
            saboteurs.add(new SaboteurCard());
        }
        
        scouts = new ArrayList();
        for(int i=0; i<8; i++){
            scouts.add(new ScoutCard());
        }
        
        groupLeaders = new ArrayList();
        for(int i=0; i<5; i++){
            groupLeaders.add(new GroupLeadersCard());
        }
        
        sniperTeams = new ArrayList();
        for(int i=0; i<5; i++){
            sniperTeams.add(new SniperTeamCard());
        }
        
        thugs = new ArrayList();
        for(int i=0; i<5; i++){
            thugs.add(new ThugsCard());
        }
        
        scavengers = new ArrayList();
        for(int i=0; i<20-(numPlayers*3); i++){
            scavengers.add(new ScavengerCard());
        }
    }

    /**
     * @return the brawlers available on the market
     */
    public List<BrawlerCard> getBrawlers() {
        return brawlers;
    }

    /**
     * @return the hunters available on the market
     */
    public List<HunterCard> getHunters() {
        return hunters;
    }

    /**
     * @return the saboteurs available on the market
     */
    public List<SaboteurCard> getSaboteurs() {
        return saboteurs;
    }

    /**
     * @return the scouts available on the market
     */
    public List<ScoutCard> getScouts() {
        return scouts;
    }

    /**
     * @return the groupLeaders available on the market
     */
    public List<GroupLeadersCard> getGroupLeaders() {
        return groupLeaders;
    }

    /**
     * @return the sniperTeams available on the market
     */
    public List<SniperTeamCard> getSniperTeams() {
        return sniperTeams;
    }

    /**
     * @return the thugs available on the market
     */
    public List<ThugsCard> getThugs() {
        return thugs;
    }

    /**
     * @return the scavengers available on the market
     */
    public List<ScavengerCard> getScavengers() {
        return scavengers;
    }
}
