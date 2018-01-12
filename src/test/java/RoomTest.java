import Hotel.BedroomType;
import Hotel.Room;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RoomTest {

    Room room;

    @Before
    public void before() {
        room = new Room("Bedroom", 2, 100, 2);
    }

    @Test
    public void canGetRoomType() {
        assertEquals("Bedroom", room.getRoomType());
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


