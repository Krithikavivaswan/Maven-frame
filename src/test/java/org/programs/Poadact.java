package org.programs;

import java.awt.AWTException;
import java.io.IOException;

import org.helpers.BaseClass;
import org.locators.Adbook;
import org.locators.Adconf;
import org.locators.Adhotel;
import org.locators.Adlogin;
import org.locators.Adselect;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Poadact extends BaseClass {

	public static void main(String[] args) throws IOException, AWTException, InterruptedException {

		openChromeBrowser();
		launchUrl("http://adactinhotelapp.com/");
		maxWindow();

		Adlogin ad = new Adlogin();

		WebElement user = ad.getUser();
		fillTextBox(user, "krithikaganesh");

		WebElement pass = ad.getPass();
		fillTextBox(pass, "kb10316*");

		WebElement logn = ad.getLogn();
		toClick(logn);

		Adhotel ho = new Adhotel();

		WebElement loc = ho.getLoc();
		selectvisibletext(loc, "Sydney");

		WebElement hotel = ho.getHotel();
		selectindex(hotel, 2);

		WebElement type = ho.getType();
		selectvalue(type, "Double");

		WebElement nos = ho.getNos();
		selectindex(nos, 4);

		WebElement adult = ho.getAdult();
		selectindex(adult, 3);

		WebElement child = ho.getChild();
		selectvalue(child, "3");

		WebElement submit = ho.getSubmit();
		toClick(submit);

		Adselect as = new Adselect();

		WebElement radio = as.getRadio();
		toClick(radio);

		WebElement cont = as.getCont();
		toClick(cont);
		
		Adbook ab=new Adbook();
		
		
		WebElement fname = ab.getFname();
		fillTextBox(fname, readFromExcel("Maven data", "Login", 1, 2));

		WebElement lname = ab.getLname();
		fillTextBox(lname, readFromExcel("Maven data", "Login", 1, 3));

		WebElement addr = ab.getAddr();
		fillTextBox(addr, readFromExcel("Maven data", "Login", 1, 4));

		WebElement cc = ab.getCc();
		fillTextBox(cc, readFromExcel("Maven data", "Login", 1, 5));

		WebElement card = ab.getCard();
		selectvisibletext(card, "VISA");

		WebElement exp = ab.getExp();
		selectvisibletext(exp, "March");

		WebElement year = ab.getYear();
		selectvisibletext(year, "2013");

		WebElement cvv = ab.getCvv();
		sendvaluesjs("123", cvv);
		
		tab();
		enter();
		toHold(16000);

		
		Adconf ac=new Adconf();
		
		WebElement order=ac.getOrder();
		System.out.println("Booking reference num is:"+order.getAttribute("value"));
		
		
		
		
		
		
		
		
		
		

	}

}
