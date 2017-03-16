package org.jfree.data.test.datautilities.calculateRowTotal;

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
public class ValidNegativeInputTest {

	//values for row being summed and expected sum result
	public int row;
	public double expected;
	
	public ValidNegativeInputTest(int row, double expected) {
		this.row = row;
		this.expected = expected;
	}
	
	//parameters to test row indexes 0, 1 & 2
	@Parameters
	public static Collection<Object[]> data(){
		return Arrays.asList(new Object[][] {
			{0, -15},
			{1, -9},
			{2, -27}
		});
	}

	/**
	 * Test Plan Coverage: calculateRowTotal test plan 1-b
	 * Test Strategy Coverage: Sum of Data row values is negative equivalence class and valid Row range equivalence class
	 * Description: Tests the calculateRowTotal function when presented with negative inputs
	 * Expected Output: -15.0 for row 0, -9.0 for row 1 and -27.0 for row 2
	 * Assumptions: N/A
	 */
	@Test
	public void calculateRowTotal_NegativeInput_Test() {
		//mocked Values2D 3x3 array containing negative integers
		Mockery mockingContext = new Mockery();
		final Values2D input = mockingContext.mock(Values2D.class);
		mockingContext.checking(new Expectations() {
			{
			allowing (input).getValue(0,0);
			will (returnValue(-1));
			
			allowing (input).getValue(0,1);
			will (returnValue(-11));
			
			allowing (input).getValue(0,2);
			will (returnValue(-3));
			
			allowing (input).getValue(1,0);
			will (returnValue(-3));
			
			allowing (input).getValue(1,1);
			will (returnValue(-2));
			
			allowing (input).getValue(1,2);
			will (returnValue(-4));
			
			allowing (input).getValue(2,0);
			will (returnValue(-6));
			
			allowing (input).getValue(2,1);
			will (returnValue(-2));
			
			allowing (input).getValue(2,2);
			will (returnValue(-19));
			
			allowing (input).getColumnCount();
			will (returnValue(3));
			
			allowing (input).getRowCount();
			will (returnValue(3));
			}
		});
		
		double result = DataUtilities.calculateRowTotal(input, row);
		assertTrue("Testing valid negative input. Expected " + expected + " but got " + result, expected == result);
	}

}
