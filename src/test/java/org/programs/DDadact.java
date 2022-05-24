package org.programs;

import java.awt.AWTException;
import java.io.IOException;

import org.helpers.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class DDadact extends BaseClass {

	public static void main(String[] args) throws IOException, AWTException, InterruptedException {

		createNewfileandwrite("Adact", "Register", 0, 0, "Username");
		createCellinrow("Adact", "Register", 0, 1, "krithikaganesh");

		createRowandwrite("Adact", "Register", 1, 0, "Password");
		createCellinrow("Adact", "Register", 1, 1, "kb10316*");

		createRowandwrite("Adact", "Register", 2, 0, "Location");
		createCellinrow("Adact", "Register", 2, 1, "Sydney");

		createRowandwrite("Adact", "Register", 3, 0, "Hotels");
		createCellinrow("Adact", "Register", 3, 1, "Hotel Creek");

		createRowandwrite("Adact", "Register", 4, 0, "Room Type");
		createCellinrow("Adact", "Register", 4, 1, "Double");

		createRowandwrite("Adact", "Register", 5, 0, "No.of rooms");
		createCellinrow("Adact", "Register", 5, 1, "3 - Three");

		createRowandwrite("Adact", "Register", 6, 0, "Adults per room");
		createCellinrow("Adact", "Register", 6, 1, "3 - Three");

		createRowandwrite("Adact", "Register", 7, 0, "Child per room");
		createCellinrow("Adact", "Register", 7, 1, "4 - Four");

		createRowandwrite("Adact", "Register", 8, 0, "Firstname");
		createCellinrow("Adact", "Register", 8, 1, "Krithika");

		createRowandwrite("Adact", "Register", 9, 0, "Lastname");
		createCellinrow("Adact", "Register", 9, 1, "Ganesh");

		createRowandwrite("Adact", "Register", 10, 0, "Address");
		createCellinrow("Adact", "Register", 10, 1, "Chennai");

		createRowandwrite("Adact", "Register", 11, 0, "Card num");
		createCellinrow("Adact", "Register", 11, 1, "1234567890123456");

		createRowandwrite("Adact", "Register", 12, 0, "CVV num");
		createCellinrow("Adact", "Register", 12, 1, "905");

		createRowandwrite("Adact", "Register", 13, 0, "Order no");

		openChromeBrowser();
		launchUrl("http://www.adactin.com/HotelApp/");
		maxWindow();

		WebElement user = driver.findElement(By.id("username"));
		fillTextBox(user, readFromExcel("Adact", "Register", 0, 1));

		WebElement pass = driver.findElement(By.id("password"));
		fillTextBox(pass, readFromExcel("Adact", "Register", 1, 1));

		WebElement login = driver.findElement(By.id("login"));
		toClick(login);

		WebElement loc = driver.findElement(By.id("location"));
		selectvisibletext(loc, readFromExcel("Adact", "Register", 2, 1));

		WebElement hotel = driver.findElement(By.id("hotels"));
		selectvisibletext(hotel, readFromExcel("Adact", "Register", 3, 1));

		WebElement type = driver.findElement(By.id("room_type"));
		selectvisibletext(type, readFromExcel("Adact", "Register", 4, 1));

		WebElement nos = driver.findElement(By.id("room_nos"));
		selectvisibletext(nos, readFromExcel("Adact", "Register", 5, 1));

		WebElement adult = driver.findElement(By.id("adult_room"));
		selectvisibletext(adult, readFromExcel("Adact", "Register", 6, 1));

		WebElement child = driver.findElement(By.id("child_room"));
		selectvisibletext(child, readFromExcel("Adact", "Register", 7, 1));

		toClick(driver.findElement(By.id("Submit")));
		toClick(driver.findElement(By.id("radiobutton_0")));
		toClick(driver.findElement(By.id("continue")));

		WebElement fname = driver.findElement(By.id("first_name"));
		fillTextBox(fname, readFromExcel("Adact", "Register", 8, 1));

		WebElement lname = driver.findElement(By.id("last_name"));
		fillTextBox(lname, readFromExcel("Adact", "Register", 9, 1));

		WebElement addr = driver.findElement(By.id("address"));
		fillTextBox(addr, readFromExcel("Adact", "Register", 10, 1));

		WebElement cc = driver.findElement(By.id("cc_num"));
		fillTextBox(cc, readFromExcel("Adact", "Register", 11, 1));

		WebElement card = driver.findElement(By.id("cc_type"));
		selectvisibletext(card, "VISA");

		WebElement exp = driver.findElement(By.id("cc_exp_month"));
		selectvisibletext(exp, "March");

		WebElement year = driver.findElement(By.id("cc_exp_year"));
		selectvisibletext(year, "2013");

		WebElement cvv = driver.findElement(By.id("cc_cvv"));
		fillTextBox(cvv, readFromExcel("Adact", "Register", 12, 1));


		WebElement book = driver.findElement(By.id("book_now"));
		toClick(book);

		toHold(10000);
		WebElement order = driver.findElement(By.id("order_no"));
		System.out.println("Booking reference no is:" + order.getAttribute("value"));
		createCellinrow("Adact", "Register", 13, 1, getattribvalue(order, "value"));

	}

}
