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
public class MedkitCard extends Card{
    
    public MedkitCard(){
        medicine = new StandardAttribute(2);
        
        type = CardType.MEDS;
        name = CardName.MEDKIT;
    }
    
}
