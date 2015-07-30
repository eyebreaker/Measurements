package Test;

import Temperature.Celsius;
import Temperature.Fahrenheit;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Bhushan on 30-Jul-15.
 */
public class UnscaledMeasureTest {

    @Test
    public void testFarenheit(){
        Fahrenheit f = new Fahrenheit(33.8);
        Celsius c = new Celsius(0);
        assertTrue(new Celsius(1).equals(c.add(f)));
    }



}