package org.jfree.data.test.range.getLength;

import static org.junit.Assert.assertEquals;

import org.jfree.data.Range;
import org.junit.Before;
import org.junit.Test;

public class ZeroLowerBoundTest 
{
	private Range r;
	private double delta = 1e-15;
	
	/**
	 *	Creates an Range from 0.0 to 5.5.
	 */
	
	@Before
	public void setup() { r = new Range(0.0, 5.5); }
	
	/**
	 * 	Test Plan Coverage: getLength test plan 6
	 * 	Test Strategy Coverage: Range with zero as the lower bound and a positive upper bound.
	 * 	Description: 
	 * 
	 * 		Tests the getLength function on a Range from 0.0 to 5.5
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
		assertEquals("Tested getLength on a Range from 0.0 to 5.5", expected, result, delta);
	}
}
