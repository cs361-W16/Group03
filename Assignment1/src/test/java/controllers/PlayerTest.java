package controllers;

import models.Player;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Mihai on 1/21/2016.
 */
public class PlayerTest {
    @Test
    public void testPlayerInput() {
        Player playerTest = new Player();
        Assert.assertEquals(playerTest.getPlayerInput(), 3);
    }

    @Test
    public void testCurrValue() {
        Player playerTest = new Player();
        Assert.assertEquals(playerTest.getCurrValue(), 0);
    }

    @Test
    public void testCurrSuit() {
        Player playerTest = new Player();
        Assert.assertEquals(playerTest.getCurrSuit(), '\u0000');
    }
}