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
public class TribeThreeCard extends Card{
    
    public TribeThreeCard(){
        hunt = new StandardAttribute(0);
        combat = new StandardAttribute(0);
        population = new StandardAttribute(3);
        
        type = CardType.TRIBE;
        name = CardName.TRIBE_FAMILY_3;
        
        contested = true;
    }
    
}
