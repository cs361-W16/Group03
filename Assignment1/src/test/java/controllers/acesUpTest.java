package controllers;
import junit.framework.Assert;
import models.Card;
import models.acesUp;
import models.Hand;

import org.junit.Test;

/**
 * Created by pranavramesh on 1/21/16.
 */
public class acesUpTest {
    @Test
    public void testDeck(){
        acesUp testAcesUp = new acesUp();
        Assert.assertEquals(52, testAcesUp.getDeck().getNumCards());
    }

    @Test
    public void checkWinner(){
        int stack1 = 1;
        int stack2 = 2;
        int stack3 = 3;
        int stack4 = 4;
        acesUp testWin = new acesUp();
        Hand handTest = new Hand();

        Card testCard1 = new Card(14, 'd', false);
        Card testCard2 = new Card(14, 's', false);
        Card testCard3 = new Card(14, 'c', false);
        Card testCard4 = new Card(14, 'd', false);

        handTest.pushNewCard(stack1, testCard1);
        handTest.pushNewCard(stack2, testCard2);
        handTest.pushNewCard(stack3, testCard3);
        handTest.pushNewCard(stack4, testCard4);

        Assert.assertEquals(true, testWin.winner());

    }
}