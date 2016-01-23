package models;

import models.Deck;
import models.Hand;

import java.util.Scanner;


/**
 * Created by Mihai on 1/20/2016.
 */
public class Player {

    // Player input simulated for testing.
    int playerInput = 3;

    // Declaring new instance.
    Hand newHand = new Hand();

    // Getting current card value and suit from Hand class.
    int currCardValue = newHand.getTopCardValue(playerInput);
    char currCardSuit = newHand.getTopCardSuit(playerInput);

    // Checks if the player made a legal move.
    public void playerMove(){
        for(int i = 1; i < 5; i++) {
            // Checks if they are the same suit.
            if (currCardSuit == newHand.getTopCardSuit(i)) {
                // Checks if there is a card with a larger value than the one input.
                if (currCardValue < newHand.getTopCardValue(i)) {
                    // Removes the top card.
                    //newHand.popTopCard(playerInput);
                }
            }
        }
    }

    // Return playerInput.
    public int getPlayerInput(){
        return playerInput;
    }

    // Return currCardValue.
    public int getCurrValue(){
        return currCardValue;
    }

    // Return currCardSuit.
    public int getCurrSuit(){
        return currCardSuit;
    }

}

