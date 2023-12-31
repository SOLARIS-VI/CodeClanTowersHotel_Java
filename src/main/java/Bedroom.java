public class Bedroom extends Room {


    private int roomNumber;
    private RoomType type;
    private double nightlyRate;


    public Bedroom(RoomType roomType, int roomNumber, double nightlyRate){
        super(roomType.getCapacity());
        this.roomNumber = roomNumber;
        this.type = roomType;
        this.nightlyRate = nightlyRate;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public RoomType getType() {
        return type;
    }

    public double getNightlyRate() {
        return nightlyRate;
    }

}
