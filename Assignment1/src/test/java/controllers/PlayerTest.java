package controllers;

import models.Player;
import models.Card;
import models.Hand;
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
        Assert.assertEquals(playerTest.getPlayerInput(), 1);
    }

    // Testing for the right card value, in this case
    // it should be zero since there is no card on
    // the top of the stack.
    @Test
    public void testCurrValue() {
        Player playerTest = new Player();
        /*Hand newHand = new Hand();
        Card newCard = new Card(9, 'd', false);
        newHand.pushNewCard(1, newCard);*/
        Assert.assertEquals(playerTest.getCurrValue(), 0);
    }

    // Testing for the right card suit, in this case
    // it should be null since there is no card on
    // the top of the stack.
    @Test
    public void testCurrSuit() {
        Player playerTest = new Player();
        Assert.assertEquals(playerTest.getCurrSuit(), '\u0000');
    }


}