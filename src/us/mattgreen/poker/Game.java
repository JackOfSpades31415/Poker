package us.mattgreen.poker;

import java.util.Arrays;

/**
 * This is a utility class consisting of static methods to determine if a hand matches a specific
 * @author Jack 100%
 * @version 1.0
 */
public class Game {
    /**
    *
    * @param hand An array of Cards
    * @return True if there are two of a kind and false if not
     */
    public static boolean twoOfAKind(Card[] hand){
        Arrays.sort(hand, (a, b) -> a.getFace().compareTo(b.getFace()));
        for(int i=0;i < hand.length; i++) {
            if (i < 4) {
                if (hand[i].getFace().equals(hand[i + 1].getFace())) return true;
            }
        }
        return false;
    }

    /**
     *
     * @param hand An array of Cards
     * @return True if there are two pairs and false if not
     */
    public static boolean twoPair(Card[] hand){
        Arrays.sort(hand, (a, b) -> a.getFace().compareTo(b.getFace()));
        int matchValue = 0;
        int numMatches = 0;
        for(int i=0;i < hand.length; i++) {
            if(i < 4) {
                if (hand[i].getFace().equals(hand[i + 1].getFace())) {
                    if (matchValue != hand[i].getValue())
                        numMatches++;
                    matchValue = hand[i].getValue();
                    if (numMatches == 2) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /**
     *
     * @param hand An array of Cards
     * @return True if there are three of a kind and false if not
     */
    public static boolean threeOfAKind(Card[] hand){
        Arrays.sort(hand, (a, b) -> a.getFace().compareTo(b.getFace()));
        for(int i=0;i < hand.length; i++){
            if(i < 4) {
                if (hand[i].getFace().equals(hand[i + 1].getFace())) {
                    if (hand[i + 1].getFace().equals(hand[i + 2].getFace())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
    /**
     *
     * @param hand An array of Cards
     * @return True if there is a flush and false if not
     */
    public static boolean straightFlush(Card[] hand) {
        Arrays.sort(hand, (a, b) -> a.getFace().compareTo(b.getFace()));
        if (hand[0].getSuit() == hand[1].getSuit() && hand[0].getSuit() == hand[2].getSuit() && hand[0].getSuit() == hand[3].getSuit() && hand[0].getSuit() == hand[4].getSuit()) {
            if (hand[1].getValue() - 1 == hand[0].getValue()) {
                if (hand[2].getValue() - 1 == hand[1].getValue()) {
                    if (hand[3].getValue() - 1 == hand[2].getValue()) {
                        if (hand[4].getValue() - 1 == hand[3].getValue()) {
                            return true;

                        }

                    }

                }
            }
        }
        return false;
    }


    /**
     *
     * @param hand An array of Cards
     * @return True if there is a flush and false if not
     */
    public static boolean royalFlush(Card[] hand) {
        Arrays.sort(hand, (a, b) -> a.getFace().compareTo(b.getFace()));
        if (hand[0].getSuit() == hand[1].getSuit() && hand[0].getSuit() == hand[2].getSuit() && hand[0].getSuit() == hand[3].getSuit() && hand[0].getSuit() == hand[4].getSuit()) {
            if (hand[0].getValue() == 10 && hand[1].getValue() == 11 && hand[2].getValue() == 12 && hand[3].getValue() == 13 && hand[4].getValue() == 1) {
                return true;
            }
        }
        return false;
    }


}
