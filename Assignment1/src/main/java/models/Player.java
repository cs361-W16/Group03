
package models;

import models.Deck;
import models.Hand;
import models.Card;


/**
 * Created by Mihai on 1/20/2016.
 */
public class Player {

    Hand hand;

    public Player(){
         hand = new Hand();
    }

    // Return hand.
    public Hand getHand(){
        return  hand;
    }

    /**
     * This method makes a move to the player's hand. If there is an empty space
     * this method moves the card from the specified stack to the empty space.
     * Otherwise the method tries to remove a card matching the suit of
     * the card on the specified stack, or the card from the stack depending
     * on which is lower.
     *
     * @param moveStack the stack which you are trying to make a move with
     * @return true if a move was made, false if one was not
     */
    public boolean makeMove (int moveStack) {
        for (int i = 1; i < 5; i++) {
            if (i != moveStack) {
                if (hand.getTopCardValue(i) == 0) {
                    hand.pushNewCard(i, hand.getCardFromStack(moveStack));
                    hand.popTopCard(moveStack);
                    return true;
                }
                else if (hand.getTopCardSuit(i) == hand.getTopCardSuit(moveStack)) {
                    if (hand.getTopCardValue(i) < hand.getTopCardValue(moveStack)) {
                        hand.popTopCard(i);
                        return true;
                    }
                    else {
                        hand.popTopCard(moveStack);
                        return true;
                    }
                }
            }
        }
        return false;
    }

}
