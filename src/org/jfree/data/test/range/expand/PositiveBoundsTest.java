package org.jfree.data.test.range.expand;

import static org.junit.Assert.*;

import org.jfree.data.Range;
import org.junit.Before;
import org.junit.Test;

public class PositiveBoundsTest {
	
	public Range r;

	@Before
	/**
	 * Creates a Range from 5.0 to 10.0
	 */
	public void setup(){
		r = new Range(5.0, 10.0);
	}
	
	/**
	 * Test Plan Coverage: expand test plan 1
	 * Test Strategy Coverage: Range with positive upper and lower bounds
	 * Description: Tests the expand function on a Range from 5.0 to 10.0
	 * 				with lowerMargin = 0.5 and upperMargin = 0.5.
	 * Expected Output: Range from 2.5 to 12.5
	 * Assumptions: N/A
	 */
	@Test
	public void expand_PositiveBounds_Test() {
		Range result = Range.expand(r, 0.5, 0.5);
		Range expected = new Range(2.5, 12.5);
		assertEquals("Failed expand method on a positive Range from 5.0 to 10.0", expected, result);
	}
}
