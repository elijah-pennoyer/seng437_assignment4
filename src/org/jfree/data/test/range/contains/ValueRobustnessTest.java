package org.jfree.data.test.range.contains;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.jfree.data.Range;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class ValueRobustnessTest {

	public Range r;
	
	public double value;
	public boolean expected;

	@Before
	/**
	 * Creates a Range from 5 to 10
	 */
	public void setup(){
		r = new Range(5, 10);
	}
	
	public ValueRobustnessTest(double value, boolean expected) {
		this.value = value;
		this.expected = expected;
	}
	
	@Parameters
	public static Collection<Object[]> data(){
		return Arrays.asList(new Object[][] {
			{4.9, false},
			{5.0, true},
			{5.1, true},
			{7.5, true},
			{9.9, true},
			{10.0, true},
			{10.1, false}
		});
	}

	/**
	 * Test Plan Coverage: contains test plan 3
	 * Test Strategy Coverage: robustness test for value
	 * Description: Tests the value parameter at and around Range boundaries.
	 * Expected Output: false for the two values outside the Range, true otherwise
	 * Assumptions: The upper and lower fields in a Range object are contained in that Range
	 */
	@Test
	public void contains_ValueRobustness_Test() {
		boolean b = r.contains(value);
		assertEquals("Failed contains method with value of " + value + " on a Range from 5.0 to 10.0", expected, b);
	}
}
