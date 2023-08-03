import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {

ConferenceRoom conferenceRoom;
Guest guest;
Guest guest2;
Guest guest3;

@Before
    public void before(){
        conferenceRoom = new ConferenceRoom(RoomType.CONFERENCE, "Main Hall");
        guest = new Guest("Paul");
        guest2 = new Guest("Alex");
        guest3 = new Guest("Kirsty");
}

@Test
    public void hasName(){
    assertEquals("Main Hall", conferenceRoom.getName());
}

    @Test
    public void getCapacity(){
        assertEquals(30, conferenceRoom.getCapacity());
    }



}
