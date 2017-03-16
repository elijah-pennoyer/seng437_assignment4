package org.jfree.data.test.datautilities.createNumberArray;

import static org.junit.Assert.*;

import org.jfree.data.DataUtilities;
import org.junit.Test;

public class ValidEmptyInputTest {

	/**
	 * Test Plan Coverage: createNumberArray test plan 3
	 * Test Strategy Coverage: Valid empty equivalence class
	 * Description: Input an array with a length of 0
	 * Expected Output: A Number array of length 0
	 * Assumptions: N/A
	 */
	@Test
	public void createNumberArray_ValidEmptyInput_Test() {
		
		double[] data = new double[0];
		Number[] output = DataUtilities.createNumberArray(data);
		Number[] expected = new Number[0];
		
		assertArrayEquals("createNumberArray with an empty input failed", expected, output);
	}

}
