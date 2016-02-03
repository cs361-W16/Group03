package models;
import models.Hand;
import models.Player;
import models.Deck;
import models.Card;


/**
 * Created by pranavramesh on 1/19/16.
 */
public class acesUp {
    Deck gameDeck;
    Player player;

    public acesUp(){
        gameDeck = new Deck();
        player = new Player();
        gameDeck.buildDeck();
    }

    public Deck getDeck(){
        return gameDeck;
    }

    public Player getPlayer() {
        return player;
    }

    public void dealToPlayer () {
        gameDeck.dealCard(player.getHand());
    }

    public void gameMove (int stackToMove) {
        player.makeMove(stackToMove);
    }

    // checks each stack to see if there is an Ace at the top.
    // if there is then we declare the winner.
    public boolean winner(){
        if(player.getHand().stack1[0].getValue() == 14){
            if(player.getHand().stack2[0].getValue() == 14){
                if(player.getHand().stack3[0].getValue() == 14){
                    if(player.getHand().stack4[0].getValue() == 14){
                        return true;
                    }
                }
            }
        }
        return false;
    }

}