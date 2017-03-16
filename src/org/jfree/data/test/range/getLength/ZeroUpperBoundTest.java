package org.jfree.data.test.range.getLength;

import static org.junit.Assert.assertEquals;

import org.jfree.data.Range;
import org.junit.Before;
import org.junit.Test;

public class ZeroUpperBoundTest 
{
	private Range r;
	private double delta = 1e-15;
	
	/**
	 *	Creates an Range from -5.5 to 0.0.
	 */
	
	@Before
	public void setup() { r = new Range(-5.5, 0.0); }
	
	/**
	 * 	Test Plan Coverage: getLength test plan 7
	 * 	Test Strategy Coverage: Range with zero as the upper bound and a negative lower bound.
	 * 	Description: 
	 * 
	 * 		Tests the getLength function on a Range from -5.5 to 0.0
	 * 
	 * 	Expected Output: 
	 * 
	 * 		5.5
	 * 
	 * 	Assumptions: N/A
	 */
	
	@Test
	public void getLength_ZeroLowerBound_Test()
	{
		double expected = 5.5, result = r.getLength();
		assertEquals("Tested getLength on a Range from -5.5 to 0.0", expected, result, delta);
	}
}
