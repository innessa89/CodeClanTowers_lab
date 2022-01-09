import java.util.ArrayList;

public class Hotel {

    private ArrayList<Bedroom> bedrooms;
    private ArrayList<ConferenceRoom> conferenceRooms;

    public Hotel(ArrayList<Bedroom> bedrooms, ArrayList<ConferenceRoom> conferenceRooms) {
        this.bedrooms = bedrooms;
        this.conferenceRooms = conferenceRooms;
    }

    public void checkIn(Guest guest,Room room) throws Exception {
        room.addGuest(guest);
    }

    public void checkOut(Guest guest,Room room) throws Exception {
        room.removeGuest(guest);
    }

    public Booking bookRoom(Room room, int numberOfNights){
        return new Booking(room, numberOfNights);
    }

}
