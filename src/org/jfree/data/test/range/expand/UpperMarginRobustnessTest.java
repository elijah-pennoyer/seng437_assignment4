package org.jfree.data.test.range.expand;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.jfree.data.Range;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class UpperMarginRobustnessTest {

	public Range r;
	
	public double upperMargin;
	public Range expected;

	@Before
	/**
	 * Creates a Range from 10.0 to 20.0
	 */
	public void setup(){
		r = new Range(10.0, 20.0);
	}
	
	public UpperMarginRobustnessTest(double upperMargin, Range expected) {
		this.upperMargin = upperMargin;
		this.expected = expected;
	}
	
	@Parameters
	public static Collection<Object[]> data(){
		return Arrays.asList(new Object[][] {
			{-1.1, new Range(5.0, 9.0)},
			{-1.0, new Range(5.0, 10.0)},
			{-0.9, new Range(5.0, 11.0)},
			{-0.5, new Range(5.0, 15.0)},
			{-0.1, new Range(5.0, 19.0)},
			{0.0, new Range(5.0, 20.0)},
			{0.1, new Range(5.0, 21.0)},
			{0.5, new Range(5.0, 25.0)},
			{0.9, new Range(5.0, 29.0)},
			{1.0, new Range(5.0, 30.0)},
			{1.1, new Range(5.0, 31.0)}
		});
	}

	/**
	 * Test Plan Coverage: expand test plan 8
	 * Test Strategy Coverage: robustness test for upperMargin
	 * Description: Tests the upperMargin parameter at and around boundaries -1, 0, and 1
	 * 				on a Range from 10.0 to 20.0 with lowerMargin = 0.5.
	 * Expected Output: 
	 * 				upperMargin = -1.1: Range from 5.0 to 9.0
	 * 				upperMargin = -1.0: Range from 5.0 to 10.0
	 * 				upperMargin = -0.9: Range from 5.0 to 11.0
	 *  			upperMargin = -0.5: Range from 5.0 to 15.0
	 *   			upperMargin = -0.1: Range from 5.0 to 19.0
	 *    			upperMargin = 0.0: Range from 5.0 to 20.0
	 *     			upperMargin = 0.1: Range from 5.0 to 21.0
	 *      		upperMargin = 0.5: Range from 5.0 to 25.0
	 *       		upperMargin = 0.9: Range from 5.0 to 29.0
	 *        		upperMargin = 1.0: Range from 5.0 to 30.0
	 *         		upperMargin = 1.1: Range from 5.0 to 31.0
	 * Assumptions: Applying a negative upperMargin to a Range should move the upper bound down.
	 */
	@Test
	public void expand_UpperMarginRobustness_Test() {
		Range result = Range.expand(r, 0.5, upperMargin);
		assertEquals("Failed expand method with upperMargin parameter at " + upperMargin + " with a Range from 10.0 to 20.0",expected, result);
	}
}
