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
public class RefugeeCard extends Card{
    
    public RefugeeCard(){
        search = 0;
        food = 0;
        population = 1;   
        
        type = CardType.TRIBE;
        name = CardName.REFUGEE;
    }
}
