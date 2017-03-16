package org.jfree.data.test.range.getCentralValue;

import java.security.InvalidParameterException;

import org.jfree.data.Range;
import org.junit.Before;
import org.junit.Test;

public class NullRangeTest 
{
	private Range r;
	
	/**
	 * 	Sets the Range to be null.
	 */
	
	@Before
	public void setup() { r = null; }
	
	/**
	 * 	Test Plan Coverage: getCentralValue test plan 1
	 * 	Test Strategy Coverage: null Range
	 * 	Description: 
	 * 
	 * 		Tests the getCentralValue function on a null Range object.
	 * 
	 * 	Expected Output:
	 * 
	 * 		InvalidParameterException thrown.
	 * 
	 * 	Assumptions: N/A
	 */
	
	@Test (expected = InvalidParameterException.class)
	public void getCentralValue_NullRange_Test()
	{
		r.getCentralValue();
	}
}
