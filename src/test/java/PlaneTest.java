import org.junit.Before;
import org.junit.Test;

import javax.accessibility.AccessibleStateSet;

import static org.junit.Assert.assertEquals;

public class PlaneTest {

    private Plane plane;

    @Before
    public void before(){
        plane = new Plane(PlaneType.CAPACITY, PlaneType.TOTALWEIGHT);
    }

    @Test
    public void getCapacity(){
        assertEquals(PlaneType.CAPACITY, plane.getCapacity());
    }

    @Test
    public void getTotalWeight(){
        assertEquals(PlaneType.TOTALWEIGHT, plane.getTotalWeight());
    }

    @Test
    public void capacityHasValue300(){
        plane = new Plane(PlaneType.CAPACITY, PlaneType.TOTALWEIGHT);
        assertEquals(300, plane.getValueFromEnum());
    }
    @Test
    public void totalWeightHasValue5000(){
        plane = new Plane(PlaneType.TOTALWEIGHT, PlaneType.CAPACITY);
        assertEquals(5000, plane.getValueFromEnum());
    }
}
