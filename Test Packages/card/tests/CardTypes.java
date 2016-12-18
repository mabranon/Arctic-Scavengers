/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package card.tests;

import org.junit.Assert;
import org.junit.Test;

import cards.*;

/**
 *
 * @author Michael Branon
 */
public class CardTypes {
    
    @Test
    public void verifyRefugee(){
        RefugeeCard refugee = new RefugeeCard();
        Assert.assertNull(refugee.getDraw());
        Assert.assertEquals(new Integer(0), refugee.getSearch());
        Assert.assertEquals(new Integer(0), refugee.getFood());
        Assert.assertNull(refugee.getMedicine());
        Assert.assertNull(refugee.getCombat());
        Assert.assertEquals(new Integer(1), refugee.getPopulation()); 
        
        Assert.assertNull(refugee.getAugDraw());
        Assert.assertNull(refugee.getAugSearch());
        Assert.assertNull(refugee.getAugFood());
        Assert.assertNull(refugee.getAugMedicine());
        Assert.assertNull(refugee.getAugMedicine());
    }
    
    @Test
    public void verifyScavenger(){
        ScavengerCard scav = new ScavengerCard();
        Assert.assertEquals(new Integer(1), scav.getDraw());
        Assert.assertEquals(new Integer(1), scav.getSearch());
        Assert.assertEquals(new Integer(1), scav.getFood());
        Assert.assertNull(scav.getMedicine());
        Assert.assertEquals(new Integer(1), scav.getCombat());
        Assert.assertEquals(new Integer(1), scav.getPopulation());    
        
        Assert.assertNull(scav.getAugDraw());
        Assert.assertNull(scav.getAugSearch());
        Assert.assertNull(scav.getAugFood());
        Assert.assertNull(scav.getAugMedicine());
        Assert.assertNull(scav.getAugMedicine());
    }
    
    @Test
    public void verifyGroupLeaders(){
        GroupLeadersCard leaders = new GroupLeadersCard();
        Assert.assertNull(leaders.getDraw());
        Assert.assertNull(leaders.getSearch());
        Assert.assertNull(leaders.getFood());
        Assert.assertNull(leaders.getMedicine());
        Assert.assertNull(leaders.getCombat());
        Assert.assertEquals(new Integer(2), leaders.getPopulation());
        
        Assert.assertEquals(new Integer(2), leaders.getAugDraw());
        Assert.assertEquals(new Integer(2), leaders.getAugSearch());
        Assert.assertEquals(new Integer(2), leaders.getAugFood());
        Assert.assertNull(leaders.getAugMedicine());
        Assert.assertEquals(new Integer(2), leaders.getAugCombat());
    }
    
}
