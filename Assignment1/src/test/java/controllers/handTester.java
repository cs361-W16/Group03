package controllers;

import models.Hand;
import models.Card;
import org.junit.Test;
import org.junit.Assert;

/**
 * Created by Christian on 1/21/2016.
 *
 */
public class handTester {

    @Test
    public void testGetTopCardValue() {
        Hand handTest = new Hand();
        Assert.assertEquals(handTest.getTopCardValue(1), 0);
    }

    @Test
    public void testGetTopCardSuit() {
        Hand handTest = new Hand();
        Assert.assertEquals(handTest.getTopCardSuit(1), '\u0000');
    }

    @Test
    public void testPushNewCard() {
        Hand handTest = new Hand();
        Card cardTest = new Card(2, 'd', false);
        handTest.pushNewCard(1, cardTest);
        Assert.assertEquals(handTest.getTopCardValue(1), 2);
    }

    @Test
    public void testPopTopCard() {
        Hand handTest = new Hand();
        Card cardTest = new Card(2, 'd', false);
        handTest.pushNewCard(1, cardTest);
        handTest.popTopCard(1);
        Assert.assertEquals(handTest.getTopCardValue(1), 0);
    }

    @Test
    public void testGetNumCardStacks () {
        Hand handTest = new Hand();
        Assert.assertEquals(0, handTest.getNumCardsStack1());
        Assert.assertEquals(0, handTest.getNumCardsStack2());
        Assert.assertEquals(0, handTest.getNumCardsStack3());
        Assert.assertEquals(0, handTest.getNumCardsStack4());
    }
}