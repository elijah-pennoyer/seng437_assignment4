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
public class RobustInputTest {
	
	//values for column being summed and expected sum result
	public int col;
	public double expected;
	
	public RobustInputTest(int col, double expected) {
		this.col = col;
		this.expected = expected;
	}
	
	//parameters to test column indexes -1 & 3
	@Parameters
	public static Collection<Object[]> data(){
		return Arrays.asList(new Object[][] {
			{-1, 0},
			{3, 0}
		});
	}

	/**
	 * Test Plan Coverage: calculateColumnTotal test plan 4-a and 4-b
	 * Test Strategy Coverage: Column is below valid range and above valid range equivalence classes
	 * This test also covers the out of bounds portion of the robustness tests for this function (indexes -1 and N)
	 * Description: Tests the calculateColumnTotal function when presented with out of bounds Column indexes
	 * Expected Output: 0.0 (invalid column index)
	 * Assumptions: N/A
	 */
	@Test
	public void calculateColumnTotal_outOfRange_Test() {
		
		//mocked Values2D array containing a single column and row. All values in the array are 2
		Mockery mockingContext = new Mockery();
		final Values2D input = mockingContext.mock(Values2D.class);
		mockingContext.checking(new Expectations() {
			{
			allowing (input).getValue(0,0);
			will (returnValue(2));
			
			allowing (input).getColumnCount();
			will (returnValue(1));
			
			allowing (input).getRowCount();
			will (returnValue(1));
			}
		});
				
		double result = DataUtilities.calculateColumnTotal(input, col);
		assertTrue("Testing invalid column indexes. Expected 0 but got " + result, result == 0);
	}

}
