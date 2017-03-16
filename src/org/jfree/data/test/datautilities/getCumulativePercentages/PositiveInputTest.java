package org.jfree.data.test.datautilities.getCumulativePercentages;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.jfree.data.DataUtilities;
import org.jfree.data.KeyedValues;
import org.jmock.Expectations;
import org.jmock.Mockery;
import org.junit.Test;


public class PositiveInputTest {
	
	/**
	 * Test Plan Coverage: getCumulativePercentages test plan 3
	 * Test Strategy Coverage: Data is valid, All values are positive
	 * Description: Tests a valid data input and a positive data input, with a keyset of (0,1) and values of (3,7)
	 * Expected Output: A KeyedValues object with keys (0, 1) and values (0.3, 1)
	 * Assumptions: Because the KeyedValues object doesn't have an equals function, we will use multiple asserts to test that each
	 * 		part of the object is correct.
	 */
	@Test
	public void getCumulativePercentages_ValidPositiveInput_Test() {
		
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
				
				//If getValue(0) is called, will return 3
				allowing (input).getValue(0);
				will(returnValue(3));
				
				//If getValue(1) is called, will return 7
				allowing (input).getValue(1);
				will(returnValue(7));
				
				//If getKey(0) is called, will return 0 - The index of the first object
				allowing (input).getKey(0);
				will(returnValue(0));
				//If getKey(1) is called, will return 1 - The index of the second object
				allowing (input).getKey(1);
				will(returnValue(1));
				
			}
		});
		
		KeyedValues output = DataUtilities.getCumulativePercentages(input);
		
		
		ArrayList<Integer> expectedKeys = new ArrayList<Integer>();
		expectedKeys.add(0);
		expectedKeys.add(1);
		assertEquals("getCumulativePercentages with a positive input failed", expectedKeys, output.getKeys());
		//NOTE: The final input for double-based assertEquals is "delta" - An offset of how close the values have to be.
		//delta = 1e-15 is just a recommendation for delta off of the Internet - http://stackoverflow.com/questions/5686755/meaning-of-epsilon-argument-of-assertequals-for-double-values
		double delta = 1e-15;
		assertEquals("getCumulativePercentages with a positive input failed", 0.3, (double) output.getValue(0), delta);
		assertEquals("getCumulativePercentages with a positive input failed", 1, (double) output.getValue(1), delta);
		
		
		
	}

}
