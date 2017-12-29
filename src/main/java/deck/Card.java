package deck;

import java.util.Objects;

public class Card {
    private final Face face;
    private final Suit suit;

    public Card(Face face, Suit suit) {
        this.face = face;
        this.suit = suit;
    }

    public Face getFace() {
        return face;
    }

    public Suit getSuit() {
        return suit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Card card = (Card) o;
        return face == card.face &&
                suit == card.suit;
    }

    @Override
    public int hashCode() {
        return Objects.hash(face, suit);
    }

    @Override
    public String toString() {
        return face + " of " + suit;
    }
}
