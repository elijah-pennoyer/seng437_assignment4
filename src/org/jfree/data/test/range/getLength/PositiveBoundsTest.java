package org.jfree.data.test.range.getLength;

import static org.junit.Assert.assertEquals;

import org.jfree.data.Range;
import org.junit.Before;
import org.junit.Test;

public class PositiveBoundsTest 
{
	private Range r;
	private double delta = 1e-15;
	
	/**
	 *	Creates an Range from 5.0 to 10.5.
	 */
	
	@Before
	public void setup() { r = new Range(5.0, 10.5); }
	
	/**
	 * 	Test Plan Coverage: getLength test plan 2
	 * 	Test Strategy Coverage: Range with positive lower and upper bounds
	 * 	Description: 
	 * 
	 * 		Tests the getLength function on a Range from 5.0 to 10.5
	 * 
	 * 	Expected Output: 
	 * 
	 * 		5.5
	 * 
	 * 	Assumptions: N/A
	 */
	
	@Test
	public void getLength_PositiveBounds_Test()
	{
		double expected = 5.5, result = r.getLength();
		assertEquals("Tested getLength on a Range from 5.0 to 10.5", expected, result, delta);
	}
}
