package deck;

import org.hamcrest.core.Is;
import org.junit.Test;

import static deck.Face.*;
import static org.hamcrest.core.Is.*;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.*;

public class FaceTest {

    @Test
    public void face_correctly_created(){
        assertThat(THREE.getValue(), is(equalTo(3)));
    }
}