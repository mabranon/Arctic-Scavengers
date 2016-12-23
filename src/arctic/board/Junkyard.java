/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arctic.board;

import arctic.cards.Card;
import arctic.cards.JunkCard;
import arctic.cards.MedkitCard;
import arctic.cards.MultitoolCard;
import arctic.cards.NetCard;
import arctic.cards.PickaxeCard;
import arctic.cards.PillsCard;
import arctic.cards.ShovelCard;
import arctic.cards.SpearCard;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Joshua
 */
public class Junkyard {
    
    private List<Card> yardContents;
    
    public Junkyard(int numPlayers){
        yardContents = new ArrayList();
        
        // add multitools, nets, and pickaxes to junkyard
        for(int i=0; i<4; i++){
            yardContents.add(new MultitoolCard());
            yardContents.add(new NetCard());
            yardContents.add(new PickaxeCard());
        }
        
        // add player number dependent tools
        for(int i=0; i<6-numPlayers; i++){
            yardContents.add(new ShovelCard());
            yardContents.add(new SpearCard());
        }
        
        // add medkits
        for(int i=0; i<6; i++){
            yardContents.add(new MedkitCard());
        }
        
        // add pills
        for(int i=0; i<9; i++){
            yardContents.add(new PillsCard());
        }
        
        // add junk
        for(int i=0; i<7; i++){
            yardContents.add(new JunkCard());
        }
    }    

    /**
     * @return the yardContents
     */
    public List<Card> getYardContents() {
        return yardContents;
    }
    
    /**
     * shuffles the junkyard deck
     */
    public void shuffleYard(){
        Collections.shuffle(yardContents);
    }
}
