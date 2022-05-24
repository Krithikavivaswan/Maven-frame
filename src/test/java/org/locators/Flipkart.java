package org.locators;

import org.helpers.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class Flipkart extends BaseClass{

	public Flipkart() {
PageFactory.initElements(driver, this);
	
	}
	
	@FindBy(xpath="(//input[@type='text'])[2]")	
	private WebElement User; 
	
	
	@FindBys({
		@FindBy(xpath="//input[@type='password']"),
		@FindBy(xpath="(//input[@autocomplete='off'])[3]")
	})
private WebElement Pass;


	public WebElement getUser() {
		return User;
	}


	public WebElement getPass() {
		return Pass;
	}	
	
	
	
	
	
}
