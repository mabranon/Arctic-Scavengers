/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cards;

/**
 *
 * @author Joshua
 */
public class SaboteurCard extends Card implements SpecialAction{
    
    SaboteurCard(){
        search = 1;
        combat = 1;
        population = 1;
        
        type = CardType.TRIBE;
    }
    
    /**
     * TODO: Ability: Disarm one tool card, forcing it to be discarded
     */
}
