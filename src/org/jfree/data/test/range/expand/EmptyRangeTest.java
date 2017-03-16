package org.jfree.data.test.range.expand;

import static org.junit.Assert.assertEquals;

import org.jfree.data.Range;
import org.junit.Before;
import org.junit.Test;

public class EmptyRangeTest {
	
	public Range r;

	@Before
	/**
	 * Creates an empty Range from 5.0 to 5.0
	 */
	public void setup(){
		r = new Range(5.0, 5.0);
	}
	
	/**
	 * Test Plan Coverage: expand test plan 5
	 * Test Strategy Coverage: empty Range
	 * Description: Tests the expand function on a Range from 5.0 to 5.0
	 * 				with lowerMargin = 0.5 and upperMargin = 0.5.
	 * Expected Output: Range from 5.0 to 5.0
	 * Assumptions: N/A
	 */
	@Test
	public void expand_EmptyRange_Test() {
		Range result = Range.expand(r, 0.5, 0.5);
		Range expected = new Range(5.0, 5.0);
		assertEquals("Failed expand method on empty Range from 5.0 to 5.0", expected, result);
	}
}
