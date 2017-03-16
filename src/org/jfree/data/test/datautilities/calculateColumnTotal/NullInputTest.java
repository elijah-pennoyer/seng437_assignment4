package org.jfree.data.test.datautilities.calculateColumnTotal;

import java.security.InvalidParameterException;

import org.jfree.data.DataUtilities;
import org.junit.Test;

public class NullInputTest {
	
	/**
	 * Test Plan Coverage: calculateColumnTotal test plan 2
	 * Test Strategy Coverage: Null Data equivalence class
	 * Description: Tests the calculateColumnTotal function when presented with a null Values2D array as input
	 * Expected Output: InvalidParameterException
	 * Assumptions: The null array is treated as an invalid input and therefore the function should throw an exception
	 */
	@Test (expected = InvalidParameterException.class)
	public void calculateColumnTotal_NullInput_Test() {
		DataUtilities.calculateColumnTotal(null, 0);
	}

}
