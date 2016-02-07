package models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Representation for the Aces Up card
 */

public class Card {
    int value;
    char suit;
    boolean beenDelt;

    @JsonCreator
    public Card(@JsonProperty("value") int value, @JsonProperty("suit") char suit) {
        this.value = value;
        this.suit = suit;
    }

    public Card (int startValue, char startSuit, boolean startBeenDelt) {
        value = startValue;
        suit = startSuit;
        beenDelt = startBeenDelt;
    }

    public Card () {
        value = 0;
        suit = ' ';
        beenDelt = false;

    }

    public int getValue () {
        return value;
    }

    public char getSuit() {
        return suit;
    }

    public boolean isBeenDelt() {
        return beenDelt;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void setSuit(char suit) {
        this.suit = suit;
    }

    public void setBeenDelt(boolean beenDelt) {
        this.beenDelt = beenDelt;
    }
}
