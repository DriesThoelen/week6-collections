package be.pxl.collections.opdracht1;

public enum Value {
    TWO("2"), THREE("3"), FOUR("4"), FIVE("5"), SIX("6"), SEVEN("7"),
    EIGHT("8"), NINE("9"), TEN("10"), JACK("J"), QUEEN("Q"), KING("K"), ACE("A");

    private final String name;

    private Value(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
