package org.jfree.data.test.range.expand;

import static org.junit.Assert.assertEquals;

import org.jfree.data.Range;
import org.junit.Before;
import org.junit.Test;

public class ZeroUpperBoundTest {
	
	public Range r;

	@Before
	/**
	 * Creates a Range from -10.0 to 0.0
	 */
	public void setup(){
		r = new Range(-10.0, 0.0);
	}
	
	/**
	 * Test Plan Coverage: expand test plan 3
	 * Test Strategy Coverage: Range with a zero upper bound
	 * Description: Tests the expand function on a Range from -10.0 to 0.0
	 * 				with lowerMargin = 0.5 and upperMargin = 0.5.
	 * Expected Output: Range from -15.0 to 5.0
	 * Assumptions: N/A
	 */
	@Test
	public void expand_ZeroUpperBound_Test() {
		Range result = Range.expand(r, 0.5, 0.5);
		Range expected = new Range(-15.0, 5.0);
		assertEquals("Failed expand method on a Range with a zero upper bound (-10.0 to 0.0)", expected, result);
	}
}
