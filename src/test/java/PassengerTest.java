import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {
    private Passenger passenger;
    private Passenger passenger2;

    @Before
    public void before() {
        passenger = new Passenger("Todd Manius", 2);
        passenger2 = new Passenger("Nicu Icavoc", 0);
    }

    @Test
    public void passengerHasName(){
        assertEquals("Todd Manius", passenger.name);
    }

    @Test
    public void passengerCanHaveBags(){
        assertEquals(2, passenger.bagCount);
    }

    @Test
    public void passengerCanHaveNoBags(){
        assertEquals(0, passenger2.bagCount);
    }

}
