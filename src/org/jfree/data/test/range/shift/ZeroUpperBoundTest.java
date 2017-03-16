package org.jfree.data.test.range.shift;

import static org.junit.Assert.*;

import org.jfree.data.Range;
import org.junit.Before;
import org.junit.Test;

public class ZeroUpperBoundTest {

	public Range r;

	@Before
	/**
	 * Creates a range from -5.0 to 0.0
	 */
	public void setup(){
		r = new Range(-5.0, 0.0);
	}
	
	/**
	 * Test Plan Coverage: shift test plan 4
	 * Test Strategy Coverage: zero upper bound
	 * Description: Tests the shift(Range, double) function on a Range from -5.0 to 0.0
	 * 				with delta = 1.0
	 * Expected Output: Range from -4.0, 0.0
	 * Assumptions: N/A
	 */
	@Test
	public void shift_ZeroUpperBound_Test() {
		Range result = Range.shift(r, 1.0);
		Range expected = new Range(-4.0, 0.0);
		assertEquals("Failed shift method on a Range with a zero upper bound (-5.0 to 0.0)", expected, result);
	}
}
