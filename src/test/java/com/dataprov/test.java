package com.dataprov;

import org.testng.annotations.DataProvider;

public class test {
	
	@DataProvider(name="Login")
	public  String[][] logindata() {
		
		return new String[][] {
			{"selenium@gmail.com", "Selenium@123"},
			{"greens@gmail.com","345667"},
			{"Anitha123","anu8907"}
		};
				
	}
	

}
