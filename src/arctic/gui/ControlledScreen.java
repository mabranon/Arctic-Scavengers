/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arctic.gui;

/**
 *
 * @author AppleGrocer
 */
public abstract class ControlledScreen {
    
    MainPaneController mainControl;
        
    public void setParent(MainPaneController mainControl){
        this.mainControl = mainControl;
    }
}
