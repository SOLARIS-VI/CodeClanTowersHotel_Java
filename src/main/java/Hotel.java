import java.util.ArrayList;

public class Hotel {

    private ArrayList<Bedroom> bedrooms;
    private ArrayList<ConferenceRoom> conferenceRooms;

    public Hotel(){
        this.bedrooms = new ArrayList<>();
        this.conferenceRooms = new ArrayList<>();
    }
    public void addBedroom(Bedroom bedroom) {
        this.bedrooms.add(bedroom);
    }

    public void addConferenceRoom(ConferenceRoom conferenceRoom){
        this.conferenceRooms.add(conferenceRoom);
    }

    public int getBedrooms() {
        return this.bedrooms.size();
    }

    public int getConferenceRooms() {
        return this.conferenceRooms.size();
    }

    public void checkInGuestToBedroom(Guest guest, Bedroom bedroom) {
        bedroom.addGuest(guest);
    }

    public void checkOutGuestOfBedroom(Guest guest, Bedroom bedroom) {
        bedroom.removeGuest(guest);
    }

    public void checkInGuestToConferenceRoom(Guest guest, ConferenceRoom conferenceRoom) {
        conferenceRoom.addGuest(guest);
    }

    public void checkOutGuestOfConferenceRoom(Guest guest, ConferenceRoom conferenceRoom) {
        conferenceRoom.removeGuest(guest);
    }
}
