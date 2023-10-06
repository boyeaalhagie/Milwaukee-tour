/*
 * Course: SWE 2410
 * Assignment: MKETour
 * Author: Dr. Yoder and Alhagie Boye
 * Date: 09/26/2022
 */
package mketour;

import javafx.scene.layout.Pane;
public abstract class Challenge {

    protected boolean challengeDone;
    Pane challengePane;

    Challenge(Pane challengePane) {
        this.challengeDone = false;
        this.challengePane = challengePane;
    }

    public abstract void update(Subject subject);
}