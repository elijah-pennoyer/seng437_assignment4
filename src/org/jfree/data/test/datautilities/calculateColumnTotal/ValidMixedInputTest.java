package org.jfree.data.test.datautilities.calculateColumnTotal;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.jfree.data.DataUtilities;
import org.jfree.data.Values2D;
import org.jmock.Expectations;
import org.jmock.Mockery;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class ValidMixedInputTest {

	//values for column being summed and expected sum result
	public int col;
	public double expected;
	
	public ValidMixedInputTest(int col, double expected) {
		this.col = col;
		this.expected = expected;
	}
	
	//parameters to test column indexes 0, 1 & 2
	@Parameters
	public static Collection<Object[]> data(){
		return Arrays.asList(new Object[][] {
			{0, 0},
			{1, -4},
			{2, 7}
		});
	}

	/**
	 * Test Plan Coverage: calculateColumnTotal test plan 1-d
	 * Test Strategy Coverage: Sum of Data column values is positive, negative and zero equivalence classes and valid Column range equivalence class
	 * Description: Tests the calculateColumnTotal function when presented with mixed inputs
	 * Expected Output: 0.0 for column 0, -4.0 for column 1 and 7.0 for column 2
	 * Assumptions: N/A
	 */
	@Test
	public void calculateColumnTotal_MixedInput_Test() {
		//mocked Values2D 3x3 array containing mixed integers
		Mockery mockingContext = new Mockery();
		final Values2D input = mockingContext.mock(Values2D.class);
		mockingContext.checking(new Expectations() {
			{
			allowing (input).getValue(0,0);
			will (returnValue(-9));
			
			allowing (input).getValue(0,1);
			will (returnValue(2));
			
			allowing (input).getValue(0,2);
			will (returnValue(0));
			
			allowing (input).getValue(1,0);
			will (returnValue(9));
			
			allowing (input).getValue(1,1);
			will (returnValue(0));
			
			allowing (input).getValue(1,2);
			will (returnValue(-9));
			
			allowing (input).getValue(2,0);
			will (returnValue(0));
			
			allowing (input).getValue(2,1);
			will (returnValue(-6));
			
			allowing (input).getValue(2,2);
			will (returnValue(16));
			
			allowing (input).getColumnCount();
			will (returnValue(3));
			
			allowing (input).getRowCount();
			will (returnValue(3));
			}
		});
		
		double result = DataUtilities.calculateColumnTotal(input, col);
		assertTrue("Testing valid mixed input. Expected " + expected + " but got " + result, expected == result);
	}

}
