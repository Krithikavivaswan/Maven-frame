package com.unittest;

import org.helpers.BaseClass;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.locators.Flipkart;
import org.openqa.selenium.WebElement;

public class Flipk extends BaseClass {

	@BeforeClass
	public static void bfrcls() {
		openChromeBrowser();
		launchUrl("https://www.flipkart.com/account/login");
		maxWindow();
	}

	@Before
	public void bfre() {
		getdateandtime();
	}

	@Test
	public void tc1() {

		Flipkart f = new Flipkart();

		WebElement user = f.getUser();
		fillTextBox(user, "krithika");
		Assert.assertTrue("Check the username", true);
		boolean contd = user.getAttribute("value").contains("kri");
		System.out.println(contd);
		Assert.assertTrue("Check the username", contd);

		WebElement pass = f.getPass();
		fillTextBox(pass, "12345");
Assert.assertEquals("Check the password", "123456", "12345");

	}

	@After
	public void aft() {
		getdateandtime();
	}

	@AfterClass
	public static void aftcls() {
		closeBrowser();

	}

}
