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
public class PillsCard extends Card{
    
    public PillsCard(){
        medicine = new StandardAttribute(1);
        
        type = CardType.MEDS;
        name = CardName.PILLS;
    }
    
}
