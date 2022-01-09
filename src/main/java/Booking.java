public class Booking {

    private Room room;
    private int numberOfNights;

    public Booking(Room room, int numberOfNights) {
        this.room = room;
        this.numberOfNights = numberOfNights;
    }

    public Room getRoom() {
        return room;
    }

    public int getNumberOfNights() {
        return numberOfNights;
    }

    public double getTotalCost(){
        return numberOfNights*room.getRate();
    }

}
