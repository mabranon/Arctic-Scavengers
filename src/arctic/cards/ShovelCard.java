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
public class ShovelCard extends Card{
    
    public ShovelCard(){
        search = new ModifierAttribute(2);
        combat = new ModifierAttribute(1);
        
        type = CardType.TOOL;
        name = CardName.SHOVEL;
    }
    
}
