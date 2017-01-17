/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arctic.engine;

import arctic.board.Board;
import arctic.cards.Card;
import arctic.player.Player;
import arctic.player.PlayerType;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author AppleGrocer
 */
public class GameModel {

    private final int numPlayers;
    private final Board board;
    private final List<Player> playerList;
    private Player initiatorPlayer;
    private Player currentPlayer;

    public GameModel(int numPlayers) {
        this.numPlayers = numPlayers;

        board = new Board(this.numPlayers);

        playerList = new ArrayList<>();
        playerList.add(new Player(PlayerType.HUMAN, 0));
        for (int i = 1; i < this.numPlayers; i++) {
            playerList.add(new Player(PlayerType.CPU, i));
        }

        // randomly picks first initiator
        initiatorPlayer = playerList.get(new Random().nextInt(numPlayers));
        currentPlayer = initiatorPlayer;
    }
    
    public Player getCurrentPlayer(){
        return currentPlayer;
    }
    
    public void drawNewPlayerHand(Player player){
        player.drawNewHand();
    }

    /**
     * The current player draws a number of cards from their deck equal to the
     * total draw value of the cards played
     *
     * @param cardsPlayed list of cards
     */
    public void drawAction(List<Card> cardsPlayed) {
        int numCardsToDraw = 0;

        for (Card card : cardsPlayed) {
            numCardsToDraw += card.getDraw();
            currentPlayer.discardFromHand(card);
        }

        currentPlayer.draw(numCardsToDraw);
    }

    /**
     * Adds an amount of food to the current players food stores equal to the
     * total hunt value of the cards played
     *
     * @param cardsPlayed list of cards
     */
    public void huntAction(List<Card> cardsPlayed) {
        for (Card card : cardsPlayed) {
            currentPlayer.addToFoodStore(card.getHunt());
            currentPlayer.discardFromHand(card);
        }
    }

    /**
     * The current player searches the junkyard for a number of cards equal to
     * the total search value of the cards played
     *
     * @param cardsPlayed list of cards
     * @return a list of cards found in the junkyard
     */
    public List<Card> searchJunkyard(List<Card> cardsPlayed) {
        List cardsFound = new ArrayList<>();

        for (Card card : cardsPlayed) {
            for (int i = 0; i < card.getSearch(); i++) {
                cardsFound.add(board.drawFromJunkyard());
            }
        }

        return cardsFound;
    }

    /**
     * Adds the selected card to the bottom of the current player's discard pile
     * @param cardSalvaged
     */
    public void salvageFromJunkyard(Card cardSalvaged) {
        currentPlayer.addCardToDiscardPile(cardSalvaged);
    }

    /**
     * The list of cards is returned to the bottom of the junkyard
     * @param cardsNotChosen list of cards
     */
    public void returnToJunkyard(List<Card> cardsNotChosen) {
        board.returnToJunkyard(cardsNotChosen);
    }
    
    /**
     * Removes the specified card from the market and adds it to the bottom of the 
     * current player's discard pile
     * @param recruitedCard Card to recruit - must be a valid market card
     */
    public void recruit(Card recruitedCard){
        currentPlayer.addCardToDiscardPile(
                board.drawFromMarket(recruitedCard.getCardName())
        );
    }
    
    /**
     * Throws a list of cards away from the player's hand into the junkyard, 
     * then shuffles the junkyard.
     * @param cardstoTrash 
     */
    public void trashAction(List<Card> cardstoTrash) {
        currentPlayer.trash(cardstoTrash);
        board.returnToJunkyard(cardstoTrash);
        board.shuffleJunkyard();
    }

    /**
     * completes the turn of the current player, resetting their stores and
     * passing play
     */
    public void completeTurn() {
        currentPlayer.resetStores();
        currentPlayer = nextPlayer(currentPlayer);
    }

    /**
     * method passes the initiative to the next player while also passing the
     * the next turn to that initiating player
     */
    public void passInitiative() {
        initiatorPlayer = nextPlayer(initiatorPlayer);
        currentPlayer = initiatorPlayer;
    }

    /**
     * Calculates the next player in turn order
     *
     * @param player
     * @return next player in turn order
     */
    public Player nextPlayer(Player player) {
        return playerList.get((playerList.indexOf(player) + 1) % numPlayers);
    }
}
