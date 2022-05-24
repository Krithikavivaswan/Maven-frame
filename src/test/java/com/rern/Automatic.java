package com.rern;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Automatic {

	@Test
	private void tc1() {
		System.out.println("Test 1");
		Assert.assertTrue(true);

	}
@Test
	private void tc2() {
		System.out.println("Test 2");
		Assert.assertTrue(false, "Check tc2");
	}
@Test (retryAnalyzer=Failed.class)
	private void tc3() {
		System.out.println("Test 3");
		Assert.assertTrue(false);

	}
}
