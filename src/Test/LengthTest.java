package Test;

import DimensionOne.Centimeter;
import DimensionOne.Feet;
import DimensionOne.Meter;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Bhushan on 29-Jul-15.
 */
public class LengthTest {

    @Test
    public void testMeterToCentimeter() throws Exception{
        Meter q1 = new Meter(1);
        Centimeter q2 = new Centimeter(100);

        assertTrue(q1.equals(q2));
    }

    @Test
    public void testCentimeterToFeet() throws Exception{
        Feet q1 = new Feet(1);
        Centimeter q2 = new Centimeter(2.54 * 12);

        assertTrue(q1.equals(q2));
    }

    @Test
    public void testMeterToFeet() throws  Exception{
        Meter m = new Meter(1);
        Feet f = new Feet(m.getInBaseUnit()) ;
        assertEquals(((100/2.54)/12), f.getValue(),0.00000000001);
    }

}