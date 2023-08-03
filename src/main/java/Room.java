import java.util.ArrayList;

public abstract class Room {

    private int capacity;
    private ArrayList<Guest> guests;


    public Room(int capacity) {
        this.capacity = capacity;
        this.guests = new ArrayList<Guest>();
    }


    public int getCapacity() {
        return capacity;
    }

    public void addGuest(Guest guest) {
        if(this.getNumberOfGuests() <= this.capacity){
            this.guests.add(guest);
        }
    }

    public int getNumberOfGuests() {
        return this.guests.size();
    }

    public void removeGuest(Guest guest) {
        this.guests.remove(guest);
    }
}
