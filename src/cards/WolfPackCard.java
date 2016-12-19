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
public class WolfPackCard extends Card{
    
    public WolfPackCard(){
        augFood = 3;
        augCombat = 2;
        
        type = CardType.TOOL;
        
        contested = true;
    }
    
}
