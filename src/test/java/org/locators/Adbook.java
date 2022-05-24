package org.locators;

import org.helpers.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Adbook extends BaseClass{
	
	public Adbook() {
		
	PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="first_name")
	private WebElement fname;
	
	@FindBy(id="last_name")
	private WebElement lname;
	
	@FindBy(id="address")
	private WebElement addr;
	
	@FindBy(id="cc_num")
	private WebElement cc;
	
	@FindBy(id="cc_type")
	private WebElement card;
	
	@FindBy(id="cc_exp_month")
	private WebElement exp;
	
	@FindBy(id="cc_exp_year")
	private WebElement year;
	
	@FindBy(id="cc_cvv")
	private WebElement cvv;

	public WebElement getFname() {
		return fname;
	}

	public WebElement getLname() {
		return lname;
	}

	public WebElement getAddr() {
		return addr;
	}

	public WebElement getCc() {
		return cc;
	}

	public WebElement getCard() {
		return card;
	}

	public WebElement getExp() {
		return exp;
	}

	public WebElement getYear() {
		return year;
	}

	public WebElement getCvv() {
		return cvv;
	}
	
	
	
	



	
	
	

}
