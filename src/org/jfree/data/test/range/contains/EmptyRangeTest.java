package org.jfree.data.test.range.contains;

import static org.junit.Assert.*;

import org.jfree.data.Range;
import org.junit.Before;
import org.junit.Test;

public class EmptyRangeTest {
	
	public Range r;

	/**
	 *	Creates an empty Range object.
	 */

	@Before
	public void setup(){
		r = new Range(1.5,1.5);
	}

	/**
	 * 	Test Plan Coverage: contains test plan 1-a
	 * 	Test Strategy Coverage: empty Range contains value
	 * 	Description:
	 *
	 * 		Tests the contains function on a Range from 1.5 to 1.5
	 * 		with value = 1.5
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
	public void contains_EmptyRange_True_Test() {
		boolean b = r.contains(1.5);
		assertTrue("The empty range should contain 1.5", b);
	}


	/**
	 * 	Test Plan Coverage: contains test plan 1-b
	 * 	Test Strategy Coverage: empty Range does not contain value
	 * 	Description:
	 *
	 * 		Tests the contains function on a Range from 1.5 to 1.5
	 * 		with value 1.6
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
	public void contains_EmptyRange_False_Test() {
		boolean b = r.contains(1.6);
		assertFalse("The empty range should not contain 1.6", b);
	}

}
