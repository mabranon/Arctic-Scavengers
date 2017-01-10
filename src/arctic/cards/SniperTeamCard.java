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
public class SniperTeamCard extends Card implements SpecialAction{
    
    public SniperTeamCard(){
 
        population = new StandardAttribute(2);
        
        type = CardType.TRIBE;
        name = CardName.SNIPER_TEAMS;
    }
    
    /**
     * TODO: Ability: Snipe one tribe member forcing it to be discarded
     */
    
}
