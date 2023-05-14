package us.mattgreen.poker;

import java.util.Arrays;

import static us.mattgreen.poker.Face.*;
import static us.mattgreen.poker.Suit.*;
import static us.mattgreen.poker.Suit.DIAMONDS;

public class Main {
    /**
     *
     * Tests cards in the hand array against multiple methods to determine the value of your hand.
     */
    public static void main(String[] args) {
        Card[] hand = new Card[]{new Card(TWO, CLUBS, 2),
                new Card(THREE, CLUBS, 3),
                new Card(FOUR, CLUBS, 4),
                new Card(FIVE, CLUBS, 5),
                new Card(SIX, CLUBS, 6),};
        for(int i=0;i < hand.length; i++){
            System.out.println(hand[i].toString());
        }
        boolean two = Game.twoOfAKind(hand);
        boolean three = Game.threeOfAKind(hand);
        boolean pair = Game.twoPair(hand);
        boolean straight = Game.straightFlush(hand);
        boolean royal = Game.royalFlush(hand);

        if(two){
            System.out.println("You got two of a kind!");
        }
        else if(three){
            System.out.println("You got three of a kind!");
        }
        else if(pair){
            System.out.println("You got two pairs!");
        }
        else if(straight){
            System.out.println("You got two a straight!");
        }
        else if(royal){
            System.out.println("You got two of a royal flush!");
        }
        else{
            System.out.println("You got nothing...");
        }





        }

    }