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
        population = new StandardAttribute(2);
        
        draw = new ModifierAttribute(2);
        search = new ModifierAttribute(2);
        food = new ModifierAttribute(2);
        combat = new ModifierAttribute(2);
        
        type = CardType.TRIBE;
        name = CardName.GROUP_LEADERS;
    }
    
    /**
     * TODO: Ability: Can be used with Group Leaders or tools. (Stackable)
     */
}
