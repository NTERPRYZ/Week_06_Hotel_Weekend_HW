import Hotel.RoomType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RoomTypeTest {

    private RoomType roomType;

    @Before
    public void before() {
        roomType = new RoomType("Bedroom");
    }

    @Test
    public void roomHasType(){
        assertEquals("Bedroom", roomType.getRoomType());
    }





}
