package controllers;

/**
 * Class for testing the Deck class
 */

import models.Deck;
import org.junit.Assert;
import org.junit.Test;

public class deckTester {

    @Test
    public void testNumCards () {
        Deck testDeck = new Deck();
        Assert.assertEquals(52, testDeck.getNumCards());
    }

    @Test
    public void testGetCard () {
        Deck testDeck = new Deck();
        testDeck.buildDeck();
        Assert.assertEquals(2, testDeck.getACard(0).getValue());
    }

    /**
     * This test is checking that the deck can build itself correctly
     * The deck is an array of 52 cards that can be thought of as four groups of thirteen
     * cards that all have the same suit and are ranked from 2-14
     * It first checks that the first thirteen cards are all diamonds
     * That the second thirteen cards are all hearts
     * That the third thirteen cards are all spades
     * And lastly that the fourth thirteen are all clubs
     */
    @Test
    public void testBuildDeck () {
        Deck testDeck = new Deck();

        testDeck.buildDeck ();

        for (int i = 0; i < 52; i++) {
            //check that all haven't been delt
            Assert.assertEquals(false, testDeck.getACard(i).isBeenDelt());

            //check that they all have correct rank
            Assert.assertEquals((i%13) + 2, testDeck.getACard(i).getValue());

            //begin checking all of the suits
            if (i < 13) {
                Assert.assertEquals('d', testDeck.getACard(i).getSuit());
            }
            else if (i < 26) {
                Assert.assertEquals('h', testDeck.getACard(i).getSuit());
            }
            else if (i < 39) {
                Assert.assertEquals('s', testDeck.getACard(i).getSuit());
            }
            else {
                Assert.assertEquals('c', testDeck.getACard(i).getSuit());
            }
        }
    }
}

