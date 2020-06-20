import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;


public class FlightTest {
    private Flight flight;
    private ArrayList<Passenger> passengers;

    @Before
    public void before(){
        flight = new Flight();
        passengers = new ArrayList<Passenger>();
    }

    @Test
    public void flightHasPassengerList__noBookedPassengers(){
        assertEquals(0, flight.passengerCount());
    }
}
