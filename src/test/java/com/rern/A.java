package com.rern;

import org.testng.Assert;
import org.testng.annotations.Test;

public class A {

	@Test
	private void tc3() {
		System.out.println("Test 3");
		Assert.assertTrue(10 > 40, "Check tc3");
		System.out.println("Test 33");

	}

	@Test
	private void tc2() {
		System.out.println("Test 2");
		System.out.println(2 / 0);
		System.out.println("Test 22");
	}

	@Test
	private void tc1() {
		System.out.println("Test 1");
		Assert.assertEquals("java12", "java12", "Check tc1");
		System.out.println("Test 11");
	}

}
