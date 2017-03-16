package org.jfree.data.test.range.shift;

import static org.junit.Assert.*;

import org.jfree.data.Range;
import org.junit.Before;
import org.junit.Test;

public class ZeroDeltaTest {

	public Range r;

	@Before
	/**
	 * Creates a range from 5.0 to 10.0
	 */
	public void setup(){
		r = new Range(5.0, 10.0);
	}
	
	/**
	 * Test Plan Coverage: shift test plan 3
	 * Test Strategy Coverage: zero delta
	 * Description: Tests the shift(Range, double) function on a Range from 5.0 to 10.0
	 * 				with delta = 0.0
	 * Expected Output: Range from 5.0 to 10.0
	 * Assumptions: N/A
	 */
	@Test
	public void shift_ZeroDelta_Test() {
		Range result = Range.shift(r, 0.0);
		Range expected = new Range(5.0, 10.0);
		assertEquals("Failed shift method with delta = zero on a Range from 5.0 to 10.0", expected, result);
	}

}
