package org.jfree.data.test.range.expand;

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
	 * Test Plan Coverage: expand test plan 6
	 * Test Strategy Coverage: null range
	 * Description: Tests the expand function on a null range
	 * 				with lowerMargin = 0.5, upperMargin = 0.5
	 * Expected Output: InvalidParameterException
	 * Assumptions: N/A
	 */
	@Test (expected = InvalidParameterException.class)
	public void expand_NullRange_Test() {
		Range.expand(r, 0.5, 0.5);
	}
}
