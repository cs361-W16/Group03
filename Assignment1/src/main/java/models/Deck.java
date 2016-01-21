package models;

/**
 * A representation of the deck class in the Aces Up game
 */
public class Deck {
    int numCards;
    Card[] cards;

    public Deck () {
        numCards = 52;
        cards = new Card[52];
        cards[0] = new Card(2, 'd', false);
    }

    public int getNumCards() {
        return numCards;
    }

    public Card getACard (int index) {
        return cards[index];
    }
}
