/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arctic.gui;

/**
 *
 * @author AppleGrocer
 */
public class PlayerPositionNotFoundException extends Exception {

    /**
     * Creates a new instance of <code>PlayerPositionNotFoundException</code>
     * without detail message.
     */
    public PlayerPositionNotFoundException() {
    }

    /**
     * Constructs an instance of <code>PlayerPositionNotFoundException</code>
     * with the specified detail message.
     *
     * @param msg the detail message.
     */
    public PlayerPositionNotFoundException(String msg) {
        super(msg);
    }
}
