package org.jfree.data.test.range.shift;

import static org.junit.Assert.*;

import org.jfree.data.Range;
import org.junit.Before;
import org.junit.Test;

public class PositiveBoundsAndPositiveDeltaTest {

	public Range r;

	@Before
	/**
	 * Creates a range from 5.0 to 10.0
	 */
	public void setup(){
		r = new Range(5.0, 10.0);
	}
	
	/**
	 * Test Plan Coverage: shift test plan 1
	 * Test Strategy Coverage: positive upper and lower bounds, positive delta
	 * Description: Tests the shift(Range, double) function on a Range from 5.0 to 10.0
	 * 				with delta = 1.0
	 * Expected Output: Range from 6.0 to 11.0
	 * Assumptions: N/A
	 */
	@Test
	public void shift_PositiveBoundsAndPositiveDelta_Test() {
		Range result = Range.shift(r, 1.0);
		Range expected = new Range(6.0, 11.0);
		assertEquals("Failed shift method with a positive delta (1.0) on a positive Range (5.0 to 10.0)", expected, result);
	}

}
