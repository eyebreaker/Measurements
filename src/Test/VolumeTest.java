package Test;

import DimensionOne.Centimeter;
import DimensionThree.Cup;
import DimensionThree.OZ;
import DimensionThree.TBSP;
import org.junit.Test;

import java.lang.reflect.InvocationTargetException;

import static org.junit.Assert.*;

/**
 * Created by Bhushan on 30-Jul-15.
 */
public class VolumeTest {

    @Test
    public void testOztsp(){
        OZ oz = new OZ(5);
        TBSP tbsp = new TBSP(oz.getInBaseUnit());
        assertEquals(10,tbsp.getValue(),0.0000);
    }

    @Test
    public void testVolumeToLengthEqualsCheckFails(){
        Centimeter c = new Centimeter(6);
        OZ oz = new OZ(1);
        assertFalse(c.equals(oz));
    }

    @Test
    public void testAddMethodAddingTBSPToOZ() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        TBSP tbsp = new TBSP(4);
        OZ oz = new OZ(3);
        assertTrue(new OZ(5).equals(oz.add(tbsp)));
    }

    @Test
    public void testAddMethodAddingOZToTBSP() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        TBSP tbsp = new TBSP(4);
        OZ oz = new OZ(3);
        assertTrue(new TBSP(10).equals(tbsp.add(oz)));
    }

    @Test
    public void testAddMethodAddingCupToTBSP() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        TBSP tbsp = new TBSP(4);
        Cup cup = new Cup(3);
        assertTrue(new TBSP(52).equals(tbsp.add(cup)));
    }

}