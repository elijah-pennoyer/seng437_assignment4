package org.jfree.data.test.range.getLength;

import static org.junit.Assert.assertEquals;

import org.jfree.data.Range;
import org.junit.Before;
import org.junit.Test;

public class NegativeBoundsTest 
{
	private Range r;
	private double delta = 1e-15;
	
	/**
	 *	Creates an Range from -10.5 to -5.0.
	 */
	
	@Before
	public void setup() { r = new Range(-10.5, -5.0); }
	
	/**
	 * 	Test Plan Coverage: getLength test plan 3
	 * 	Test Strategy Coverage: Range with negative lower and upper bounds
	 * 	Description: 
	 * 
	 * 		Tests the getLength function on a Range from -10.5 to -5.0
	 * 
	 * 	Expected Output: 
	 * 
	 * 		5.5
	 * 
	 * 	Assumptions: N/A
	 */
	
	@Test
	public void getLength_NegativeBounds_Test()
	{
		double expected = 5.5, result = r.getLength();
		assertEquals("Tested getLength on a Range from -10.5 to -5.0", expected, result, delta);
	}
}
