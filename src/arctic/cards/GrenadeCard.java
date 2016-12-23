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
public class GrenadeCard extends Card{
    
    public GrenadeCard(){
        augCombat = 3;
        
        type = CardType.TOOL;
        name = CardName.GRENADE;
        
        contested = true;
    }
    
}
