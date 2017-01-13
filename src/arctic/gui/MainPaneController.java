/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arctic.gui;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.layout.StackPane;

/**
 * FXML Controller class
 *
 * @author AppleGrocer
 */
public class MainPaneController {

    @FXML
    private StackPane mainPane;

    public void init() throws IOException{
        
        FXMLLoader loader = new FXMLLoader(
                getClass().getResource("/fxml/StartPage.fxml")
        );
        
        mainPane.getChildren().add(loader.load());
        
        loader.<ControlledScreen>getController().setParent(this);
    }
    
    public void replaceScreen(Node screen){
        mainPane.getChildren().remove(0);
        mainPane.getChildren().add(screen);
    }
}
