package org.jfree.data.test.range.contains;

import static org.junit.Assert.*;

import org.jfree.data.Range;
import org.junit.Before;
import org.junit.Test;

public class NonEmptyRangeTest {
	public Range r;

	/**
	 *	Creates a Range from 1.5 to 2.5
	 */

	@Before
	public void setup(){
		r = new Range(1.5, 2.5);
	}

	/**
	 * 	Test Plan Coverage: contains test plan 2-a
	 * 	Test Strategy Coverage: non-empty Range, value below lower bound
	 * 	Description:
	 *
	 * 		Tests the contains function on a Range from 1.5 to 2.5
	 * 		with value = 1.0
	 *
	 * 	Expected Output:
	 *
	 * 		true
	 *
	 * 	Assumptions:
	 *
	 * 		An empty Range object is assumed to be a Range with equal
	 * 		upper and lower bounds.
	 *
	 * 		The upper and lower fields in a Range object are contained in that Range.
	 */

	@Test
	public void contains_NonEmptyRange_BelowLowerBound_Test() {
		boolean b = r.contains(1.0);
		assertFalse("The non-empty range should not contain 1.0", b);
	}


	/**
	 * 	Test Plan Coverage: contains test plan 2-b
	 * 	Test Strategy Coverage: non-empty Range contains value
	 * 	Description:
	 *
	 * 		Tests the contains function on a Range from 1.5 to 2.5
	 * 		with value = 1.0
	 *
	 * 	Expected Output:
	 *
	 * 		true
	 *
	 * 	Assumptions:
	 *
	 * 		An empty Range object is assumed to be a Range with equal
	 * 		upper and lower bounds.
	 *
	 * 		The upper and lower fields in a Range object are contained in that Range.
	 */

	@Test
	public void contains_NonEmptyRange_True_Test() {
		boolean b = r.contains(2.0);
		assertTrue("The non-empty range should contain 2.0", b);
	}

	/**
	 * 	Test Plan Coverage: contains test plan 2-c
	 * 	Test Strategy Coverage: non-empty Range, value above upper bound
	 * 	Description:
	 *
	 * 		Tests the contains function on a Range from 1.5 to 2.5
	 * 		with value = 3.0
	 *
	 * 	Expected Output:
	 *
	 * 		false
	 *
	 * 	Assumptions:
	 *
	 * 		An empty Range object is assumed to be a Range with equal
	 * 		upper and lower bounds.
	 *
	 * 		The upper and lower fields in a Range object are contained in that Range.
	 */

	@Test
	public void contains_NonEmptyRange_AboveUpperBound() {
		boolean b = r.contains(3.0);
		assertFalse("The non-empty range should not contain 3.0", b);
	}
}
