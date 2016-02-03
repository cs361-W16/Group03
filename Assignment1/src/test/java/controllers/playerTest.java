package controllers;

import models.Card;
import models.Player;
import org.junit.Assert;
import org.junit.Test;


/**
 * Created by Mihai on 1/21/2016.
 */
public class playerTest {

    @Test
    public void testMoveCard () {
        Card testCard = new Card(2, 'd', false);
        Player testPlayer = new Player();

        testPlayer.getHand().pushNewCard(1, testCard);

        testPlayer.makeMove(1);

        Assert.assertEquals('d', testPlayer.getHand().getTopCardSuit(2));
        Assert.assertEquals(2, testPlayer.getHand().getTopCardValue(2));
    }

    @Test
    public void testRemoveCardWithLowerVal () {
        Card testCard1 = new Card(2, 'd', false);
        Card testCard2 = new Card(3, 'd', false);
        Player testPlayer = new Player();

        testPlayer.getHand().pushNewCard(1, testCard1);
        testPlayer.getHand().pushNewCard(2, testCard2);


        testPlayer.makeMove(1);

        Assert.assertEquals(0, testPlayer.getHand().getTopCardValue(1));
        Assert.assertEquals(3, testPlayer.getHand().getTopCardValue(2));
    }

    @Test
    public void testRemoveCardWithHigherVal () {
        Card testCard1 = new Card(2, 'd', false);
        Card testCard2 = new Card(3, 'd', false);
        Player testPlayer = new Player();

        testPlayer.getHand().pushNewCard(1, testCard1);
        testPlayer.getHand().pushNewCard(2, testCard2);


        testPlayer.makeMove(2);

        Assert.assertEquals(0, testPlayer.getHand().getTopCardValue(1));
        Assert.assertEquals(3, testPlayer.getHand().getTopCardValue(2));
    }

    @Test
    public void testRemoveFails () {
        Card testCard1 = new Card(2, 'd', false);
        Card testCard2 = new Card(3, 'h', false);
        Card testCard3 = new Card(3, 'c', false);
        Card testCard4 = new Card(3, 's', false);
        Player testPlayer = new Player();

        testPlayer.getHand().pushNewCard(1, testCard1);
        testPlayer.getHand().pushNewCard(2, testCard2);
        testPlayer.getHand().pushNewCard(3, testCard3);
        testPlayer.getHand().pushNewCard(4, testCard4);

        Assert.assertEquals(false, testPlayer.makeMove(1));
        Assert.assertEquals(false, testPlayer.makeMove(2));
        Assert.assertEquals(false, testPlayer.makeMove(3));
        Assert.assertEquals(false, testPlayer.makeMove(4));
    }

}