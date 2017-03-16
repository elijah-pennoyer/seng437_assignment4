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
public class NegativeCentralValueTest 
{
	private Range r;
	private double expected;
	private double delta = 1e-15;
	
	public NegativeCentralValueTest(double lower, double upper, double expected)
	{
		r = new Range(lower, upper);
		this.expected = expected;
	}
	
	@Parameters
	public static Collection<Object []> data()
	{
		return Arrays.asList(new Object[][]
		{
			{-10.5,	-5.0,	-7.75},
			{-5.5,	 0.0,	-2.75},
			{-10.5,	 5.0,	-2.75}
		});
	}
	
	/**
	 * 	Test Plan Coverage: getCentralValue test plan 4
	 * 	Test Strategy Coverage: negative-centered Range
	 * 	Description: 
	 * 
	 * 		Tests the getCentralValue function on a negative-centered Range for 
	 * 		three equivalence classes:
	 * 	
	 * 		1.	non-empty Range (from -10.5 to -5.0)
	 * 		2.	upper bound at zero (from -5.5 to 0.0)
	 * 		3.	upper bound greater than zero (from -10.5 to 5.0)
	 * 
	 * 	Expected Output:
	 * 
	 * 		1.	-7.75
	 * 		2.	-2.75
	 * 		3.	-2.75
	 * 
	 * 	Assumptions: N/A
	 */
	
	@Test
	public void getCentralValue_NegativeCentralValue_Test()
	{
		double result = r.getCentralValue();
		assertEquals("Tested getCentralValue on a negative-centered Range for " +
				"three equivalence classes:\n1. non-empty Range (from -10.5 to -5.0)\n" +
				"2. upper bound at zero (from -5.5 to 0.0)\n" +
				"3. upper bound greater than zero (-10.5 to 5.0)", expected, result, delta);
	}
}
