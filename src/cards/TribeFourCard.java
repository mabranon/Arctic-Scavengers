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
public class TribeFourCard extends Card{
    
    public TribeFourCard(){
        food = 0;
        combat = 0;
        population = 4;
        
        type = CardType.TRIBE;
        
        contested = true;
    }
    
}
