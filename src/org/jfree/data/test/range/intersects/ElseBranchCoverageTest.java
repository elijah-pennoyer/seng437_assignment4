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
public class ElseBranchCoverageTest {

	private Range r;
	double lower;
	double upper;
	boolean expected;
	
	/**
	 *	Creates an Range from -5.0 to 5.0.
	 */
	@Before
	public void setup() { r = new Range(-5.0, 5.0); }
	
	public ElseBranchCoverageTest(double lower, double upper, boolean expected){
		this.lower = lower;
		this.upper = upper;
		this.expected = expected;
	}
	
	@Parameters
	public static Collection<Object []> data()
	{
		return Arrays.asList(new Object[][]
		{
			{0, 4, true},
			{3, 1, false},
			{7, 10, false},
			{10, 9, false}
		});
	}

	/**
	 * Test Plan Coverage: intersect test which covers the "else" branch
	 * Test Strategy Coverage: Given range has lower>this.lower
	 * Description: Tests the intersect function when presented with a range such that the "lower>this.lower" condition is true.
	 * This causes the "else" branch to be taken.
	 * Expected Output: False
	 * Assumptions: N/A
	 */
	@Test
	public void intersects_ElseBranch_Test() {
		assertTrue("Testing \"else\" branch of intersects. Expect " + expected, r.intersects(lower, upper) == expected );
	}

}
