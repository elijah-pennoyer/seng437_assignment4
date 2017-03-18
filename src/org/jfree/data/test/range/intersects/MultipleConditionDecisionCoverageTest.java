package org.jfree.data.test.range.intersects;

import org.jfree.data.Range;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.*;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class MultipleConditionDecisionCoverageTest
{
    private Range r;
    private double lower, upper;
    private boolean expected;

    public MultipleConditionDecisionCoverageTest(double lower, double upper, boolean expected)
    {
        this.lower = lower;
        this.upper = upper;
        this.expected = expected;
    }

    @Before
    public void setup() { r = new Range(-5.0, 5.0); }

    @Parameters
    public static Collection<Object[]> data()
    {
        return Arrays.asList(new Object[][]
        {
            {-6.0,  -6.0,   false},
            {-6.0,   6.0,   true},
            {6.0,    6.0,   false},
            {4.0,    4.0,   true}
        });
    }

    @Test
    public void intersects_MultipleConditionDecisionCoverage_Test()
    {
        boolean result = r.intersects(lower, upper);
        assertEquals("MCDC tests for intersects on a mixed-value Range."
                + "\nRange was " + r + ", lower was " + lower
                + ", upper was " + upper, expected, result);

    }
}
