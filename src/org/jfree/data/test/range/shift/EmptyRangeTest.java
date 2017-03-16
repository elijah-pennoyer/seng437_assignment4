package org.jfree.data.test.range.shift;

import static org.junit.Assert.*;

import org.jfree.data.Range;
import org.junit.Before;
import org.junit.Test;

public class EmptyRangeTest {

	public Range r;

	@Before
	/**
	 * Creates a range from 5.0 to 5.0
	 */
	public void setup(){
		r = new Range(5.0, 5.0);
	}
	
	/**
	 * Test Plan Coverage: shift test plan 8
	 * Test Strategy Coverage: empty range
	 * Description: Tests the shift(Range, double) function on a Range from 5.0 to 5.0
	 * 				with delta = 1.0
	 * Expected Output: Range from 6.0 to 6.0
	 * Assumptions: N/A
	 */
	@Test
	public void shift_EmptyRange_Test() {
		Range result = Range.shift(r, 1.0);
		Range expected = new Range(6.0, 6.0);
		assertEquals("Failed shift method on an empty Range from 5.0 to 5.0", expected, result);
	}

}
