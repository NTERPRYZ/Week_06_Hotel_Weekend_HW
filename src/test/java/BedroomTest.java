import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    Bedroom bedroom;

    @Before
    public void before(){
        bedroom = new Bedroom(BedroomType.SINGLE);
    }

    @Test
    public void canGetBedroomType(){
        assertEquals(BedroomType.SINGLE, bedroom.getBedroomType());
    }

    @Test


}
