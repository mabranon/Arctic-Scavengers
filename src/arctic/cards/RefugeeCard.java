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
        search = new StandardAttribute(0);
        hunt = new StandardAttribute(0);
        population = new StandardAttribute(1);   
        
        type = CardType.TRIBE;
        name = CardName.REFUGEE;
    }
}
