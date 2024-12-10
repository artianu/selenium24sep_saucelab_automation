package com.SwagLab.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutOverviewPage {
	

	
private WebDriver Driver;
	
	public CheckoutOverviewPage(WebDriver Driver)
	{
		this.Driver=Driver;
		PageFactory.initElements(Driver,this);
		
	}
	
	
	//Locator
	
	@FindBy(xpath="//div[@class='inventory_item_name']")
	WebElement purname;
	
	
	@FindBy(xpath="//a[text()='FINISH']")
	WebElement finishbtn;
	
	
	
	@FindBy(xpath="//a[text()='CANCEL']")
	WebElement cancelbtn;
	
	
	
	//Methods
	
	public String getpurname()
	
	{
		
		String purname1=purname.getText();
		return purname1;
		
					
	}
	
	
	public FinishPage clickonfinishbtn()
	
	{
		finishbtn.click();
		return new FinishPage(Driver);
		
			
	}
	
public void clickoncancelbtn()
	
	{
		cancelbtn.click();
		
	}
	
	
	
}
