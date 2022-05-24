package org.locators;

import org.helpers.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Adselect extends BaseClass{
	
	public Adselect() {
PageFactory.initElements(driver, this);
	
	}

	@FindBy(id="radiobutton_0")
	private WebElement radio; 
	
	@FindBy(id="continue")
	private WebElement cont;
	

	public WebElement getRadio() {
		return radio;
	}

	public WebElement getCont() {
		return cont;
	} 

	
	
	
	
	
	
	
	
	
}
