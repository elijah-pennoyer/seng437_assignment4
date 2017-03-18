package org.jfree.data.test.range.intersects;

import org.jfree.data.Range;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RangeIsSubsetOfLowerAndUpperTest
{
    private Range r;
    private boolean expected = true;

    @Before
    public void setup() { r = new Range(-5.0, 5.0); }

    @Test
    public void intersects_RangeIsSubsetOfLowerAndUpper_Test()
    {
        boolean actual = r.intersects(-6.0, 6.0);
        assertEquals("Tested intersects on a Range from -5.0 to 5.0 for (lower, upper) = (-6.0, 6.0).",
                expected, actual);
    }
}
