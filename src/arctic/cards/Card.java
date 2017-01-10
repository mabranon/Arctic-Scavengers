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
public abstract class Card {
    Attribute draw;
    Attribute search;
    Attribute food;
    Attribute medicine;
    Attribute combat;
    Attribute population;
    
    CardType type;
    CardName name;
    
    boolean contested;

    public Card() {
        draw = null;
        search = null;
        food = null;
        medicine = null;
        combat = null;
        population = null;
        
        type = null;
        name = null;
        
        contested = false;
    }

    public int getDraw() {
        return draw.getValue();
    }

    public int getSearch() {
        return search.getValue();
    }
    
    public int getFood() {
        return food.getValue();
    }

    public int getMedicine() {
        return medicine.getValue();
    }

    public int getCombat() {
        return combat.getValue();
    }
   
    public int getPopulation() {
        return population.getValue();
    }

    public CardType getType() {
        return type;
    }

    public CardName getCardName(){
        return name;
    }
       
    public boolean isContested() {
        return contested;
    }
}
