/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arctic.gui;

import java.io.IOException;
import java.util.HashMap;
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
    
    public static final String START_SCREEN = "/fxml/StartPage.fxml";
    public static final String NUM_PLAYERS_SCREEN = 
            "/fxml/NumPlayersWindow.fxml";
    
    private final HashMap<String, Node> screenMap = new HashMap<>();

    @FXML
    private StackPane mainPane;

    public void init() throws IOException{
        FXMLLoader loader;
        loader = new FXMLLoader(
                getClass().getResource("/fxml/StartPage.fxml")
        );
        screenMap.put(START_SCREEN, loader.load());
        loader.<ControlledScreen>getController().setParent(this);
        
        loader = new FXMLLoader(
                getClass().getResource("/fxml/NumPlayersWindow.fxml")
        );
        screenMap.put(NUM_PLAYERS_SCREEN, loader.load());
        loader.<ControlledScreen>getController().setParent(this);
        
        mainPane.getChildren().add(screenMap.get(START_SCREEN));
        
        
    }
    
    public void replaceScreen(String screen){
        mainPane.getChildren().remove(0);
        mainPane.getChildren().add(screenMap.get(screen));
    }
}
