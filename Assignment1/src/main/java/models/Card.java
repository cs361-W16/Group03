package models;

/**
 * Representation for the Aces Up card
 */

public class Card {
    int value;
    char suit;
    boolean beenDelt;

    public Card (int startValue, char startSuit, boolean startBeenDelt) {
        value = startValue;
        suit = startSuit;
        beenDelt = startBeenDelt;
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
}
