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
        Assert.assertEquals(2, testDeck.getACard(0).getValue());
    }

    @Test
    public void testBuildDeck () {
        Deck testDeck = new Deck();

    }
}
