import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    private Hotel hotel;
    private Guest guest;
    private Bedroom bedroom;

    @Before
    public void before(){
        ArrayList<Bedroom> bedrooms = new ArrayList<>();
        bedroom = new Bedroom(1, 3d, RoomType.SINGLE, 4);
        bedrooms.add(bedroom);
        ArrayList<ConferenceRoom> conferenceRooms=new ArrayList<>();
        hotel=new Hotel(bedrooms,conferenceRooms);
        guest=new Guest("Anna");
    }

    @Test
    public void canMakeCheckIn() throws Exception {
        hotel.checkIn(guest,bedroom);

        assertEquals(1, bedroom.getNumberOfGuest());
    }

    @Test
    public void canMakeCheckOut() throws Exception {
        hotel.checkIn(guest,bedroom);

        hotel.checkOut(guest,bedroom);

        assertEquals(0, bedroom.getNumberOfGuest());
    }

}
