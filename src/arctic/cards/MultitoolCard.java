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
public class MultitoolCard extends Card{
    
    public MultitoolCard(){
        augSearch = 1;
        augFood = 1;
        augCombat = 1;
        
        type = CardType.TOOL;
        name = CardName.MULTITOOL;
    }
    
}
