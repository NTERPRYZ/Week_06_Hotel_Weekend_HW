import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RoomTest {

    private Room room;
    private RoomType roomType;


    @Before
    public void before() {
        room = new Room(2, 100, 2);
        roomType = new RoomType("bedroom");
    }


    @Test
    public void canGetRoomCapacity() {
        assertEquals(2, room.getRoomCapacity());
    }

    @Test
    public void canGetRoomPrice() {
        assertEquals(100, room.getRoomPrice());
    }

    @Test
    public void canGetNumberOfGuests() {
        assertEquals(2, room.getNumberOfGuests());
    }

}


