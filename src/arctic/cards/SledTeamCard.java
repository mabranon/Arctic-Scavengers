/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arctic.cards;

/**
 *
 * @author Joshua
 */
public class SledTeamCard extends Card{
    
    public SledTeamCard(){
        draw = 2;
        combat  = 1;
        population = 2;
        
        type = CardType.TRIBE;
        name = CardName.SLED_TEAM;
        
        contested = true;
    }
}
