package org.jfree.data.test.range.shift;

import static org.junit.Assert.*;

import org.jfree.data.Range;
import org.junit.Before;
import org.junit.Test;

public class ZeroLowerBoundTest {

	public Range r;

	@Before
	/**
	 * Creates a range from 0.0 to 5.0
	 */
	public void setup(){
		r = new Range(0.0, 5.0);
	}
	
	/**
	 * Test Plan Coverage: shift test plan 5
	 * Test Strategy Coverage: zero lower bound
	 * Description: Tests the shift(Range, double) function on a Range from 0.0 to 5.0
	 * 				with delta = -1.0
	 * Expected Output: Range from 0.0 to 4.0
	 * Assumptions: N/A
	 */
	@Test
	public void shift_ZeroLowerBound_Test() {
		Range result = Range.shift(r, -1.0);
		Range expected = new Range(0.0, 4.0);
		assertEquals("Failed shift method on a Range with a zero lower bound (0.0 to 5.0)", expected, result);
	}
}
