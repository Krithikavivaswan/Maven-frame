package com.asses;

import org.helpers.BaseClass;
import org.locators.Fblogin;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Asser extends BaseClass {
	@BeforeClass
	private void tc5() {
		openChromeBrowser();
		launchUrl("https://www.facebook.com/");
		maxWindow();

	}

	@BeforeMethod
	private void tc7() {
		getdateandtime();
	}

	@Test
	private void tc2() {
		String title = toFetchTitle();
		System.out.println("Tc2 before assert");

		SoftAssert s = new SoftAssert();
		s.assertEquals(title, "face", "check title again");
		System.out.println("Tc2 after assert");

		String url = toFetchUrl();
		s.assertTrue(false, "Check url");
		System.out.println("Tc2 URL after assert");

	}

	@Test
	private void tc4() {
		Fblogin f = new Fblogin();
		WebElement user = f.getUser();
		fillTextBox(user, "selenium");
		Assert.assertEquals(user.getAttribute("value"), "selenium@", "check userid");
		fillTextBox(f.getPass(), "12345");

	}

}
