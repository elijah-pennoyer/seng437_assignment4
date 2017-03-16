package org.jfree.data.test.datautilities.calculateRowTotal;

import static org.junit.Assert.*;

import org.jfree.data.DataUtilities;
import org.jfree.data.Values2D;
import org.jmock.Expectations;
import org.jmock.Mockery;
import org.junit.Test;

public class NullArrayContentsTest {

	/**
	 * Test Plan Coverage: calculateRowTotal test for an array containing null values
	 * Test Strategy Coverage: Given array contains null values
	 * Description: Tests the calculateRowTotal function when presented with an array containing null values
	 * Expected Output: 0.0
	 * Assumptions: Null values in the input array do not increment or decrement the row total
	 */
	@Test
	public void calculateRowTotal_arrayContainingNull_Test() {
		
		//mocked Values2D array containing a single column and row. All values in the array are 2
		Mockery mockingContext = new Mockery();
		final Values2D input = mockingContext.mock(Values2D.class);
		mockingContext.checking(new Expectations() {
			{
			allowing (input).getValue(0,0);
			will (returnValue(null));
			
			allowing (input).getColumnCount();
			will (returnValue(1));
			
			allowing (input).getRowCount();
			will (returnValue(1));
			}
		});
				
		double result = DataUtilities.calculateRowTotal(input, 0);
		assertTrue("Testing array containing null. Expected 0 but got " + result, result == 0);
	}

}
