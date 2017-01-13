/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arctic.gui;

import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.layout.StackPane;

/**
 * FXML Controller class
 *
 * @author AppleGrocer
 */
public class MainPaneController implements Initializable{
    
    private final HashMap<ScreenKey, Node> screenMap = new HashMap<>();

    @FXML
    private StackPane mainPane;

    @Override
    public void initialize(URL location, ResourceBundle resources){
        loadScreens();
        mainPane.getChildren().add(screenMap.get(ScreenKey.START_SCREEN));
    }
    
    private void loadScreens(){
        try{
        FXMLLoader loader;
        loader = new FXMLLoader(
                getClass().getResource("/fxml/StartPage.fxml")
        );
        screenMap.put(ScreenKey.START_SCREEN, loader.load());
        loader.<ControlledScreen>getController().setParent(this);
        
        loader = new FXMLLoader(
                getClass().getResource("/fxml/NumPlayersWindow.fxml")
        );
        screenMap.put(ScreenKey.NUM_PLAYERS_SCREEN, loader.load());
        loader.<ControlledScreen>getController().setParent(this);
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
    
    public void replaceScreen(ScreenKey key){
        mainPane.getChildren().remove(0);
        mainPane.getChildren().add(screenMap.get(key));
    }
}
