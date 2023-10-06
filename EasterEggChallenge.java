/*
 * Course: SWE 2410
 * Assignment: MKETour
 * Author: Dr. Yoder and Alhagie Boye
 * Date: 09/26/2022
 */

package mketour;

import mketour.actors.Bus;
import javafx.scene.layout.Pane;


/**
 * Represents a Word Challenge Observer which is hidden until a bus is tagged
 */
public class EasterEggChallenge extends MSOEChallenge {

    private boolean showing = false;

    /**
     * Constructor for the WordChallenge
     * @param goal the word to be searched for
     */
    public EasterEggChallenge(String goal) {
        super(goal);
    }

    /**
     * update method which is hidden until a bus is tagged
     * @param taggable a taggable object
     * @param pane the pane
     */
    @Override
    public void update(Taggable taggable, Pane pane) {
        if(!showing && taggable instanceof Bus) {
            showing = true;
        } else if(showing) {
            super.update(taggable, pane);
        }
    }
}

