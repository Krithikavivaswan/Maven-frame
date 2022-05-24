package org.locators;

import org.helpers.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Adlogin extends BaseClass {

	public Adlogin() {
		
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(id="username")
	private WebElement user;
	
	@FindBy(id="password")
	private WebElement pass;
	
	@FindBy(id="login")
	private WebElement logn;

	
	public WebElement getUser() {
		return user;
	}

	public WebElement getPass() {
		return pass;
	}

	public WebElement getLogn() {
		return logn;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
