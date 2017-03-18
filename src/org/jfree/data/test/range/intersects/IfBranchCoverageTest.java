package org.jfree.data.test.range.intersects;

import org.jfree.data.Range;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.*;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class IfBranchCoverageTest
{
    private Range r;
    private double lower, upper;
    private boolean expected;

    public IfBranchCoverageTest(double lower, double upper, boolean expected)
    {
        this.lower = lower;
        this.upper = upper;
        this.expected = expected;
    }

    @Before
    public void setup() { r = new Range(-5.0, 5.0); }

    @Parameters
    public Collection<Object[]> data()
    {
        Arrays.asList(new Object[][]
        {
            {-4.0, 4.0, true},
            {-6.0, 6.0, false},
            {},
            {-6.0},
            {-4.0},
        }
        );
    }



}
