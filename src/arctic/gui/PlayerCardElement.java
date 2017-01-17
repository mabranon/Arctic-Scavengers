/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arctic.gui;

import arctic.cards.CardName;
import javafx.animation.ScaleTransition;
import javafx.event.EventHandler;
import javafx.scene.image.Image;

import javafx.scene.image.ImageView;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.util.Duration;

/**
 *
 * @author AppleGrocer
 */
public class PlayerCardElement extends ImageView {
    
    private boolean zoomable;

    public PlayerCardElement(CardName cardName) {
        zoomable=false;        
        String imgURL = getImageURL(cardName);
        Image image = new Image(
                getClass().getResource(imgURL).toExternalForm()
        );
        this.setImage(image);
        this.setPreserveRatio(true);
        this.setFitHeight(120);
        
        PlayerCardElement thisElement = this;
        this.addEventHandler(MouseEvent.MOUSE_CLICKED, 
                new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                if (event.getButton() == MouseButton.SECONDARY 
                        && zoomable) {
                    if (thisElement.getScaleX() == 1.0) {
                        ScaleTransition scale = 
                                new ScaleTransition(
                                        Duration.millis(300), thisElement
                                );
                        scale.setByX(1);
                        scale.setByY(1);
                        scale.play();
                    } else if (thisElement.getScaleX() == 2.0) {
                        ScaleTransition scale = 
                                new ScaleTransition(
                                        Duration.millis(300), thisElement
                                );
                        scale.setByX(-1);
                        scale.setByY(-1);
                        scale.play();
                    }
                }
            }
        });
    }
    
    private String getImageURL(CardName cardName){
        //return "/images/" + cardName.toString() + "Card.png";
        return "/images/CardBase.png";
    }
    
    public void configForHumanHand(boolean inHand){
        zoomable = true;
        setCardSizeLarge();
    }
    public void setCardSizeLarge(){
        this.setFitHeight(200);
    }
    
    public void setCardSizeMed(){
        this.setFitHeight(170);
    }
    
    public void setCardSizeSmall(){
        this.setFitHeight(120);
    }
}
