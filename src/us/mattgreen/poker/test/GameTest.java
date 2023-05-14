package us.mattgreen.poker.test;

import org.junit.Before;
import org.junit.Test;
import us.mattgreen.poker.Card;
import us.mattgreen.poker.Game;

import static org.junit.Assert.assertTrue;
import static us.mattgreen.poker.Face.*;
import static us.mattgreen.poker.Suit.*;
public class GameTest {
    private Card[] hand;
    @Before
    public void setUp() {
        hand = new Card[]{new Card(TEN, CLUBS, 10),
                new Card(THREE, CLUBS, 3),
                new Card(FOUR, CLUBS, 4),
                new Card(FIVE, CLUBS, 5),
                new Card(SIX, CLUBS, 6),};
    }

    @Test
    public void twoOfAKindTest(){
        assertTrue("Two of a kind should have matched", Game.twoOfAKind(hand));
    }

    @Test
    public void threeOfAKindTest() {assertTrue("Three of a kind should have matched", Game.threeOfAKind(hand));}
    @Test
    public void twoPair() {assertTrue("Two pairs should have matched", Game.twoPair(hand));}

    @Test
    public void straightFlush() {assertTrue("There should have been a straight flush.", Game.straightFlush(hand));}

    @Test
    public void royalFlush() {assertTrue("There should have been a royal flush.", Game.royalFlush(hand));}

}

