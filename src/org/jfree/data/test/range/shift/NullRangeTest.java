package org.jfree.data.test.range.shift;

import java.security.InvalidParameterException;

import org.jfree.data.Range;
import org.junit.Before;
import org.junit.Test;

public class NullRangeTest {
	public Range r;

	@Before
	/**
	 * Creates a null range
	 */
	public void setup(){
		r = null;
	}
	
	/**
	 * Test Plan Coverage: shift test plan 9
	 * Test Strategy Coverage: null range
	 * Description: Tests the shift(Range, double) function on a null range
	 * 				with delta = 1.0
	 * Expected Output: InvalidParameterException
	 * Assumptions: N/A
	 */
	@Test (expected = InvalidParameterException.class)
	public void shift_NullRange_Test() {
		Range.shift(r, 1.0);
	}
}
