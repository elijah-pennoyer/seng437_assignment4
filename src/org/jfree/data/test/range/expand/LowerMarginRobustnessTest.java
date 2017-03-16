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
public class LowerMarginRobustnessTest {

	public Range r;
	
	public double lowerMargin;
	public Range expected;

	@Before
	/**
	 * Creates a Range from 10.0 to 20.0
	 */
	public void setup(){
		r = new Range(10.0, 20.0);
	}
	
	public LowerMarginRobustnessTest(double lowerMargin, Range expected) {
		this.lowerMargin = lowerMargin;
		this.expected = expected;
	}
	
	@Parameters
	public static Collection<Object[]> data(){
		return Arrays.asList(new Object[][] {
			{-1.1, new Range(21.0, 25.0)},
			{-1.0, new Range(20.0, 25.0)},
			{-0.9, new Range(19.0, 25.0)},
			{-0.5, new Range(15.0, 25.0)},
			{-0.1, new Range(11.0, 25.0)},
			{0.0, new Range(10.0, 25.0)},
			{0.1, new Range(9.0, 25.0)},
			{0.5, new Range(5.0, 25.0)},
			{0.9, new Range(1.0, 25.0)},
			{1.0, new Range(0.0, 25.0)},
			{1.1, new Range(-1.0, 25.0)}
		});
	}

	/**
	 * Test Plan Coverage: expand test plan 7
	 * Test Strategy Coverage: robustness test for lowerMargin
	 * Description: Tests the lowerMargin parameter at and around boundaries -1, 0, and 1
	 * 				on a Range from 10.0 to 20.0 with upperMargin = 0.5.
	 * Expected Output: 
	 * 				lowerMargin = -1.1: Range from 21.0 to 25.0
	 * 				lowerMargin = -1.0: Range from 20.0 to 25.0
	 * 				lowerMargin = -0.9: Range from 19.0 to 25.0
	 *  			lowerMargin = -0.5: Range from 15.0 to 25.0
	 *   			lowerMargin = -0.1: Range from 11.0 to 25.0
	 *    			lowerMargin = 0.0: Range from 10.0 to 25.0
	 *     			lowerMargin = 0.1: Range from 9.0 to 25.0
	 *      		lowerMargin = 0.5: Range from 5.0 to 25.0
	 *       		lowerMargin = 0.9: Range from 1.0 to 25.0
	 *        		lowerMargin = 1.0: Range from 0.0 to 25.0
	 *         		lowerMargin = 1.1: Range from -1.0 to 25.0
	 * Assumptions: Applying a negative lowerMargin to a Range should move the lower bound up.
	 */
	@Test
	public void expand_LowerMarginRobustness_Test() {
		Range result = Range.expand(r, lowerMargin, 0.5);
		assertEquals("Failed expand method with lowerMargin parameter at " + lowerMargin + " with a Range from 10.0 to 20.0", expected, result);
	}
}
