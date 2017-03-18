package org.jfree.data.test.range.intersects;

import org.jfree.data.Range;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RangeIsFromLowerToUpperTest
{
    private Range r;
    private boolean expected = true;

    @Before
    public void setup() { r = new Range(-5.0, 5.0); }

    @Test
    public void intersects_RangeIsFromLowerToUpper_Test()
    {
        boolean actual = r.intersects(-5.0, 5.0);
        assertEquals("Tested intersects on a Range from -5.0 to 5.0 for (lower, upper) = (-5.0, 5.0).",
            expected, actual);
    }
}
