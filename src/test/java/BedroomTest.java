import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    Bedroom bedroom;
    Guest guest;


    @Before
    public void before(){
        bedroom = new Bedroom(RoomType.SINGLE, 100,55.00);
        guest = new Guest("Ian");
    }

    @Test
    public void canGetRoomType(){

        assertEquals(RoomType.SINGLE, bedroom.getType());
    }

    @Test
    public void getCapacity(){
        assertEquals(1, bedroom.getCapacity());
    }

    @Test
    public void getNumberOfGuests(){
        assertEquals(0, bedroom.getNumberOfGuests());
        bedroom.addGuest(guest);
        assertEquals(1, bedroom.getNumberOfGuests());
    }

    @Test
    public void removeGuest(){
        bedroom.addGuest(guest);
        bedroom.removeGuest(guest);
        assertEquals(0, bedroom.getNumberOfGuests());
    }
}
