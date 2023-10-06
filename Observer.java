/*
 * Course: SWE 2410
 * Assignment: MKETour
 * Author: Dr. Yoder and Alhagie Boye
 * Date: 09/26/2022
 */
package mketour;
import javafx.scene.layout.Pane;

/**
 * Observer interface from the Observer pattern
 */
public interface Observer {

    /**
     * update method
     * @param taggable a taggable object
     * @param pane the pane
     */
    void update(Taggable taggable, Pane pane);
}
