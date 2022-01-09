import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class BedroomTest {

    Bedroom bedroom;
    Guest guest;

    @Before
    public void before(){
        bedroom=new Bedroom(2, 2d, RoomType.DOUBLE,10);
        guest=new Guest("Alex");
    }

    @Test
    public void hasCapacity(){
        assertEquals(2,bedroom.getCapacity());
    }

    @Test
    public void canGetRoomType(){
        assertEquals(RoomType.DOUBLE,bedroom.getRoomType());
    }

    @Test
    public void canGetRoomNumber(){
        assertEquals(10, bedroom.getRoomNumber());
    }


    @Test
    public void canAddGuest() throws Exception {
        bedroom.addGuest(guest);

        assertEquals(1, bedroom.getNumberOfGuest());
    }

    @Test
    public void cantAddGuestMoreThanCapacity() throws Exception {
        bedroom.addGuest(guest);
        bedroom.addGuest(guest);

        assertThrows(Exception.class, () -> bedroom.addGuest(guest));

        assertEquals(2, bedroom.getNumberOfGuest());
    }

    @Test
    public void  canRemoveGuest() throws Exception {
        bedroom.addGuest(guest);

        bedroom.removeGuest(guest);

        assertEquals(0,bedroom.getNumberOfGuest());
    }
}


