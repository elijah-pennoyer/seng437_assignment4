package org.jfree.data.test.datautilities.getCumulativePercentages;

import java.security.InvalidParameterException;
import java.util.ArrayList;

import org.jfree.data.DataUtilities;
import org.jfree.data.KeyedValues;
import org.jmock.Expectations;
import org.jmock.Mockery;
import org.junit.Test;

public class ZeroSummingInputTest {

	/**
	 * Test Plan Coverage: getCumulativePercentages test plan 4
	 * Test Strategy Coverage: All values sum to 0
	 * Description: Tests a valid data input with both positive and negative values where the sum is 0, 
	 * 		with a keyset of (0,1) and values of (-5,5)
	 * Expected Output: InvalidParameterException
	 * Assumptions: A zero summing input isn't allowed, as it would lead to division by 0
	 */
	@Test (expected = InvalidParameterException.class)
	public void getCumulativePercentages_ValidZeroSummingInput_Test() {
		
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
				
				//If getValue(0) is called, will return -5
				allowing (input).getValue(0);
				will(returnValue(-5));
				
				//If getValue(1) is called, will return 5
				allowing (input).getValue(1);
				will(returnValue(5));
				
				//If getKey(0) is called, will return 0 - The index of the first object
				allowing (input).getKey(0);
				will(returnValue(0));
				//If getKey(1) is called, will return 1 - The index of the second object
				allowing (input).getKey(1);
				will(returnValue(1));
			}
		});
		
		
		//This should throw an exception
		DataUtilities.getCumulativePercentages(input);
		
	}

}
