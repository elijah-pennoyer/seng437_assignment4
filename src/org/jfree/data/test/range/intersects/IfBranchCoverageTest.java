package org.jfree.data.test.range.intersects;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.jfree.data.Range;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith (Parameterized.class)
public class IfBranchCoverageTest {
	
	private Range r;
	double lower;
	double upper;
	boolean expected;
	
	/**
	 *	Creates an Range from -5.0 to 5.0.
	 */
	@Before
	public void setup() { r = new Range(-5.0, 5.0); }
	
	public IfBranchCoverageTest(double lower, double upper, boolean expected){
		this.lower = lower;
		this.upper = upper;
		this.expected = expected;
	}

	@Parameters
	public static Collection<Object []> data()
	{
		return Arrays.asList(new Object[][]
		{
			{-6, 4, true},
			{-6, -5.5, false}
		});
	}
	
	/**
	 * Test Plan Coverage: intersect test which covers the "if" branch
	 * Test Strategy Coverage: Given range has lower<=this.lower
	 * Description: Tests the intersect function when presented with a range such that the "lower<=this.lower" condition is true.
	 * This causes the "if" branch to be taken.
	 * Expected Output: True
	 * Assumptions: N/A
	 */
	@Test
	public void intersects_IfBranch_Test() {
		assertTrue("Testing \"if\" branch of intersects. Expect true.", r.intersects(lower, upper)==expected );
	}

}
