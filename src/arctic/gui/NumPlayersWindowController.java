/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arctic.gui;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;

/**
 * FXML Controller class
 *
 * @author AppleGrocer
 */
public class NumPlayersWindowController extends ControlledScreen implements Initializable{
    @FXML
    private ChoiceBox numberListCBox;
    @FXML
    private Button startGameBtn;
    @FXML
    private Button cancelBtn;
    
    private ObservableList numPlayerOptions;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        numPlayerOptions = FXCollections.observableArrayList();
        numPlayerOptions.addAll(
                2,
                3,
                4
        );
        numberListCBox.setItems(numPlayerOptions);
        numberListCBox.getSelectionModel().selectFirst();
    }
    
    @FXML
    private void startGame(ActionEvent event){
        System.out.println("Starting game with "
                + numberListCBox.getSelectionModel().getSelectedItem() +
                " players");
    }
    
    @FXML
    private void cancelToStartScreen(ActionEvent event) throws IOException{
        mainControl.replaceScreen(MainPaneController.START_SCREEN);
    }        
}
