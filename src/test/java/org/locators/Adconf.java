package org.locators;

import org.helpers.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Adconf extends BaseClass{
	
	public Adconf() {
		
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="order_no")
	private WebElement order;

	public WebElement getOrder() {
		return order;
	}
	
	
	
	
}
