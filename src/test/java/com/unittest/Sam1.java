package com.unittest;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class Sam1 {
	@Test
	
	public void tc1() {
System.out.println("Test 1");
		Assert.assertTrue("Check tc1", false);
		System.out.println("Test 11");
		
	}
	@Ignore
	@Test
	public void tc3() {
System.out.println("Test 3");
Assert.assertTrue("Check tc3", true);		
System.out.println("Test 33");

	}
	@Test
	public void tc2() {
System.out.println("Test 2");
	Assert.assertEquals("1234", "1234");
	System.out.println("Test 22");
	}
	
	
	
	
	
	
	
	

}
