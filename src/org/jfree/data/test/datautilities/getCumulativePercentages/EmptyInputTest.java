package org.jfree.data.test.datautilities.getCumulativePercentages;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.jfree.data.DataUtilities;
import org.jfree.data.KeyedValues;
import org.jmock.Expectations;
import org.jmock.Mockery;
import org.junit.Test;


public class EmptyInputTest {

	/**
	 * Test Plan Coverage: getCumulativePercentages test plan 2
	 * Test Strategy Coverage: Data is empty
	 * Description: Tests the result of using a KeyedValues object with no values
	 * Expected Output: Empty KeyedValues object 
	 * Assumptions: An empty KeyedValues object is a valid input
	 */
	@Test
	public void getCumulativePercentages_EmptyInput_Test() {
		
		Mockery mockingContext = new Mockery();
		final KeyedValues input = mockingContext.mock(KeyedValues.class);
		mockingContext.checking(new Expectations() {
			{
				//The "allowing" labels means that it doesn't matter how many times these options are called.
				
				
				//If the method tries to get all keys, it will get an empty array list.
				allowing (input).getKeys();
				will(returnValue(new ArrayList<Integer>())); 
				
				//If the method tries to get the number of items, it will get 0.
				allowing (input).getItemCount();
				will(returnValue(0)); 
				
			}
		});
		
		
		KeyedValues output = DataUtilities.getCumulativePercentages(input);
		
		//The assumed result is that the output will be an empty KeyedValues object
		assertEquals("getCumulativePercentages with an empty input failed", 0, output.getItemCount());

	}

}
