package models;

import models.Deck;
import models.Hand;

import java.util.Scanner;


/**
 * Created by Mihai on 1/20/2016.
 */
public class Player {

    public Player(){
        Hand newHand = new Hand();

        /*int cardValueStack1, cardValueStack2, cardValueStack3, cardValueStack4;
        char cardSuitStack1, cardSuitStack2, cardSuitStack3, cardSuitStack4;

        newHand.getTopCardValue(1) = cardValueStack1;
        newHand.getTopCardValue(2) = cardValueStack2;
        newHand.getTopCardValue(3) = cardValueStack3;
        newHand.getTopCardValue(4) = cardValueStack4;

        newHand.getTopCardSuit(1) = cardSuitStack1;
        newHand.getTopCardSuit(2) = cardSuitStack2;
        newHand.getTopCardSuit(3) = cardSuitStack3;
        newHand.getTopCardSuit(4) = cardSuitStack4;*/


        Scanner inputReader = new Scanner(System.in);
        System.out.println("Enter the column you wish to remove from: ");
        int playerInput = inputReader.nextInt();

        int currCardValue = newHand.getTopCardValue(playerInput);
        char currCardSuit = newHand.getTopCardSuit(playerInput);

        for(int i = 1; i < 5; i++){
            if(currCardSuit == newHand.getTopCardSuit(i)){
                if(currCardValue < newHand.getTopCardValue(i)){
                    //Remove card function call here.
                }
            }
        }





    }
}

