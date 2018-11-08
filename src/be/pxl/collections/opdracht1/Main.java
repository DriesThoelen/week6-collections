package be.pxl.collections.opdracht1;

public class Main {
    public static void main(String[] args) {
        Deck deck = new Deck();
        Hand hand = new Hand();

        hand.addCard(deck.dealCard());
        hand.addCard(deck.dealCard());
        hand.addCard(deck.dealCard());
        hand.addCard(deck.dealCard());

        System.out.println(hand.showHand());
    }
}
