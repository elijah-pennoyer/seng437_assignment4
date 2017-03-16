package org.jfree.data.test.datautilities.calculateRowTotal;

import static org.junit.Assert.*;

import org.jfree.data.DataUtilities;
import org.jfree.data.Values2D;
import org.jmock.Expectations;
import org.jmock.Mockery;
import org.junit.Test;

public class ValidZeroInputTest {

	/**
	 * Test Plan Coverage: calculateRowTotal test plan 1-c
	 * Test Strategy Coverage: Sum of Data row values is zero equivalence class and valid Row range equivalence class
	 * Description: Tests the calculateRowTotal function when presented with zero inputs 
	 * Expected Output: 0.0 for row 0
	 * Assumptions: N/A
	 */
	@Test
	public void calculateRowTotal_ZeroInput_Test() {
		//mocked Values2D array containing one row and 3 columns all filled with zero
		Mockery mockingContext = new Mockery();
		final Values2D input = mockingContext.mock(Values2D.class);
		mockingContext.checking(new Expectations() {
			{
			allowing (input).getValue(0,0);
			will (returnValue(0));
			
			
			allowing (input).getValue(0,1);
			will (returnValue(0));
			
			
			allowing (input).getValue(0,2);
			will (returnValue(0));
			
			
			allowing (input).getColumnCount();
			will (returnValue(3));
			
			allowing (input).getRowCount();
			will (returnValue(1));
			}
		});
		
		double result = DataUtilities.calculateRowTotal(input, 0);
		assertTrue("Testing valid zero inputs. Expected 0.0 but got " + result, 0.0 == result);
	}

}
