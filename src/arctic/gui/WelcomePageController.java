/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arctic.gui;

import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.Label;


/**
 *
 * @author AppleGrocer
 */
public class WelcomePageController {
    
    @FXML
    private Label startLabel;
    
    @FXML
    private void continueToMainPage(Event event){
        System.out.println("continue label clicked");        
    }
}
