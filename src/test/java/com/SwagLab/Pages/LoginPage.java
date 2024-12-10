package com.SwagLab.Pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	private WebDriver Driver;
	
	public LoginPage(WebDriver Driver)
	{
		this.Driver=Driver;
		PageFactory.initElements(Driver,this);
		
	}
	
	//Locators
	
	@FindBy(id="user-name")
	WebElement username;
	
	@FindBy(id="password")
	WebElement passwd;
	
	@FindBy(id="login-button")
	WebElement btn;
	
	
	public String getAppUrl()
		{
		return Driver.getCurrentUrl();
	}
	
	public String getAppTitle()
		{
		return Driver.getTitle();
	
	}
	
		
	public InventoryPage doLogin(String uname1,String Passwd1)

		{
			
			username.sendKeys(uname1);
			passwd.sendKeys(Passwd1);
			btn.click();
			
			//inventory page
			
			return new InventoryPage(Driver);
		}
		
	
	
	
	

}
