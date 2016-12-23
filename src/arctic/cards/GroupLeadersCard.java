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
public class GroupLeadersCard extends Card{
    
    public GroupLeadersCard(){
        population = 2;
        
        augDraw = 2;
        augSearch = 2;
        augFood = 2;
        augCombat = 2;
        
        type = CardType.TRIBE;
        name = CardName.GROUP_LEADERS;
    }
    
    /**
     * TODO: Ability: Can be used with Group Leaders or tools. (Stackable)
     */
}
