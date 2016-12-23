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
public class ThugsCard extends Card{
    
    public ThugsCard(){
        search = 1;
        combat = 3;
        population = 3;
        
        type = CardType.TRIBE;
        name = CardName.THUGS;
    }
}
