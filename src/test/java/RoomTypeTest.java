import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RoomTypeTest {

    private RoomType roomType;

    @Before
    public void before() {
        roomType = new RoomType("Bedroom", 1, 50, 1);
    }

    @Test
    public void roomHasType(){
        assertEquals("Bedroom", roomType.getRoomType());
    }





}
