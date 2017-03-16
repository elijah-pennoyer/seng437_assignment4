package org.jfree.data.test.range.getLength;

import static org.junit.Assert.assertEquals;

import org.jfree.data.Range;
import org.junit.Before;
import org.junit.Test;

public class EmptyRangeTest 
{
	private Range r;
	private double delta = 1e-15;
	
	/**
	 *	Creates an empty Range object.
	 */
	
	@Before
	public void setup() { r = new Range(10.5, 10.5); }
	
	/**
	 * 	Test Plan Coverage: getLength test plan 5
	 * 	Test Strategy Coverage: empty Range
	 * 	Description: 
	 * 
	 * 		Tests the getLength function on a Range from 10.5 to 10.5
	 * 
	 * 	Expected Output: 
	 * 
	 * 		0.0
	 * 
	 * 	Assumptions: N/A
	 */
	
	@Test
	public void getLength_EmptyRange_Test()
	{
		double expected = 0.0, result = r.getLength();
		assertEquals("Tested getLength on a Range from 10.5 to 10.5", expected, result, delta);
	}
}
