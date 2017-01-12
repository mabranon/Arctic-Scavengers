/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arctic.gui;

import java.io.IOException;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;


/**
 *
 * @author AppleGrocer
 */
public class WelcomePageController {
    
    @FXML
    private Label startLabel;
    
    @FXML
    private void continueToStartPage(Event event) throws IOException{
        Stage stage = (Stage)startLabel.getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(
                getClass().getResource("/fxml/StartPage.fxml")
        );
        
        Parent root = loader.load();               
        stage.setScene(new Scene(root));
        stage.setTitle("Arctic Scavengers");
        stage.setFullScreen(true);
        stage.setFullScreenExitHint("");        
        stage.show();
    }
}
