package ca.jbrains.math.test;

import ca.jbrains.math.Fraction;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AddFractionsTest {
    @Test
    public void zeroPlusZero()throws Exception{
        assertEquals(0, new Fraction(0).plus(new Fraction(0)).intValue()); //this is a one line version of the codes.
    }

    @Test
    public void nonZeroPlusZero() throws Exception{
        final Fraction sum = new Fraction(3).plus(new Fraction(0));
        assertEquals(3,sum.intValue());
    }

    @Test
    public void nonZeroPlusNonZero() throws Exception{
        final Fraction sum = new Fraction(0).plus(new Fraction(5));
        assertEquals(5,sum.intValue());
    }

    @Test
    public void nonNegativeNonZeroOperands() throws Exception{
        final Fraction sum = new Fraction(3).plus(new Fraction(4));
        assertEquals(7, sum.intValue());
    }

    @Test
    public void negativeInputsAndNegativeOutputs() throws Exception{
        final Fraction sum = new Fraction(-3).plus(new Fraction(1));
        assertEquals(-2, sum.intValue());
    }

    @Test
    public void nonTrivialDenominator() throws Exception{
        final Fraction sum = new Fraction(1,5).plus(new Fraction(2,5));
        assertEquals(new Fraction(3,5),sum);

    }

}
