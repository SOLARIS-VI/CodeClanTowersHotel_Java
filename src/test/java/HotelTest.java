import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    Hotel hotel;
    Bedroom bedroom;
    ConferenceRoom conferenceRoom;
    Guest guest;

    @Before
    public void before(){
        hotel = new Hotel();
        bedroom = new Bedroom(RoomType.DOUBLE, 100, 55.00);
        conferenceRoom = new ConferenceRoom(RoomType.CONFERENCE, "Main Hall");
        guest = new Guest ("Jen");
    }

    @Test
    public void canAddBedroom(){
        hotel.addBedroom(bedroom);
        assertEquals(1, hotel.getBedrooms());
    }

    @Test
    public void canAddConferenceRoom(){
        hotel.addConferenceRoom(conferenceRoom);
        assertEquals(1,hotel.getConferenceRooms());
    }

    @Test
    public void canCheckInGuestToBedroom(){
        hotel.checkInGuestToBedroom(guest, bedroom);
        assertEquals(1, bedroom.getNumberOfGuests() );
    }

    @Test
    public void canCheckOutGuestOfBedroom(){
        hotel.checkInGuestToBedroom(guest, bedroom);
        hotel.checkOutGuestOfBedroom(guest, bedroom);
        assertEquals(0, bedroom.getNumberOfGuests());
    }

    @Test
    public void canCheckInGuestToConferenceRoom(){
        hotel.checkInGuestToConferenceRoom(guest, conferenceRoom);
        assertEquals(1, conferenceRoom.getNumberOfGuests() );
    }

    @Test
    public void canCheckOutGuestOfConferenceRoom(){
        hotel.checkInGuestToConferenceRoom(guest, conferenceRoom);
        hotel.checkOutGuestOfConferenceRoom(guest, conferenceRoom);
        assertEquals(0, conferenceRoom.getNumberOfGuests());
    }


}
