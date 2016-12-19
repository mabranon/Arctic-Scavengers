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
public class HunterCard extends Card{
    
    public HunterCard(){
        food = 2;
        combat = 1;
        population = 1;
        
        type = CardType.TRIBE;
    }
}
