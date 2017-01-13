/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arctic.gui;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author AppleGrocer
 */
public class StartPageController extends ControlledScreen{
    
    @FXML
    private Button newGameBtn;
    @FXML
    private Button loadGameBtn;
    @FXML
    private Button optionsBtn;
    @FXML
    private Button exitBtn;
    
    @FXML
    private void startNewGame(ActionEvent event) throws IOException{
        mainControl.replaceScreen(ScreenKey.NUM_PLAYERS_SCREEN);
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
        Stage stage= (Stage)exitBtn.getScene().getWindow();
        stage.close();;
    }
    
}
