import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    Bedroom bedroom;

    @Before
    public void before(){
        bedroom = new Bedroom(BedroomType.SINGLE, 1);
    }

    @Test
    public void canGetBedroomType(){
        assertEquals(BedroomType.SINGLE, bedroom.getBedroomType());
    }

    @Test
    public void singlePriceIs50(){
        bedroom = new Bedroom(BedroomType.SINGLE, 1);
        int value = bedroom.getBedroomType().getPrice();
        assertEquals(50, value);
    }

    @Test
    public void doubleCapacityIs2(){
        bedroom = new Bedroom(BedroomType.DOUBLE, 2);
        int value = bedroom.getBedroomType().getCapacity();
        assertEquals(2, value);
    }

}
