/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arctic.gui;

import arctic.cards.Card;
import arctic.engine.GameModel;
import arctic.player.Player;
import java.util.List;

import javafx.fxml.FXML;
import javafx.scene.Group;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;

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

    private void startGame() {
        tableDrawsHand();
    }

    /**
     * starting from the currently active player, goes around the table and
     * draws new hands for all players
     */
    private void tableDrawsHand() {
        Player playerDrawing = gameModel.getCurrentPlayer();
        do {
            gameModel.drawNewPlayerHand(playerDrawing);
            updatePlayerHandArea(playerDrawing);
            playerDrawing = gameModel.nextPlayer(playerDrawing);
        } while (playerDrawing != gameModel.getCurrentPlayer());
    }

    @Override
    /**
     * adds a player's hand to their corresponding hand area
     */
    public void updatePlayerHandArea(Player player) {
        try {
            HBox handArea = getPlayerHandArea(player);
            setHandToHandArea(handArea, player.getHand());
        } catch (PlayerPositionNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
      
    /**
     * associates a given player with a hand area
     * @param player Player
     * @return HBox hand area in the gui
     * @throws PlayerPositionNotFoundException when an error occurs and an 
     * invalid player position is given 
     */
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
    
    /**
     * creates and configures the appropriate card image for all cards in a
     * list, and configuring each before setting them in the appropriate hand
     * area
     * @param handArea HBox a hand area
     * @param hand List of cards
     */
    private void setHandToHandArea(HBox handArea, List<Card> hand) {
        for (Card card : hand) {
            PlayerCardElement cardImage
                    = new PlayerCardElement(card.getCardName());
            configureCardElement(cardImage, handArea);
            handArea.getChildren().add(new Group(cardImage));
        }
    }
    
    /**
     * configures card elements according to their destination containers
     * @param cardImage PlayerCardElement to be configured
     * @param destinationArea Pane destination for card element
     */
    private void configureCardElement(PlayerCardElement cardImage, 
            Pane destinationArea){
        if(destinationArea == humanHandArea){
            cardImage.configForHumanHand(true);
        }
    }
}
