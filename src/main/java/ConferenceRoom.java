public class ConferenceRoom extends Room {

    private String name;

    private RoomType type;

    public ConferenceRoom(RoomType roomType, String name) {
        super(roomType.getCapacity());
        this.type = roomType;
        this.name = name;
    }

    public String getName() {
        return name;
    }


}
