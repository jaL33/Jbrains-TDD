package ca.jbrains.math.test;

import ca.jbrains.math.Fraction;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SubtractFractionTest {

    @Test
    public void zeroMinusZero()throws Exception{
        assertEquals(new Fraction(0), new Fraction(0).subtract(new Fraction(0)));
    }

}
