/*
 * Course: SWE 2410
 * Assignment: MKETour
 * Author: Dr. Yoder and Alhagie Boye
 * Date: 09/26/2022
 */

package mketour;

import mketour.actors.MobileEntity;
import mketour.actors.Person;
import javafx.scene.layout.Pane;

/**
 * Concrete subject class from the observer pattern. Deals with challenges
 */
public class ChallengesSubject extends Subject {

    /**
     * Determines if the entity run into was a person, if so calls notifyObservers
     * @param taggable the taggable that was tagged
     * @param entity the entity to check if it is a person
     * @param pane the pane
     */
    public void changeState(Taggable taggable, MobileEntity entity, Pane pane) {
        if(entity instanceof Person) {
            pane.getChildren().clear();
            notifyObservers(taggable, pane);
        }
    }
}

