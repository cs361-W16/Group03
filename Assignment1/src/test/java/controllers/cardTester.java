package controllers;

import models.Card;
import org.junit.Test;
import org.junit.Assert;

/**
 * Representation for testing the card class
 */

public class cardTester {
    @Test
    public void testCardValue () {
        Card cardTest = new Card(1, 'd', false);
        Assert.assertEquals(cardTest.getValue(), 1);
    }

    @Test
    public void testCardSuit () {
        Card cardTest = new Card(1, 'd', false);
        Assert.assertEquals(cardTest.getSuit(), 'd');
    }

    @Test
    public void testCardBeenDelt () {
        Card cardTest = new Card(1, 'd', false);
        Assert.assertEquals(cardTest.isBeenDelt(), false);
    }
}
