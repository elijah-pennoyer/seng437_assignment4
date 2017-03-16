package org.jfree.data.test.range.getCentralValue;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.jfree.data.Range;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith (Parameterized.class)
public class PositiveCentralValueTest 
{
	private Range r;
	private double expected;
	private double delta = 1e-15;
	
	public PositiveCentralValueTest(double lower, double upper, double expected)
	{
		r = new Range(lower, upper);
		this.expected = expected;
	}
	
	@Parameters
	public static Collection<Object []> data()
	{
		return Arrays.asList(new Object[][]
		{
			{5.0,	10.5,	7.75},
			{0.0,	5.5,	2.75},
			{-5.0,	10.5,	2.75}
		});
	}
	
	/**
	 * 	Test Plan Coverage: getCentralValue test plan 3
	 * 	Test Strategy Coverage: positive-centered Range
	 * 	Description: 
	 * 
	 * 		Tests the getCentralValue function on a positive-centered Range for 
	 * 		three equivalence classes:
	 * 	
	 * 		1.	non-empty Range (from 5.0 to 10.5)
	 * 		2.	lower bound at zero (from 0.0 to 5.5)
	 * 		3.	lower bound less than zero (from -5.0 to 10.5)
	 * 
	 * 	Expected Output:
	 * 
	 * 		1.	7.75
	 * 		2.	2.75
	 * 		3.	2.75
	 * 
	 * 	Assumptions: N/A
	 */
	
	@Test
	public void getCentralValue_PositiveCentralValue_Test()
	{
		double result = r.getCentralValue();
		assertEquals("Tested getCentralValue on a positive-centered Range for " +
				"three equivalence classes:\n1. non-empty Range (from 5.0 to 10.5)\n" +
				"2. upper bound at zero (from 0.0 to 5.5)\n" +
				"3. upper bound greater than zero (-5.0 to 10.5)", expected, result, delta);
	}
}
