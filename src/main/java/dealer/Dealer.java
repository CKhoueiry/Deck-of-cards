package dealer;

import deck.Card;
import deck.Face;
import deck.Suit;
import exception.EmptyDeckException;

import java.util.Arrays;
import java.util.Collections;
import java.util.Stack;

public class Dealer {
    private Stack<Card> deck;

    public Dealer() {
        this.deck = new Stack<>();
    }

    public void initializeDeck(){
        Arrays.stream(Suit.values()).forEach(suit -> Arrays.stream(Face.values()).forEach(face -> deck.push(new Card(face,suit))));
    }

    public int remainingCards(){
        return deck.size();
    }

    public void shuffle(){
        Collections.shuffle(deck);
    }


    public Card dealOneCard() throws EmptyDeckException {
        if(deck.empty())
            throw new EmptyDeckException("No more cards in the deck");
        return deck.pop();
    }

    Card peek(){
        return deck.peek();
    }

    void emptyDeck(){
        deck.clear();
    }
}
