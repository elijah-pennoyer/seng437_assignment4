package org.jfree.data.test.datautilities.createNumberArray2D;

import static org.junit.Assert.*;

import org.jfree.data.DataUtilities;
import org.junit.Test;

public class Valid2DPositiveInputTest extends Null2DInputTest {

	/**
	 * Test Plan Coverage: createNumberArray2D test plan 2-a
	 * Test Strategy Coverage: Valid non-empty equivalence class
	 * Description: Input a 3x3 2D array, elements { {1.5, 1.5, 1.5}, {1.5, 1.5, 1.5}, {1.5, 1.5, 1.5} }
	 * Expected Output: A 2D Number array of { {1.5, 1.5, 1.5}, {1.5, 1.5, 1.5}, {1.5, 1.5, 1.5} }
	 * Assumptions: N/A
	 */
	@Test
	public void createNumberArray2D_ValidPositiveInput_Test() {
		
		double[][] data = { {1.5, 1.5, 1.5}, {1.5, 1.5, 1.5}, {1.5, 1.5, 1.5} };
		Number[][] output = DataUtilities.createNumberArray2D(data);
		Number[][] expected = { {1.5, 1.5, 1.5}, {1.5, 1.5, 1.5}, {1.5, 1.5, 1.5} };
		
		assertArrayEquals("createNumberArray2D with an all positive input failed",expected, output);
	}
	
}
