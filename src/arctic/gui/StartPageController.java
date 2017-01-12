/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arctic.gui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

/**
 * FXML Controller class
 *
 * @author AppleGrocer
 */
public class StartPageController{
    
    @FXML
    private Button newGameBtn;
    @FXML
    private Button loadGameBtn;
    @FXML
    private Button optionsBtn;
    @FXML
    private Button exitBtn;
    
    @FXML
    private void startNewGame(ActionEvent event){
        System.out.println("pressed new game button");
    }
    
    @FXML
    private void openSavedGameMenu(ActionEvent event){
        System.out.println("pressed load game button");
    }
    
    @FXML
    private void openOptionsMenu(ActionEvent event){
        System.out.println("pressed options button");
    }
    
    @FXML
    private void exitGame(ActionEvent event){
        System.out.println("pressed exit button");
    }
    
}
