package com.ngtest;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class A {

	@Test
	private void tc2() {
System.out.println("Test 2");
	}
	
	@Test
	private void tc1() {
System.out.println("Test 1");
	}
	
	@Test
	private void tc3() {
System.out.println("Test 3");
	}
	
	@DataProvider(name="Login")
	public  String[][] logindata() {
		
		return new String[][] {
			{"selenium@gmail.com", "Selenium@123"},
			{"greens@gmail.com","345667"},
			{"Anitha123","anu8907"}
		};
				
	}
	
}
