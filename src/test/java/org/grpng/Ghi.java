package org.grpng;

import org.testng.annotations.Test;

public class Ghi {
	@Test(groups="Head")
	private void tc31() {
System.out.println("Test 31");
	}
	
	@Test(groups="Main")
	private void tc41() {
System.out.println("Test 41");
	}
	
	@Test(groups="Tail")
	private void tc51() {
System.out.println("Test 51");
	}

}
