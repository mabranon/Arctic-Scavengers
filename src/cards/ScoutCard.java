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
public class ScoutCard extends Card{
    
    public ScoutCard(){
        draw = 2;
        combat = 2;
        population = 1;
        
        type = CardType.TRIBE;
    }
}
