package be.pxl.collections.opdracht1;

public class Card implements Comparable<Card> {
    private Color color;
    private Value value;

    public Card(Color color, Value value) {
        this.color = color;
        this.value = value;
    }

    public Color getColor() {
        return color;
    }

    public Value getValue() {
        return value;
    }

    @Override
    public String toString() {
        return value.name();
    }

    @Override
    public int compareTo(Card card2) {

        if (this.color.ordinal() == card2.color.ordinal()) {
            if (this.value.ordinal() > card2.value.ordinal()) {
                return 1;
            }
            else if (this.value.ordinal() < card2.value.ordinal()) {
                return -1;
            }
        } else {
            if (this.color.ordinal() > card2.color.ordinal()) {
                return 1;
            }
            else if (this.color.ordinal() < card2.color.ordinal()) {
                return -1;
            }
        }

        return 0;
    }
}
