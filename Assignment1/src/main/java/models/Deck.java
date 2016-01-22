package models;

/**
 * A representation of the deck class in the Aces Up game
 */

import java.util.Random;
import models.Hand;

public class Deck {
    int numCards;
    Card[] cards;

    public Deck () {
        numCards = 0;
        cards = new Card[52];
    }

    public int getNumCards() {
        return numCards;
    }

    public Card getACard (int index) {
        return cards[index];
    }

    public void buildDeck () {

        for (int i = 0; i < 13; i++) {
            numCards++;
            cards[i] = new Card(i+2, 'd', false);
        }
        for (int i = 0; i < 13; i++) {
            numCards++;
            cards[i+13] = new Card(i+2, 'h', false);
        }
        for (int i = 0; i < 13; i++) {
            numCards++;
            cards[i+26] = new Card(i+2, 's', false);
        }
        for (int i = 0; i < 13; i++) {
            numCards++;
            cards[i+39] = new Card(i+2, 'c', false);
        }
    }

    //Will take a hand and return void in future iterations
    public void dealCard (Hand dealHand) {
        Random random = new Random();
        boolean foundCard;
        int randInt;


        for (int i = 0; i < 4; i++) {
            foundCard = false;

            while (!foundCard) {

                randInt = random.nextInt();
                randInt = Math.abs(randInt);
                randInt = randInt%52;

                if (!cards[randInt].isBeenDelt()) {
                    //set these to true so cards aren't re-dealt
                    cards[randInt].setBeenDelt(true);

                    //set to true so loop ends
                    foundCard = true;

                    //deal the card to the correct stack
                    dealHelper(i, dealHand, cards[randInt]);
                }
            }
        }
    }

    private void dealHelper(int numDelt, Hand dealHand, Card dealCard) {
        if (numDelt == 0) {
            dealHand.pushNewCard(1, dealCard);
        }
        if (numDelt == 1) {
            dealHand.pushNewCard(2, dealCard);
        }
        if (numDelt == 2) {
            dealHand.pushNewCard(3, dealCard);
        }
        if (numDelt == 3) {
            dealHand.pushNewCard(4, dealCard);
        }
    }
}
