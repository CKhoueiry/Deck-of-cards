package dealer;

import deck.Card;
import exception.EmptyDeckException;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.*;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.hamcrest.core.IsNot.*;
import static org.junit.Assert.*;

public class DealerTest {

    private Dealer dealer;

    @Before
    public void init(){
        dealer = new Dealer();
        dealer.initializeDeck();
    }

    @Test
    public void deck_correctly_initialized(){
        assertThat(dealer.remainingCards(), is(equalTo(52)));
    }

    @Test
    public void deck_correctly_shuffled(){
        Card card = dealer.peek();
        dealer.shuffle();
        assertThat(card,is(not(equalTo(dealer.peek()))));
    }

    @Test
    public void deal_one_card_successful() throws EmptyDeckException {
        dealer.dealOneCard();
        assertThat(dealer.remainingCards(), is(equalTo(51)));
    }

    @Test(expected = EmptyDeckException.class)
    public void deal_one_card_throws_when_empty_deck() throws EmptyDeckException {
        dealer.emptyDeck();
        dealer.dealOneCard();
    }

}