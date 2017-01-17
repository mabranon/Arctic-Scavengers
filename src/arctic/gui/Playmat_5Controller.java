/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arctic.gui;

import arctic.cards.Card;
import arctic.engine.GameModel;
import arctic.player.Player;

import javafx.fxml.FXML;
import javafx.scene.Group;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;

/**
 *
 * @author AppleGrocer
 */
public class Playmat_5Controller extends ControlledScreen implements Playmat {

    private final GameModel gameModel = new GameModel(5);

    @FXML
    private HBox humanHandArea;
    @FXML
    private HBox cpu1HandArea;
    @FXML
    private HBox cpu2HandArea;
    @FXML
    private HBox cpu3HandArea;
    @FXML
    private HBox cpu4HandArea;
    @FXML
    private ImageView discardPile;
    @FXML
    private ImageView drawPile;

    public void initializeGame() {
        Image image = new Image(getClass().getResource("/images/CardBase.png").toExternalForm());
        discardPile.setImage(image);

        image = new Image(getClass().getResource("/images/CardBase.png").toExternalForm());
        drawPile.setImage(image);
        
        startGame();        
    }
    
    private void startGame(){
        tableDrawsHand();
    }
    
    private void tableDrawsHand(){
        Player playerDrawing = gameModel.getCurrentPlayer();
        do{
            gameModel.drawNewPlayerHand(playerDrawing);
            updatePlayerHandArea(playerDrawing);
            playerDrawing = gameModel.nextPlayer(playerDrawing);
        }while(playerDrawing != gameModel.getCurrentPlayer());
    }

    @Override
    public void updatePlayerHandArea(Player player) {
        try {
            HBox handArea = getPlayerHandArea(player);
            for(Card card : player.getHand()){
                PlayerCardElement cardImage = 
                        new PlayerCardElement(card.getCardName());
                if(handArea == humanHandArea){
                    cardImage.setInHumanHand(true);
                }
                handArea.getChildren().add(new Group(cardImage));
            }
        } catch (PlayerPositionNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    private HBox getPlayerHandArea(Player player)
            throws PlayerPositionNotFoundException {
        switch (player.getPosition()) {
            case 0:
                return humanHandArea;
            case 1:
                return cpu1HandArea;
            case 2:
                return cpu2HandArea;
            case 3:
                return cpu3HandArea;
            case 4:
                return cpu4HandArea;
            default:
                throw new PlayerPositionNotFoundException(player.getPosition() 
                        + " is not a valid position index");
        }
    }

}
