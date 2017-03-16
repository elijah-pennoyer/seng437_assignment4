package org.jfree.data.test.datautilities.getCumulativePercentages;


import java.security.InvalidParameterException;
import java.util.ArrayList;

import org.jfree.data.DataUtilities;
import org.jfree.data.KeyedValues;
import org.jmock.Expectations;
import org.jmock.Mockery;
import org.junit.Test;

public class PositiveSummingMixedSignInputsTest {

	/**
	 * Test Plan Coverage: getCumulativePercentages test plan 6
	 * Test Strategy Coverage: Values include 0 and negative numbers but sum to positive
	 * Description: Tests a valid data input with both positive and negative values where the sum is negative, 
	 * 		with a keyset of (0,1,2) and values of (5,-1,0)
	 * Expected Output: InvalidParameterException
	 * Assumptions: Mixtures of positive and negative values in the input KeyedValues is not allowed.
	 */
	@Test (expected = InvalidParameterException.class)
	public void getCumulativePercentages_ValidPositiveSummingMixedInput_Test() {
		
		Mockery mockingContext = new Mockery();
		final KeyedValues input = mockingContext.mock(KeyedValues.class);
		mockingContext.checking(new Expectations() {
			{
				//If getItemCount is called, it will return 3
				allowing (input).getItemCount();
				will(returnValue(3)); 
				
				//If getKeys is called, it will return an ArrayList containing Integer objects of 0, 1 and 2
				allowing (input).getKeys();
				ArrayList<Integer> toReturn = new ArrayList<Integer>();
				toReturn.add(0); toReturn.add(1); toReturn.add(2);
				will(returnValue(toReturn));
				
				//If getValue(0) is called, will return 5
				allowing (input).getValue(0);
				will(returnValue(5));
				
				//If getValue(1) is called, will return -1
				allowing (input).getValue(1);
				will(returnValue(-1));
				
				//If getValue(2) is called, will return 0
				allowing (input).getValue(2);
				will(returnValue(0));
				
				//If getKey(0) is called, will return 0 - The index of the first object
				allowing (input).getKey(0);
				will(returnValue(0));
				
				//If getKey(1) is called, will return 1 - The index of the second object
				allowing (input).getKey(1);
				will(returnValue(1));
				
				//If getKey(2) is called, will return 2 - The index of the third object
				allowing (input).getKey(2);
				will(returnValue(2));
				
			}
		});
		
		//This should throw a InvalidDataException
		DataUtilities.getCumulativePercentages(input);
		
	}

}
