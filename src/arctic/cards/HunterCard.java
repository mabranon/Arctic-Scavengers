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
public class HunterCard extends Card{
    
    public HunterCard(){
        hunt = new StandardAttribute(2);
        combat = new StandardAttribute(1);
        population = new StandardAttribute(1);
        
        type = CardType.TRIBE;
        name = CardName.HUNTER;
    }
}
