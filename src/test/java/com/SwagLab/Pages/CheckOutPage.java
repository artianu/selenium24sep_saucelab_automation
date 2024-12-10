package com.SwagLab.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class CheckOutPage  {
	
	
private WebDriver Driver;
	
	public CheckOutPage(WebDriver Driver)
	{
		this.Driver=Driver;
		PageFactory.initElements(Driver,this);
		
	}
	
	
	//Locator
	@FindBy(xpath="//input[@id='first-name']")
	WebElement fname;
	
	@FindBy(xpath="//input[@id='last-name']")
	WebElement lname;
	
	@FindBy(xpath="//input[@id='postal-code']")
	WebElement pcode;
	
	
	@FindBy(xpath="//input[@value='CONTINUE']")
	WebElement continuebtn;
	
	@FindBy(xpath="//input[@value='CANCEL']")
	WebElement cancelbtn;
	
	
		
	//Methods
	
	public void enterDetails()
	{
		fname.sendKeys("arti");
		lname.sendKeys("firodiya");
		pcode.sendKeys("414102");
		
		}
	
		
	public CheckoutOverviewPage checkoutcontinue()
	
	{
		
		continuebtn.click();
		return new CheckoutOverviewPage(Driver);
		//navigate to chkoutoverview page
		
	}
	
public void cancelprocess()
	
	{
				
		cancelbtn.click();
		//navigate to cancel button
		
	}
	
	
	

}
