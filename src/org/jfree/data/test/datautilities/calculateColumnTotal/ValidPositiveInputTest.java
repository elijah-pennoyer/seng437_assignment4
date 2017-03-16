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
public class ValidPositiveInputTest {
	
	//values for column being summed and expected sum result
	public int col;
	public double expected;
	
	public ValidPositiveInputTest(int col, double expected) {
		this.col = col;
		this.expected = expected;
	}
	
	//parameters to test column indexes 0, 1 & 2
	@Parameters
	public static Collection<Object[]> data(){
		return Arrays.asList(new Object[][] {
			{0, 15},
			{1, 9},
			{2, 27}
		});
	}

	/**
	 * Test Plan Coverage: calculateColumnTotal test plan 1-a
	 * Test Strategy Coverage: Sum of Data column values is positive equivalence class and valid Column range equivalence class
	 * This test also covers the within bounds portion of the robustness tests for this function (indexes 0, 1, N/2, N-2 and N-1)
	 * Description: Tests the calculateColumnTotal function when presented with positive inputs
	 * Expected Output: 15.0 for column 0, 9.0 for column 1 and 27.0 for column 2
	 * Assumptions: N/A
	 */
	@Test
	public void calculateColumnTotal_PositiveInput_Test() {
		//mocked Values2D 3x3 array containing positive integers
		Mockery mockingContext = new Mockery();
		final Values2D input = mockingContext.mock(Values2D.class);
		mockingContext.checking(new Expectations() {
			{
			allowing (input).getValue(0,0);
			will (returnValue(1));
			
			allowing (input).getValue(0,1);
			will (returnValue(3));
			
			allowing (input).getValue(0,2);
			will (returnValue(6));
			
			allowing (input).getValue(1,0);
			will (returnValue(11));
			
			allowing (input).getValue(1,1);
			will (returnValue(2));
			
			allowing (input).getValue(1,2);
			will (returnValue(2));
			
			allowing (input).getValue(2,0);
			will (returnValue(3));
			
			allowing (input).getValue(2,1);
			will (returnValue(4));
			
			allowing (input).getValue(2,2);
			will (returnValue(19));
			
			allowing (input).getColumnCount();
			will (returnValue(3));
			
			allowing (input).getRowCount();
			will (returnValue(3));
			}
		});
		
		double result = DataUtilities.calculateColumnTotal(input, col);
		assertTrue("Testing valid positive input. Expected " + expected + " but got " + result, expected == result);
	}

}
