package org.programs;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.helpers.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Naukri extends BaseClass {

	public static void main(String[] args) throws IOException, InterruptedException {

		createNewfileandwrite("Naukri", "Register", 0, 0, "Title");
		createCellinrow("Naukri", "Register", 0, 1, "Details");
		
		createRowandwrite("Naukri", "Register", 1, 0, "Full name");
		createCellinrow("Naukri", "Register", 1, 1, "Krithika");

		createRowandwrite("Naukri", "Register", 2, 0, "Email ID");
		createCellinrow("Naukri", "Register", 2, 1, "krithikaganesh@ymail.com");
		
		createRowandwrite("Naukri", "Register", 3, 0, "Password");
		createCellinrow("Naukri", "Register", 3, 1, "123456");

		createRowandwrite("Naukri", "Register", 4, 0, "Mobile number");
		createCellinrow("Naukri", "Register", 4, 1, "123456789");

		createRowandwrite("Naukri", "Register", 5, 0, "City");
		createCellinrow("Naukri", "Register", 5, 1, "Chennai");
		
		openChromeBrowser();
		launchUrl("https://www.naukri.com/registration/createAccount");
		maxWindow();
		
		toHold(2000);
		WebElement fname = driver.findElement(By.id("name"));
		fillTextBox(fname, readFromExcel("Naukri", "Register", 1, 1));
		WebElement emal = driver.findElement(By.id("email"));
		fillTextBox(emal, readFromExcel("Naukri", "Register", 2, 1));
		WebElement pass = driver.findElement(By.id("password"));
		fillTextBox(pass, readFromExcel("Naukri", "Register", 3, 1));
		WebElement mob = driver.findElement(By.id("mobile"));
		fillTextBox(mob, readFromExcel("Naukri", "Register", 4, 1));
		
	}

}











