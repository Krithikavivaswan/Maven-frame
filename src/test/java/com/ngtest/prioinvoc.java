package com.ngtest;

import org.testng.annotations.Test;

public class prioinvoc {
	@Test(priority=12,invocationCount=3)
	private void tc2() {
System.out.println("Test 2");
	}
	
	@Test(enabled=false, priority=1)
	private void tc1() {
System.out.println("Test 1");
	}
	
	@Test(priority=-12)
	private void tc3() {
System.out.println("Test 3");
	}


}
