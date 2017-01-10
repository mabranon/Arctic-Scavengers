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
public class BrawlerCard extends Card{
    
    public BrawlerCard(){
        search = new StandardAttribute(1);
        combat = new StandardAttribute(2);
        population = new StandardAttribute(1);
        
        name = CardName.BRAWLER;
        type = CardType.TRIBE;
    }
    
}
