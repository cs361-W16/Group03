package models;
import models.Hand;
import models.Player;
import models.Deck;
import models.Card;


/**
 * Created by pranavramesh on 1/19/16.
 */
public class acesUp {
    Deck myDeck;
    Player player1;

    public acesUp(){
        myDeck = new Deck();
        player1 = new Player();
        myDeck.buildDeck();
    }

    public Deck getDeck(){
        return myDeck;
    }

    /*public acesUp playGame(){
        while(!winner()){
            myDeck.dealCard();
            player1.playerMove();
            winner();
            return player1;

        }

    }*/
    // checks each stack to see if there is an Ace at the top.
    // if there is then we declare the winner.
    public boolean winner(){
        if(player1.getNewHand().stack1[0].getValue() == 14){
            if(player1.getNewHand().stack2[0].getValue() == 14){
                if(player1.getNewHand().stack3[0].getValue() == 14){
                    if(player1.getNewHand().stack4[0].getValue() == 14){
                        return true;
                    }
                }
            }
        }
        return false;
    }

}