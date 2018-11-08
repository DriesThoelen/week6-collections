package be.pxl.collections.opdracht1;

import org.junit.Test;

import static org.junit.Assert.*;

public class CardTest {

	private static final int FULL_DECK_SIZE = 52;
	
	private static final String HAND_SORT_1 = "DIAMOND_8 CLUB_3";
	private static final String HAND_SORT_2 = "DIAMOND_8 CLUB_3 CLUB_Q";
	private static final String HAND_SORT_3 = "HEART_A DIAMOND_8 CLUB_3 CLUB_Q";
	private static final String HAND_SORT_4 = "HEART_A DIAMOND_8 CLUB_3 CLUB_6 CLUB_Q";
	private static final String HAND_SORT_5 = "HEART_A DIAMOND_8 CLUB_3 CLUB_6 CLUB_Q SPADE_K";
	
	@Test
	public void controlDeckSize() {
		Deck deck = new Deck();
		assertEquals(FULL_DECK_SIZE, deck.getDeckSize());
	}
	
	@Test
	public void decksAreRandomlyShuffled() {
		Deck deck1 = new Deck();
		Deck deck2 = new Deck();
		System.out.println(deck1);
		System.out.println(deck2);
		assertNotEquals(deck1.showDeck(), deck2.showDeck()); 
		/*
		 *  Note: there's a very,very,very,VERY small chance that two decks are shuffled in exactly the same way: 
		 *  https://math.stackexchange.com/questions/671/when-you-randomly-shuffle-a-deck-of-cards-what-is-the-probability-that-it-is-a 
		 */
	}
	
	@Test
	public void dealingCardReducesDeckSize() {
		Deck deck = new Deck();
		Card c = deck.dealCard();
		assertEquals(FULL_DECK_SIZE - 1, deck.getDeckSize());
	}
	
	@Test
	public void cardsCompareColor() {
		Card c1 = new Card(Color.HEART, Value.FOUR);
		Card c2 = new Card(Color.SPADE, Value.FOUR);
		
		assertTrue(c1.compareTo(c2) < 0);
	}
	
	@Test
	public void cardsCompareValue() {
		Card c1 = new Card(Color.HEART, Value.FOUR);
		Card c2 = new Card(Color.HEART, Value.JACK);

        assertTrue(c1.compareTo(c2) < 0);
	}
	
	@Test
	public void cardsCombineCompare() {
		Card c1 = new Card(Color.DIAMOND, Value.FOUR);
		Card c2 = new Card(Color.CLUB, Value.JACK);

        assertTrue(c1.compareTo(c2) < 0);
	}
	
	@Test
	public void hasColorReturnsTrueIfColorAvailable() {
		Hand hand = new Hand();
		hand.addCard(new Card(Color.HEART, Value.TEN));
		hand.addCard(new Card(Color.SPADE, Value.FOUR));
		
		assertTrue(hand.hasColor(Color.HEART));
	}
	
	@Test
	public void hasColorReturnsFalseIfColorNotAvailable() {
		Hand hand = new Hand();
		hand.addCard(new Card(Color.HEART, Value.TEN));
		hand.addCard(new Card(Color.SPADE, Value.FOUR));
		
		assertFalse(hand.hasColor(Color.CLUB));
	}
	
	@Test
	public void handIsAlwaysSorted() {
		Hand hand = new Hand();
		
		hand.addCard(new Card(Color.CLUB, Value.THREE));
		hand.addCard(new Card(Color.DIAMOND, Value.EIGHT));
		assertEquals(HAND_SORT_1, hand.showHand());
		
		hand.addCard(new Card(Color.CLUB, Value.QUEEN));
		assertEquals(HAND_SORT_2, hand.showHand());		
		
		hand.addCard(new Card(Color.HEART, Value.ACE));
		assertEquals(HAND_SORT_3, hand.showHand());		
		
		hand.addCard(new Card(Color.CLUB, Value.SIX));
		assertEquals(HAND_SORT_4, hand.showHand());		
		
		hand.addCard(new Card(Color.SPADE, Value.KING));
		assertEquals(HAND_SORT_5, hand.showHand());
	}
}
