package org.locators;

import java.util.List;

import org.helpers.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class Fblogin extends BaseClass {
	
public Fblogin() {
	
	PageFactory.initElements(driver, this);
}
@CacheLookup
@FindBys( { 
		
		@FindBy(id="email"),
		@FindBy(xpath="//input[@name='email']")	
})
private WebElement user;


@FindAll( { 
	@FindBy(xpath="//input[@name='pass']"),
	@FindBy(id="pass"),
	@FindBy(name="password")
})
private WebElement pass;

@FindBy(name="login")
private List<WebElement> btnlogin;




public WebElement getUser() {
	return user;
}

public WebElement getPass() {
	return pass;
}

public List<WebElement> getBtnlogin() {
	return btnlogin;
}



}
