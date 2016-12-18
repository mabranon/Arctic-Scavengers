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
abstract class Card {
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
    
    public Card(){
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
    }

    /**
     * @return the draw
     */
    public Integer getDraw() {
        return draw;
    }

    /**
     * @return the search
     */
    public Integer getSearch() {
        return search;
    }

    /**
     * @return the food
     */
    public Integer getFood() {
        return food;
    }

    /**
     * @return the medicine
     */
    public Integer getMedicine() {
        return medicine;
    }

    /**
     * @return the combat
     */
    public Integer getCombat() {
        return combat;
    }

    /**
     * @return the population
     */
    public Integer getPopulation() {
        return population;
    }

    /**
     * @return the augDraw
     */
    public Integer getAugDraw() {
        return augDraw;
    }

    /**
     * @return the augSearch
     */
    public Integer getAugSearch() {
        return augSearch;
    }

    /**
     * @return the augFood
     */
    public Integer getAugFood() {
        return augFood;
    }

    /**
     * @return the augMedicine
     */
    public Integer getAugMedicine() {
        return augMedicine;
    }

    /**
     * @return the augCombat
     */
    public Integer getAugCombat() {
        return augCombat;
    }
}
