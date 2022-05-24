package org.grpng;

import org.testng.annotations.Test;

public class Abc {
	@Test(groups= {"Main","Head"})
	private void tc1() {
System.out.println("Test 1");
	}

	@Test(groups="Main")
	private void tc3() {
System.out.println("Test 3");
	}

	@Test(groups="Tail")
	private void tc5() {
System.out.println("Test 5");
	}

}
