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
public class ScoutCard extends Card{
    
    public ScoutCard(){
        draw = new StandardAttribute(2);
        combat = new StandardAttribute(2);
        population = new StandardAttribute(1);
        
        type = CardType.TRIBE;
        name = CardName.SCOUT;
    }
}
