package com.dataprov;

import org.helpers.BaseClass;
import org.locators.Fblogin;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.ngtest.A;

public class Dataprovi extends BaseClass {

	@Test(dataProvider = "Login", dataProviderClass = A.class)
	private void tc1(String user, String pass) throws InterruptedException {
		launchUrl("https://www.facebook.com/");
		Fblogin f = new Fblogin();
		fillTextBox(f.getUser(), user);
		fillTextBox(f.getPass(),pass);
		toClick(f.getBtnlogin().get(0));
		Thread.sleep(5000);

	}
	
	/* @DataProvider(name="Login") 
	 private String[][] logindata() {
	  
	  return new String[][] { 
		  {"selenium@gmail.com", "Selenium@123"},
	  {"greens@gmail.com","345667"}, 
	  {"Anitha123","anu8907"} };
	  }
	 

	@DataProvider(name = "Register")
	private Object[][] regdata() {

		return new Object[][] { { "Anu", "Priya", 789044334l, "anu@123" },
				{ "sam", "riya", "sam@gmail.com", 3456777 } };

	}
*/
	@BeforeClass
	private void bfcls() {
		openChromeBrowser();
		maxWindow();

	}

	@AfterClass
	private void aftcls() {
		closeBrowser();
	}

}
