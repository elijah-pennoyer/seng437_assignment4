package org.jfree.data.test.range.expand;

import static org.junit.Assert.assertEquals;

import org.jfree.data.Range;
import org.junit.Before;
import org.junit.Test;

public class ZeroLowerBoundTest {

	public Range r;

	@Before
	/**
	 * Creates a Range from 0.0 to 10.0
	 */
	public void setup(){
		r = new Range(0.0, 10.0);
	}
	
	/**
	 * Test Plan Coverage: expand test plan 4
	 * Test Strategy Coverage: Range with a zero lower bound
	 * Description: Tests the expand function on a Range from 0.0 to 10.0
	 * 				with lowerMargin = 0.5 and upperMargin = 0.5.
	 * Expected Output: Range from -5.0 to 15.0
	 * Assumptions: N/A
	 */
	@Test
	public void expand_ZeroLowerBound_Test() {
		Range result = Range.expand(r, 0.5, 0.5);
		Range expected = new Range(-5.0, 15.0);
		assertEquals("Failed expand method on a Range with a zero lower bound (0.0 to 10.0)", expected, result);
	}
}
