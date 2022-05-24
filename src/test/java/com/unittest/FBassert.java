package com.unittest;

import org.helpers.BaseClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.locators.Fblogin;
import org.openqa.selenium.WebElement;

public class FBassert extends BaseClass {
	@Test
	public void tc1() {
		String url = toFetchUrl();
		Assert.assertTrue("check the url", url.contains("http"));

		String title = toFetchTitle();
		Assert.assertTrue("Check the title", title.contains("Facebook"));

	}

	@Test
	public void tc2() {
		Fblogin f = new Fblogin();
		WebElement user = f.getUser();
		user.sendKeys("Selenium");
		Assert.assertEquals("Check the username", "Selenium", user.getAttribute("value"));

		WebElement pass = f.getPass();
		pass.sendKeys("12345");
		Assert.assertEquals("Check the password", "1234", pass.getAttribute("value"));

	}

	@BeforeClass
	public static void bfcl() {
		openChromeBrowser();
		launchUrl("https://www.facebook.com/");
		maxWindow();

	}

}
