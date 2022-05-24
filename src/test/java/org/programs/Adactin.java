package org.programs;

import java.awt.AWTException;
import java.io.IOException;

import org.helpers.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Adactin extends BaseClass {
	public static void main(String[] args) throws IOException, AWTException, InterruptedException {

		openChromeBrowser();
		launchUrl("http://www.adactin.com/HotelApp/");
		maxWindow();

		WebElement user = driver.findElement(By.id("username"));
		fillTextBox(user, readFromExcel("Maven data", "Login", 1, 0));

		WebElement pass = driver.findElement(By.id("password"));
		fillTextBox(pass, readFromExcel("Maven data", "Login", 1, 1));

		WebElement login = driver.findElement(By.id("login"));
		toClick(login);

		WebElement loc = driver.findElement(By.id("location"));
		selectvisibletext(loc, "Sydney");

		WebElement hotel = driver.findElement(By.id("hotels"));
		selectindex(hotel, 2);

		WebElement type = driver.findElement(By.id("room_type"));
		selectvalue(type, "Double");

		WebElement nos = driver.findElement(By.id("room_nos"));
		selectindex(nos, 4);

		WebElement adult = driver.findElement(By.id("adult_room"));
		selectindex(adult, 3);

		WebElement child = driver.findElement(By.id("child_room"));
		selectvalue(child, "3");

		WebElement submit = driver.findElement(By.id("Submit"));
		toClick(submit);

		WebElement radio = driver.findElement(By.id("radiobutton_0"));
		toClick(radio);

		WebElement cont = driver.findElement(By.id("continue"));
		toClick(cont);

		WebElement fname = driver.findElement(By.id("first_name"));
		fillTextBox(fname, readFromExcel("Maven data", "Login", 1, 2));

		WebElement lname = driver.findElement(By.id("last_name"));
		fillTextBox(lname, readFromExcel("Maven data", "Login", 1, 3));

		WebElement addr = driver.findElement(By.id("address"));
		fillTextBox(addr, readFromExcel("Maven data", "Login", 1, 4));

		WebElement cc = driver.findElement(By.id("cc_num"));
		fillTextBox(cc, readFromExcel("Maven data", "Login", 1, 5));

		WebElement card = driver.findElement(By.id("cc_type"));
		selectvisibletext(card, "VISA");

		WebElement exp = driver.findElement(By.id("cc_exp_month"));
		selectvisibletext(exp, "March");

		WebElement year = driver.findElement(By.id("cc_exp_year"));
		selectvisibletext(year, "2013");

		WebElement cvv = driver.findElement(By.id("cc_cvv"));
		sendvaluesjs("123", cvv);
		
		tab();
		enter();
		
		toHold(16000);
		WebElement order = driver.findElement(By.id("order_no"));
		System.out.println("Booking reference no is:" + order.getAttribute("value"));

		
		
	}

}
