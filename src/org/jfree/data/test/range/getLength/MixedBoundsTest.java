package org.jfree.data.test.range.getLength;

import static org.junit.Assert.assertEquals;

import org.jfree.data.Range;
import org.junit.Before;
import org.junit.Test;

public class MixedBoundsTest 
{
	private Range r;
	private double delta = 1e-15;
	
	/**
	 *	Creates an Range from -5.5 to 5.0.
	 */
	
	@Before
	public void setup() { r = new Range(-5.5, 5.0); }
	
	/**
	 * 	Test Plan Coverage: getLength test plan 4
	 * 	Test Strategy Coverage: Range with a zero crossing.
	 * 	Description: 
	 * 
	 * 		Tests the getLength function on a Range from -5.5 to 5.0
	 * 
	 * 	Expected Output: 
	 * 
	 * 		10.5
	 * 
	 * 	Assumptions: N/A
	 */
	
	@Test
	public void getLength_MixedBounds_Test()
	{
		double expected = 10.5, result = r.getLength();
		assertEquals("Tested getLength on a Range from -5.5 to 5.0", expected, result, delta);
	}
}
