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

    @Test
    public void testSetCardValue () {
        Card cardTest = new Card(2, 'd', false);
        cardTest.setValue(3);
        Assert.assertEquals(3, cardTest.getValue());
    }

    @Test
    public void testSetCardSuite () {
        Card cardTest = new Card(2, 'd', false);
        cardTest.setSuit('s');
        Assert.assertEquals('s', cardTest.getSuit());
    }

    @Test
    public void testSetCardBeenDelt () {
        Card cardTest = new Card(2, 'd', false);
        cardTest.setBeenDelt(true);
        Assert.assertEquals(true, cardTest.isBeenDelt());
    }
}
