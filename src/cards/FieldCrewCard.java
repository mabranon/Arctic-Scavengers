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
public class FieldCrewCard extends Card{
    
    public FieldCrewCard(){
        search = 2;
        food = 2;
        combat = 2;
        population = 4;
        
        type = CardType.TRIBE;
        
        contested = true;
        
    }
    
}
