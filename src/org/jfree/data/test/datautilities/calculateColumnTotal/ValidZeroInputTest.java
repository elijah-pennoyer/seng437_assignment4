package org.jfree.data.test.datautilities.calculateColumnTotal;

import static org.junit.Assert.*;

import org.jfree.data.DataUtilities;
import org.jfree.data.Values2D;
import org.jmock.Expectations;
import org.jmock.Mockery;
import org.junit.Test;

public class ValidZeroInputTest {

	/**
	 * Test Plan Coverage: calculateColumnTotal test plan 1-c
	 * Test Strategy Coverage: Sum of Data column values is zero equivalence class and valid Column range equivalence class
	 * Description: Tests the calculateColumnTotal function when presented with zero inputs 
	 * Expected Output: 0.0 for column 0
	 * Assumptions: N/A
	 */
	@Test
	public void calculateColumnTotal_ZeroInput_Test() {
		//mocked Values2D 3x3 array containing one column and 3 rows all filled with zero
		Mockery mockingContext = new Mockery();
		final Values2D input = mockingContext.mock(Values2D.class);
		mockingContext.checking(new Expectations() {
			{
			allowing (input).getValue(0,0);
			will (returnValue(0));
			
			
			allowing (input).getValue(1,0);
			will (returnValue(0));
			
			
			allowing (input).getValue(2,0);
			will (returnValue(0));
			
			
			allowing (input).getColumnCount();
			will (returnValue(1));
			
			allowing (input).getRowCount();
			will (returnValue(3));
			}
		});
		
		double result = DataUtilities.calculateColumnTotal(input, 0);
		assertTrue("Testing valid zero input. Expected 0.0 but got " + result, 0.0 == result);
	}

}
