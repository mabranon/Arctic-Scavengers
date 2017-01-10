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
public class FieldCrewCard extends Card{
    
    public FieldCrewCard(){
        search = new StandardAttribute(2);
        food = new StandardAttribute(2);
        combat = new StandardAttribute(2);
        population = new StandardAttribute(4);
        
        type = CardType.TRIBE;
        name = CardName.FIELD_CREW;
        
        contested = true;
        
    }
    
}
