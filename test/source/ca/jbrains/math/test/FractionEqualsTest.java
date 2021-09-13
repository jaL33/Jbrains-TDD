package ca.jbrains.math.test;

import ca.jbrains.math.Fraction;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;




public class FractionEqualsTest {
    @Test
    public void sameNumeratorAndDenomonitor() throws Exception {
        assertEquals(new Fraction(3, 5), new Fraction(3, 5));
    }
}