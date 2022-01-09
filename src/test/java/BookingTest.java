import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookingTest {

    private Bedroom bedroom;
    private Booking booking;

    @Before
    public void before(){
        bedroom=new Bedroom(2, 2d, RoomType.DOUBLE,3);
        booking=new Booking(bedroom,3);
    }

    @Test
    public void canGetNumberOfNights(){

        int numberOfNights = booking.getNumberOfNights();

        assertEquals(3,numberOfNights);
    }

    @Test
    public void canGetBedroom(){

        Room room = booking.getRoom();

        assertEquals(room, bedroom);
    }

    @Test
    public void canRateRoom(){
        assertEquals(6d, booking.getTotalCost(),0.0);
    }
}
