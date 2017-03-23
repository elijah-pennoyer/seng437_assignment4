package org.jfree.data.test.range.combine;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.jfree.data.Range;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class RangesDoNotOverlapTest {
	
	private Range r1, r2, expected;
	
	public RangesDoNotOverlapTest(Range r1, Range r2, Range expected){
		this.r1 = r1;
		this.r2 = r2;
		this.expected = expected;
	}
	
	@Parameters
	public static Collection<Object []> data(){
		return Arrays.asList(new Object[][]{
			{new Range(0.0, 5.0), new Range(6.0, 10.0), new Range(0.0,10.0)},
			{new Range(-5.0,0.0), new Range(1.0, 10.0), new Range(-5.0,10.0)},
			{new Range(-5.0, 5.0), new Range(6.0,10.0), new Range(-5.0,10.0)}
		});
	}
	
	@Test
	public void combine_RangesDoNotOverlap_Test(){
		Range actual = Range.combine(r1, r2);
		assertEquals("Testing combine in Range where the ranges do not overlap", expected, actual);
	}
	
	
}
