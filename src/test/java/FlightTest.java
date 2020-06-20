import org.junit.Before;
import org.junit.Test;

public class FlightTest {
    private ArrayList<PassengerList> bookedPassengers;

    @Before
    public void before(){
        bookedPassengers = new PassengerList();
    }

    @Test
    public void flightHasPassengerList__noBookedPassengers(){
        assertEquals(0, bookedPassengers.count());
    }
}
