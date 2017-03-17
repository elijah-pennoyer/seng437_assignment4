package org.jfree.data.test.range.intersects;


import org.jfree.data.Range;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class RobustnessTest
{
    private Range r;
    private double lower, upper;
    private boolean expected;

    public RobustnessTest(double lower, double upper, boolean expected)
    {
        this.lower = lower;
        this.upper = upper;
        this.expected = expected;
    }

    @Before
    public void setup() { r = new Range(-5.0, 5.0); }


    @Parameters
    public static Collection<Object []> data()
    {
        return Arrays.asList(new Object[][]
                {
                        {-7.0,  -6.0,   false},
                        {-7.0,  -5.0,   true},
                        {-7.0,	-4.0,	true},
                        {-7.0,  -6.0,   false},
                        {-6.0,  -5.0,   true},
                        {-5.0,	-4.0,	true},
                        {-4.0,  -3.0,   true},
                        {-0.5,   0.5,   true},
                        {3.0,    4.0,   true},
                        {4.0,	 5.0,	true},
                        {5.0,    6.0,   true},
                        {6.0,    7.0,   false},
                        {4.0,	 7.0,	true},
                        {5.0,    7.0,   true},
                        {6.0,    7.0,   false}
                });
    }

    @Test
    public void intersects_LowerBoundRobustness_Test()
    {
        boolean result = r.intersects(lower, upper);
        assertEquals("Robustness tests for intersects on a mixed-value Range.", expected, result);
    }
}
