package org.jfree.data.test.range.getCentralValue;

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
	 * 	Test Plan Coverage: getCentralValue test plan 2
	 * 	Test Strategy Coverage: empty Range
	 * 	Description: 
	 * 
	 * 		Tests the getCentralValue function on a Range from 10.5 to 10.5
	 * 
	 * 	Expected Output: 
	 * 
	 * 		10.5
	 * 
	 * 	Assumptions: 
	 * 
	 * 		An empty Range object is assumed to be a Range with equal
	 * 		upper and lower bounds.
	 */
	
	@Test
	public void getCentralValue_EmptyRange_Test()
	{
		double expected = 10.5, result = r.getCentralValue();
		assertEquals("Tested getCentralValue on a Range from 10.5 to 10.5", expected, result, delta);
	}
	
}
