package euler;

import static org.junit.Assert.*;

import org.junit.Test;

public class _009SpecialPythagoreanTripletTest {

    @Test
    public void isTripletTest() {
        assertEquals(_009SpecialPythagoreanTriplet.isPythagoreanTriplet(3, 4, 5), true);
        assertEquals(_009SpecialPythagoreanTriplet.isPythagoreanTriplet(3, 4, 6), false);
        assertEquals(_009SpecialPythagoreanTriplet.isPythagoreanTriplet(0, 0, 0), false);
        assertEquals(_009SpecialPythagoreanTriplet.isPythagoreanTriplet(0, 1, 1), false);
        assertEquals(_009SpecialPythagoreanTriplet.isPythagoreanTriplet(5, 12, 13), true);
        assertEquals(_009SpecialPythagoreanTriplet.isPythagoreanTriplet(9, 40, 41), true);
        assertEquals(_009SpecialPythagoreanTriplet.isPythagoreanTriplet(-3, -4, -5), false);
        assertEquals(_009SpecialPythagoreanTriplet.isPythagoreanTriplet(3, 4, -5), false);
        }
    
    @Test
    public void isSum1000Test() {
        assertEquals(_009SpecialPythagoreanTriplet.isSum1000(1, 1, 1), false);
        assertEquals(_009SpecialPythagoreanTriplet.isSum1000(999, 1, 0), true);
        assertEquals(_009SpecialPythagoreanTriplet.isSum1000(50, 50, 900), true);
    }
    }

