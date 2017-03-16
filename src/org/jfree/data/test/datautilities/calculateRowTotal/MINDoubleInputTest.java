package org.jfree.data.test.datautilities.calculateRowTotal;

import java.security.InvalidParameterException;

import org.jfree.data.DataUtilities;
import org.jfree.data.Values2D;
import org.jmock.Expectations;
import org.jmock.Mockery;
import org.junit.Test;

public class MINDoubleInputTest {

	/**
	 * Test Plan Coverage: calculateRowTotal test plan 5
	 * Test Strategy Coverage: MIN_Double Data equivalence class
	 * Description: Tests the calculateRowTotal function when presented with a Values2D containing MIN_Double
	 * Expected Output: InvalidParameterException thrown (input data invalid)
	 * Assumptions: The function should recognize the risk for underflow when presented with MIN_Double as an input.
	 * 				The function should throw an exception as this case should be an invalid input.
	 */
	@Test (expected = InvalidParameterException.class)
	public void calculateRowTotal_minDoubleInput_Test() {
		
		//mocked Values2D array containing a single row and 2 columns. All values in the array are MIN_Double
		Mockery mockingContext = new Mockery();
		final Values2D input = mockingContext.mock(Values2D.class);
		mockingContext.checking(new Expectations() {
			{
			allowing (input).getValue(0,0);
			will (returnValue(Double.MIN_VALUE));
			
			allowing (input).getValue(0,1);
			will (returnValue(Double.MIN_VALUE));
			
			allowing (input).getColumnCount();
			will (returnValue(2));
			
			allowing (input).getRowCount();
			will (returnValue(1));
			}
		});
		
		DataUtilities.calculateRowTotal(input, 0);
	}

}
