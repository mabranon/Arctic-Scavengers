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
public class SaboteurCard extends Card implements SpecialAction{
    
    public SaboteurCard(){
        search = new StandardAttribute(1);
        combat = new StandardAttribute(1);
        population = new StandardAttribute(1);
        
        type = CardType.TRIBE;
        name = CardName.SABOTEUR;
    }
    
    /**
     * TODO: Ability: Disarm one tool card, forcing it to be discarded
     */
}
