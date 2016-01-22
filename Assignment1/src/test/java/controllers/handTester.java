package controllers;

import models.Hand;
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
}