package models;

/**
 * Created by Christian on 1/20/2016.
 *
 * The HAND class contains 4 stacks of Cards, with a max of 13 Cards per stack
 *
 **/

import models.Card;

public class Hand {
    Card[] stack1;
    Card[] stack2;
    Card[] stack3;
    Card[] stack4;

    int numCardsStack1;
    int numCardsStack2;
    int numCardsStack3;
    int numCardsStack4;

    // Constructor function for creating the hand (with 4 empty stack columns)
    // also sets the current number of cards in each stack to zero
    public Hand() {
        stack1 = new Card[13];
        stack2 = new Card[13];
        stack3 = new Card[13];
        stack4 = new Card[13];

        numCardsStack1 = 0;
        numCardsStack2 = 0;
        numCardsStack3 = 0;
        numCardsStack4 = 0;
    }

    // Getter function for top card's value (of designated stack, 1-4)
    // This function will return the value of the top card in a specified stack, 1-4
    public int getTopCardValue(int stackNumber) {
        switch (stackNumber) {
            case 1:
                if (numCardsStack1 > 0)
                    return stack1[numCardsStack1-1].value;
                else
                    return 0;
            case 2:
                if (numCardsStack2 > 0)
                    return stack2[numCardsStack2-1].value;
                else
                    return 0;
            case 3:
                if (numCardsStack3 > 0)
                    return stack3[numCardsStack3-1].value;
                else
                    return 0;
            case 4:
                if (numCardsStack4 > 0)
                    return stack4[numCardsStack4-1].value;
                else
                    return 0;
            default:
                return 0;
        }
    }

    // Getter function for top card's suit (of designated stack, 1-4)
    // This function will return the value of the top card in a specified stack; else, return NULL
    public char getTopCardSuit(int stackNumber) {
        switch (stackNumber) {
            case 1:
                if (numCardsStack1 > 0)
                    return stack1[numCardsStack1-1].suit;
                else
                    return '\u0000';
            case 2:
                if (numCardsStack2 > 0)
                    return stack2[numCardsStack2-1].suit;
                else
                    return '\u0000';
            case 3:
                if (numCardsStack3 > 0)
                    return stack3[numCardsStack3-1].suit;
                else
                    return '\u0000';
            case 4:
                if (numCardsStack4 > 0)
                    return stack4[numCardsStack4-1].suit;
                else
                    return '\u0000';
            default:
                return '\u0000';
        }
    }

    // This function will let the player push a new card from the deck onto a specified stack
    // Parameters: ( int stackNumber, Card someCard )
    public void pushNewCard ( int stackNumber, Card someCard ) {
        if (someCard != null) {
            switch (stackNumber) {
                case 1:
                    stack1[numCardsStack1] = someCard;
                    numCardsStack1++;
                    break;
                case 2:
                    stack2[numCardsStack2] = someCard;
                    numCardsStack2++;
                    break;
                case 3:
                    stack3[numCardsStack3] = someCard;
                    numCardsStack3++;
                    break;
                case 4:
                    stack4[numCardsStack4] = someCard;
                    numCardsStack4++;
                    break;
                default:
                    break;
            }
        }
    }

    // This will pop the top card from a specified stack by decrementing the amount of current cards
    public void popTopCard ( int stackNumber ) {
        switch (stackNumber) {
            case 1:
                if (numCardsStack1 > 0) {
                    numCardsStack1--;
                    break;
                }
            case 2:
                if (numCardsStack2 > 0) {
                    numCardsStack2--;
                    break;
                }
            case 3:
                if (numCardsStack3 > 0) {
                    numCardsStack3--;
                    break;
                }
            case 4:
                if (numCardsStack4 > 0) {
                    numCardsStack4--;
                    break;
                }
            default:
                break;
        }
    }
} // End of class HAND
