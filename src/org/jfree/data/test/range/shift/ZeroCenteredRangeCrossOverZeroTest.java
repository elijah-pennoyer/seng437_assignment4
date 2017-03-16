package org.jfree.data.test.range.shift;

import static org.junit.Assert.*;

import org.jfree.data.Range;
import org.junit.Before;
import org.junit.Test;

public class ZeroCenteredRangeCrossOverZeroTest {

	public Range r;

	@Before
	/**
	 * Creates a range from -1.0 to 1.0
	 */
	public void setup(){
		r = new Range(-1.0, 1.0);
	}
	
	/**
	 * Test Plan Coverage: shift test plan 6
	 * Test Strategy Coverage: attempt to cross over zero with a zero-centered range
	 * Description: Tests the shift(Range, double) function on a Range from -1.0 to 1.0
	 * 				with delta = 2.0
	 * Expected Output: Range from 0.0 to 3.0
	 * Assumptions: N/A
	 */
	@Test
	public void shift_ZeroCenteredRangeCrossOverZero_Test() {
		Range result = Range.shift(r, 2.0);
		Range expected = new Range(0.0, 3.0);
		assertEquals("Failed shift method attempting to cross over zero with a zero-centered range",expected, result);
	}
}
