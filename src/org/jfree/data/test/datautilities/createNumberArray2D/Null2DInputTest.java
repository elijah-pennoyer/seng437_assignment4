package org.jfree.data.test.datautilities.createNumberArray2D;

import java.security.InvalidParameterException;

import org.jfree.data.DataUtilities;
import org.junit.Test;

public class Null2DInputTest {

	/**
	 * Test Plan Coverage: createNumberArray2D test plan 1
	 * Test Strategy Coverage: Null equivalence class
	 * Description: Tests the result of entering a null array pointer
	 * Expected Output: InvalidParameterException
	 * Assumptions: N/A
	 */
	@Test (expected = InvalidParameterException.class)
	public void createNumberArray2D_NullInput_Test() {
		
		double[][] data = null;
		
		//This should throw an IllegalArgumentException
		DataUtilities.createNumberArray2D(data);
		
	}
	
}
