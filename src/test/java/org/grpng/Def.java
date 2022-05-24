package org.grpng;

import org.testng.annotations.Test;

public class Def {

	@Test(groups= {"Head","Tail"})
	private void tc11() {
System.out.println("Test 11");
	}

	@Test(groups="Head")
	private void tc22() {
System.out.println("Test 22");
	}

	@Test(groups="Main")
	private void tc33() {
System.out.println("Test 33");
	}

}
