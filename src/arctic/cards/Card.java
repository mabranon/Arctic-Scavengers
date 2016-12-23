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
    Integer draw;
    Integer search;
    Integer food;
    Integer medicine;
    Integer combat;
    Integer population;

    Integer augDraw;
    Integer augSearch;
    Integer augFood;
    Integer augMedicine;
    Integer augCombat;
    
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

        augDraw = null;
        augSearch = null;
        augFood = null;
        augMedicine = null;
        augCombat = null;
        
        type = null;
        name = null;
        
        contested = false;
    }

    /**
     * @return the draw value of the card
     */
    public Integer getDraw() {
        return draw;
    }

    /**
     * @return the search value of the card
     */
    public Integer getSearch() {
        return search;
    }

    /**
     * @return the food value of the card
     */
    public Integer getFood() {
        return food;
    }

    /**
     * @return the medicine value of the card
     */
    public Integer getMedicine() {
        return medicine;
    }

    /**
     * @return the combat value of the card
     */
    public Integer getCombat() {
        return combat;
    }

    /**
     * @return the population value of the card
     */
    public Integer getPopulation() {
        return population;
    }

    /**
     * @return the augDraw value of the card
     */
    public Integer getAugDraw() {
        return augDraw;
    }

    /**
     * @return the augSearch value of the card
     */
    public Integer getAugSearch() {
        return augSearch;
    }

    /**
     * @return the augFood value of the card
     */
    public Integer getAugFood() {
        return augFood;
    }

    /**
     * @return the augMedicine value of the card
     */
    public Integer getAugMedicine() {
        return augMedicine;
    }

    /**
     * @return the augCombat value of the card
     */
    public Integer getAugCombat() {
        return augCombat;
    }

    /**
     * @return the type of the card
     */
    public CardType getType() {
        return type;
    }

    /**
     * @return the name of the card 
     */
    public CardName getCardName(){
        return name;
    }
    
    /**
     * @return id the card is a contested card
     */
    public boolean isContested() {
        return contested;
    }
}
