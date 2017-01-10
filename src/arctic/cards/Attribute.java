/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arctic.cards;

/**
 *
 * @author AppleGrocer
 */
public abstract class Attribute {
    
    private final AttributeType type;
    private final int value;
    
    public Attribute(AttributeType type, int value){
        this.type = type;
        this.value = value;
    }

    public AttributeType getType() {
        return type;
    }

    public int getValue() {
        return value;
    }
    
}
