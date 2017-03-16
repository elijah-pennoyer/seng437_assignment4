package org.jfree.data.test.datautilities.getCumulativePercentages;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.jfree.data.DataUtilities;
import org.jfree.data.KeyedValues;
import org.jmock.Expectations;
import org.jmock.Mockery;
import org.junit.Test;


public class NullValueInDataTest {

	/**
	 * Test Plan Coverage: getCumulativePercentages test based on code coverage tool results
	 * Test Strategy Coverage: null value in KeyedValues data
	 * Description: Tests the result of using a KeyedValues object with a single null value
	 * Expected Output: KeyedValues object with one 0 value at key 0
	 * Assumptions: A KeyedValues object with a single null value is equivalent to a KeyedValues object with a single zero value.
	 */
	@Test
	public void getCumulativePercentages_NullValueInData_Test() {
		
		Mockery mockingContext = new Mockery();
		final KeyedValues input = mockingContext.mock(KeyedValues.class);
		mockingContext.checking(new Expectations() {
			{
				//The "allowing" labels means that it doesn't matter how many times these options are called.
				
				
				//If the method tries to get all keys, it will get an ArrayList with a single Integer = 0.
				allowing (input).getKeys();
				ArrayList<Integer> toReturn = new ArrayList<Integer>();
				toReturn.add(0);
				will(returnValue(toReturn));
				
				//If the method tries to get the number of items, it will get 1.
				allowing (input).getItemCount();
				will(returnValue(1)); 
				
				//If getValue(0) is called, will return null
				allowing (input).getValue(0);
				will(returnValue(null));
				
				//If getKey(0) is called, will return 0 - The index of the first object
				allowing (input).getKey(0);
				will(returnValue(0));
				
			}
		});
		
		
	KeyedValues output = DataUtilities.getCumulativePercentages(input);
		
		
	ArrayList<Integer> expectedKeys = new ArrayList<Integer>();
	expectedKeys.add(0);
	
	assertEquals("getCumulativePercentages with a null value in KeyedValues data failed", expectedKeys, output.getKeys());
	//NOTE: The final input for double-based assertEquals is "delta" - An offset of how close the values have to be.
	//delta = 1e-15 is just a recommendation for delta off of the Internet - http://stackoverflow.com/questions/5686755/meaning-of-epsilon-argument-of-assertequals-for-double-values
	double delta = 1e-15;
	assertEquals("getCumulativePercentages with a null value in KeyedValues data failed", 0, (double) output.getValue(0), delta);

	}

}
