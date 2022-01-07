package tr.com.hepsiburada.util;

import junit.framework.TestCase;
import org.junit.jupiter.api.Assertions;

import java.util.InvalidPropertiesFormatException;

public class StringUtilTest extends TestCase {

    public void testPlateauLimits() {
        int[] plateauLimits = StringUtil.plateauLimits("5 5");
        assertEquals(5, plateauLimits[0]);
        assertEquals(5, plateauLimits[1]);
    }

    public void testRoverPoints() {
        int[] roverPoints = StringUtil.roverPoints("1 2 N");
        assertEquals(1, roverPoints[0]);
        assertEquals(2, roverPoints[1]);

    }

    public void testRoverDirectionForNorth() throws InvalidPropertiesFormatException {
        String roverDirection = StringUtil.roverDirection("1 2 N");
        assertEquals("N", roverDirection);
    }
    public void testRoverDirectionForSouth() throws InvalidPropertiesFormatException {
        String roverDirection = StringUtil.roverDirection("1 2 S");
        assertEquals("S", roverDirection);
    }

    public void testRoverDirectionForEast() throws InvalidPropertiesFormatException {
        String roverDirection = StringUtil.roverDirection("1 2 E");
        assertEquals("E", roverDirection);
    }

    public void testRoverDirectionForWest() throws InvalidPropertiesFormatException {
        String roverDirection = StringUtil.roverDirection("1 2 W");
        assertEquals("W", roverDirection);
    }

    public void testRoverDirection_Throw_Error(){
        Assertions.assertThrows(InvalidPropertiesFormatException.class, () -> {
            StringUtil.roverDirection("WWW");
        });
    }
}