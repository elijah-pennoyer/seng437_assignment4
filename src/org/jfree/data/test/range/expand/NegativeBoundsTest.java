package org.jfree.data.test.range.expand;

import static org.junit.Assert.*;

import org.jfree.data.Range;
import org.junit.Before;
import org.junit.Test;

public class NegativeBoundsTest {

	public Range r;

	@Before
	/**
	 * Creates a Range from -10.0 to -5.0
	 */
	public void setup(){
		r = new Range(-10.0, -5.0);
	}
	
	/**
	 * Test Plan Coverage: expand test plan 2
	 * Test Strategy Coverage: Range with negative upper and lower bounds
	 * Description: Tests the expand function on a Range from -10.0 to -5.0
	 * 				with lowerMargin = 0.5 and upperMargin = 0.5.
	 * Expected Output: Range from -12.5 to -2.5
	 * Assumptions: N/A
	 */
	@Test
	public void expand_NegativeBounds_Test() {
		Range result = Range.expand(r, 0.5, 0.5);
		Range expected = new Range(-12.5, -2.5);
		assertEquals("Failed expand method on a negative Range from -10.0 to -5.0", expected, result);
	}
}
