package org.jfree.data.test.datautilities.getCumulativePercentages;

import java.security.InvalidParameterException;
import java.util.ArrayList;

import org.jfree.data.DataUtilities;
import org.jfree.data.KeyedValues;
import org.jmock.Expectations;
import org.jmock.Mockery;
import org.junit.Test;

public class MININTInputTest {

	/**
	 * Test Plan Coverage: getCumulativePercentages test plan 9
	 * Test Strategy Coverage: Some values contain MIN_INT
	 * Description: Tests a valid data input with minimum integer values, 
	 * 		with a keyset of (0,1) and values of (MIN_INT, MIN_INT)
	 * Expected Output: InvalidParameterException
	 * Assumptions: The program should check for underflow and throw an exception
	 */
	@Test (expected = InvalidParameterException.class)
	public void getCumulativePercentages_ValidMIN_INTInput_Test() {
				
		Mockery mockingContext = new Mockery();
		final KeyedValues input = mockingContext.mock(KeyedValues.class);
		mockingContext.checking(new Expectations() {
			{
				//If getItemCount is called, it will return 2
				allowing (input).getItemCount();
				will(returnValue(2)); 
				
				//If getKeys is called, it will return an ArrayList containing Integer objects of 0 and 1
				allowing (input).getKeys();
				ArrayList<Integer> toReturn = new ArrayList<Integer>();
				toReturn.add(0);
				toReturn.add(1);
				will(returnValue(toReturn));
				
				//If getValue(0) is called, will return MIN_INT
				allowing (input).getValue(0);
				will(returnValue(Integer.MIN_VALUE));
				
				//If getValue(1) is called, will return MIN_INT
				allowing (input).getValue(1);
				will(returnValue(Integer.MIN_VALUE));
				
				//If getKey(0) is called, will return 0 - The index of the first object
				allowing (input).getKey(0);
				will(returnValue(0));
				//If getKey(1) is called, will return 1 - The index of the second object
				allowing (input).getKey(1);
				will(returnValue(1));
				
			}
		});
		
		//This should throw an exception to indicate underflow
		DataUtilities.getCumulativePercentages(input);
		
	}

}
