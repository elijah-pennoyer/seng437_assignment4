package org.jfree.data.test.datautilities.getCumulativePercentages;

import java.security.InvalidParameterException;

import org.jfree.data.DataUtilities;
import org.jfree.data.KeyedValues;
import org.junit.Test;


public class NullInputTest {
	
	/**
	 * Test Plan Coverage: getCumulativePercentages test plan 1
	 * Test Strategy Coverage: Data is null
	 * Description: Tests the result of entering a null KeyedValues
	 * Expected Output: InvalidParameterException
	 * Assumptions: N/A
	 */
	@Test (expected = InvalidParameterException.class)
	public void getCumulativePercentages_NullInput_Test() {
		
		KeyedValues input = null;
		
		DataUtilities.getCumulativePercentages(input);
	}

}
