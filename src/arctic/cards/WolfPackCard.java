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
public class WolfPackCard extends Card{
    
    public WolfPackCard(){
        food = new ModifierAttribute(3);
        combat = new ModifierAttribute(2);
        
        type = CardType.TOOL;
        name = CardName.WOLF_PACK;
        
        contested = true;
    }
    
}
