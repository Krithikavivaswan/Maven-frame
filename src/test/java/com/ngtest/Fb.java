package com.ngtest;


import org.helpers.BaseClass;
import org.locators.Fblogin;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Fb extends BaseClass {
@Parameters({"User","Pass"})
	@Test
	private void tc1(@Optional("Selenium")String User,@Optional("Java") String Pass) {

		Fblogin f = new Fblogin();
		fillTextBox(f.getUser(), User);
		Assert.assertTrue(driver.getCurrentUrl().equals("https://www.facebook.com/"), "Check the url");
		
		fillTextBox(f.getPass(), Pass);
		Assert.assertEquals("123456", "12345", "check the password");
		toClick(f.getBtnlogin().get(0));

	}

	@BeforeClass
	private void befcls() {

		openChromeBrowser();
		launchUrl("https://www.facebook.com/");
		maxWindow();
		implicitwait();

	}
	
	@AfterClass
	private void aftcls() {
closeBrowser();
	}
	
	
	@BeforeMethod
	private void bfrmeth() {
getdateandtime();
		
	}
	
@AfterMethod
private void aftmeth() {
getdateandtime();


}
	
	
	
	
}
