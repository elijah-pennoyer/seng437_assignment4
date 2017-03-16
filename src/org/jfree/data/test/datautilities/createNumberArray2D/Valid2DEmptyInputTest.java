package org.jfree.data.test.datautilities.createNumberArray2D;

import static org.junit.Assert.*;

import org.jfree.data.DataUtilities;
import org.junit.Test;

public class Valid2DEmptyInputTest {

	/**
	 * Test Plan Coverage: createNumberArray2D test plan 3
	 * Test Strategy Coverage: Valid empty equivalence class
	 * Description: Input a 2D array with length of 0
	 * Expected Output: A 2D Number array with length of 0
	 * Assumptions: N/A
	 */
	@Test
	public void createNumberArray2D_ValidEmptyInput_Test() {
		
		double[][] data = new double[0][0];
		Number[][] output = DataUtilities.createNumberArray2D(data);
		Number[][] expected = new Number[0][0];
		
		assertArrayEquals("createNumberArray2D with an empty input failed", expected, output);
	}

}
