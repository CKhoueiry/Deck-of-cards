package deck;

import org.junit.Before;
import org.junit.Test;

import static deck.Face.*;
import static deck.Suit.*;
import static org.hamcrest.core.Is.*;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.*;

public class CardTest {
    private Card card;

    @Before
    public void init(){
        card = new Card(FIVE, HEARTS);
    }

    @Test
    public void card_correctly_created(){
        assertThat(card.getFace(), is(equalTo(FIVE)));
        assertThat(card.getSuit(), is(equalTo(HEARTS)));
    }

    @Test
    public void to_string_correct_output(){
        assertThat(card.toString(),is(equalTo("FIVE of HEARTS")));
    }

}