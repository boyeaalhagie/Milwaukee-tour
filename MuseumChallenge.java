/*
 * Course: SWE 2410
 * Assignment: MKETour
 * Author: Dr. Yoder and Alhagie Boye
 * Date: 09/26/2022
 */

package mketour;

import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;

/**
 * Represents a Observer dealing with museums
 */
public class MuseumChallenge implements Observer {

    private boolean showing = false;
    private Image painting;

    /**
     * Constructor
     * @param painting the painting image associated with the challenge
     */
    public MuseumChallenge(Image painting) {
        this.painting = painting;
    }

    /**
     * update method
     *
     * @param taggable a taggable object
     * @param pane the pane
     */

    @Override
    public void update(Taggable taggable, Pane pane) {
        if(!showing && taggable instanceof Museum) {
            showing = true;
        }
        pane.getChildren().add(new Label("Challenge: Find art"));
        if(showing) {
            pane.getChildren().add(new Label("Artistic works found:"));
            ImageView view = new ImageView(painting);
            view.setFitWidth(painting.getWidth()/2);
            view.setFitHeight(painting.getHeight()/2);
            pane.getChildren().add(view);
        }
        pane.getChildren().add(new Label(""));
    }
}
