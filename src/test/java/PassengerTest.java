import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {
    private Passenger passenger;

    @Before
    public void before() {
        passenger = new Passenger("Todd Manius");
    }

    @Test
    public void passengerHasName(){
        assertEquals("Todd Manius", passenger.name);
    }
}
