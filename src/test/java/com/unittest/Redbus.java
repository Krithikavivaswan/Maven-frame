package com.unittest;

import org.helpers.BaseClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Redbus extends BaseClass {

	@Test
	public void login() {
		toClick(driver.findElement(By.id("sign-in-icon-down")));
		toClick(driver.findElement(By.xpath("//*[text()='Sign In/Sign Up']")));

	}

	@Test
	public void tc1(){
		
		WebElement frm = driver.findElement(By.xpath("//iframe[@class='modalIframe']"));
		driver.switchTo().frame(frm);
		WebElement user = driver.findElement(By.xpath("//input[@id='mobileNoInp']"));
		fillTextBox(user, "1234567890");

	}

	@BeforeClass
	public static void browser() {
		openChromeBrowser();
		launchUrl("https://www.redbus.in/");
		maxWindow();

	}

}
