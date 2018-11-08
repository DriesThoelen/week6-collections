package be.pxl.collections.opdracht1;

import java.util.TreeSet;
import java.util.stream.Collectors;

public class Hand {
    private TreeSet<Card> hand;

    public Hand() {
        hand = new TreeSet();
    }

    public void addCard(Card card) {
        hand.add(card);
    }

    public String showHand() {
        return hand.stream().map(c -> c.getColor() + "_" + c.getValue()).collect(Collectors.joining(" "));
    }

    public boolean hasColor(Color color) {
        return hand.stream().anyMatch(c -> c.getColor().equals(color));
    }
}
