package be.pxl.collections.opdracht1;

import java.util.*;
import java.util.stream.Collectors;

public class Deck {
    private Deque<Card> deck;

    public Deck() {
        List<Card> cardList = new ArrayList<>();

        for (Color color:Color.values()) {
            for (Value value:Value.values()) {
                cardList.add(new Card(color, value));
            }
        }

        Collections.shuffle(cardList);

        deck = new ArrayDeque<>(cardList);
    }

    public int getDeckSize() {
        return deck.size();
    }

    public Card dealCard() {
        return deck.pollFirst();
    }

    public String showDeck() {
        return deck.stream().map(c -> c.getColor() + "_" + c.getValue()).collect(Collectors.joining(" "));
    }
}
