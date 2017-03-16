package org.jfree.data.test.range.shift;

import static org.junit.Assert.*;

import org.jfree.data.Range;
import org.junit.Before;
import org.junit.Test;

public class NegativeBoundsAndNegativeDeltaTest {

	public Range r;

	@Before
	/**
	 * Creates a range from -10.0 to -5.0
	 */
	public void setup(){
		r = new Range(-10.0, -5.0);
	}
	
	/**
	 * Test Plan Coverage: shift test plan 2
	 * Test Strategy Coverage: negative upper and lower bounds, negative delta
	 * Description: Tests the shift(Range, double) function on a Range from -10.0 to -5.0
	 * 				with delta = -1.0
	 * Expected Output: Range from -11.0 to -6.0
	 * Assumptions: N/A
	 */
	@Test
	public void shift_NegativeBoundsAndNegativeDelta_Test() {
		Range result = Range.shift(r, -1.0);
		Range expected = new Range(-11.0, -6.0);
		assertEquals("Failed shift method with a negative delta (-1.0) on a negative Range (-10.0 to -5.0)", expected, result);
	}

}
