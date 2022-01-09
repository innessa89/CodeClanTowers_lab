import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class ConferenceRoomTest {

   private ConferenceRoom conferenceRoom;
   private Guest guest;

    @Before
    public void before(){
        conferenceRoom=new ConferenceRoom(2, 2d,"Small");
        guest=new Guest("Alex");
    }

    @Test
    public void hasCapacity(){
        assertEquals(2,conferenceRoom.getCapacity());
    }

    @Test
    public void canAddGuest() throws Exception {
        conferenceRoom.addGuest(guest);

        assertEquals(1, conferenceRoom.getNumberOfGuest());
    }

    @Test
    public void cantAddGuestMoreThanCapacity() throws Exception {
        conferenceRoom.addGuest(guest);
        conferenceRoom.addGuest(guest);

        assertThrows(Exception.class, () -> conferenceRoom.addGuest(guest));

        assertEquals(2, conferenceRoom.getNumberOfGuest());
    }

    @Test
    public void  canRemoveGuest() throws Exception {
        conferenceRoom.addGuest(guest);

        conferenceRoom.removeGuest(guest);

        assertEquals(0,conferenceRoom.getNumberOfGuest());
    }

    @Test
    public void canGeRoomName(){
        assertEquals("Small", conferenceRoom.getName());
    }

}
