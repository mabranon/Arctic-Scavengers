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
public class BrawlerCard extends Card{
    
    public BrawlerCard(){
        search = 1;
        combat = 2;
        population = 1;
        
        name = CardName.BRAWLER;
        type = CardType.TRIBE;
    }
    
}
