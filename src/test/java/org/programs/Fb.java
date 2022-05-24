package org.programs;


import java.util.List;

import org.helpers.BaseClass;
import org.locators.Fblogin;
import org.openqa.selenium.WebElement;

public class Fb extends BaseClass {
	public static void main(String[] args) {
		
		openChromeBrowser();
		launchUrl("https://www.facebook.com/");
		maxWindow();
		
		Fblogin l1=new Fblogin();
		
		WebElement user= l1.getUser();
		fillTextBox(user, "krithika");
		
		WebElement pass=l1.getPass();
		fillTextBox(pass, "12345");
		
		List<WebElement> btnlogin=l1.getBtnlogin();
		toClick(btnlogin.get(0));
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
