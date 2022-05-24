package org.programs;

import java.io.IOException;

import org.helpers.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Sample extends BaseClass {

	public static void main(String[] args) throws InterruptedException, IOException {

		// Sample s=new Sample(); instanciate not required method declared static

		openChromeBrowser();
		launchUrl("https://www.facebook.com/");
		maxWindow();
		toFetchTitle();
		toFetchUrl();

		WebElement user = driver.findElement(By.id("email"));
		fillTextBox(user, readFromExcel("Maven data", "Details", 2, 2));
		totakeSnap("Username");

		toHold(3000);

		WebElement password = driver.findElement(By.id("pass"));
		fillTextBox(password, readFromExcel("Maven data", "Details", 5, 3));
		totakeSnap("Password");

		WebElement btnLog = driver.findElement(By.name("login"));
		toClick(btnLog);
		totakeSnap("Login");


		
		
	}

}
