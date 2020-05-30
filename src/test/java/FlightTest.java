import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    private Flight flight;

    @Before
    public void before(){
        ArrayList<Integer> passenger = new ArrayList<Integer>();
        passenger.add(1);
        flight = new Flight(1,"378","Budapest", "GLA", "08:43", 20);
    }

    @Test
    public void getFlightNumber(){
        assertEquals("378", flight.getFlightNumber());
    }

    @Test
    public void getDestination(){
        assertEquals("Budapest", flight.getDestination());
    }

    @Test
    public void getDepartureAirport(){
        assertEquals("GLA", flight.getDepartureAirport());
    }

    @Test
    public void getDepartureTime(){
        assertEquals("08:43", flight.getDepartureTime());
    }

    @Test
    public void getAvailableSeats(){
        assertEquals(20, flight.getAvailableSeats());
    }

    @Test
    public void addBookedPassengers(){
        flight.addPassenger(1);
        assertEquals(20, flight.addBookedPassengers());
    }
}
