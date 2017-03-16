package org.jfree.data.test.datautilities.calculateColumnTotal;

import java.security.InvalidParameterException;

import org.jfree.data.DataUtilities;
import org.jfree.data.Values2D;
import org.jmock.Expectations;
import org.jmock.Mockery;
import org.junit.Test;

public class MAXDoubleInputTest {

	/**
	 * Test Plan Coverage: calculateColumnTotal test plan 5
	 * Test Strategy Coverage: MAX_Double Data equivalence class
	 * Description: Tests the calculateColumnTotal function when presented with a Values2D containing MAX_Double
	 * Expected Output: InvalidParameterException thrown (input data invalid)
	 * Assumptions: The function should recognize the risk for overflow when presented with MAX_Double as an input.
	 * 				The function should throw an exception as this case should be an invalid input.
	 */
	@Test (expected = InvalidParameterException.class)
	public void calculateColumnTotal_maxDoubleInput_Test() {
		
		//mocked Values2D array containing a single column and 2 rows. All values in the array are MAX_Double
		Mockery mockingContext = new Mockery();
		final Values2D input = mockingContext.mock(Values2D.class);
		mockingContext.checking(new Expectations() {
			{
			allowing (input).getValue(0,0);
			will (returnValue(Double.MAX_VALUE));
			
			allowing (input).getValue(1,0);
			will (returnValue(Double.MAX_VALUE));
			
			allowing (input).getColumnCount();
			will (returnValue(1));
			
			allowing (input).getRowCount();
			will (returnValue(2));
			}
		});
		
		DataUtilities.calculateColumnTotal(input, 0);
	}

}
