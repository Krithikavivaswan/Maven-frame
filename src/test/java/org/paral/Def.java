package org.paral;

import org.testng.annotations.Test;

public class Def {
	@Test
	private void tc11() {
	System.out.println("Test 11:"+ Thread.currentThread().getId());
	}

	@Test
	private void tc22() {
	System.out.println("Test 22:"+Thread.currentThread().getId());
	}

	@Test
	private void tc33() {
	System.out.println("Test 33:"+Thread.currentThread().getId());
	}

}
