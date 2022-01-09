import java.util.ArrayList;

public class Bedroom extends Room {

    private RoomType roomType;
    private int roomNumber;

    public Bedroom(int capacity, double rate, RoomType roomType, int roomNumber) {
        super(capacity, rate);
        this.roomType = roomType;
        this.roomNumber = roomNumber;
    }


    public RoomType getRoomType() {
        return roomType;
    }

    public int getRoomNumber() {
        return roomNumber;
    }


}
