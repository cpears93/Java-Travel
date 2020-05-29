import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {
    
    private Passenger passenger;
    
    @Before
    public void before(){
        passenger = new Passenger("Thomas Bangalter", 5);
    }
    
    @Test
    public void getName(){
        assertEquals("Thomas Bangalter", passenger.getName());
}
    @Test
    public void getNumberOfBags(){
        assertEquals(5 ,passenger.getNumberofBags());
    }
}
