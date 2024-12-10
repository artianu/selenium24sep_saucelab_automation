package com.SwagLab.Pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FinishPage {
	
	
private WebDriver Driver;
	
	public FinishPage(WebDriver Driver)
	{
		this.Driver=Driver;
		PageFactory.initElements(Driver,this);
		
	}



//locator

	@FindBy(xpath="//h2[text()='THANK YOU FOR YOUR ORDER']")
	WebElement fpstatus1;



	@FindBy(xpath="//div[@class='complete-text']")
	WebElement fpstatus2;



//Methods
	
	public String getstatus1()
	{
		
		return fpstatus1.getText();
	}
	
	public String getstatus2()
	{
		
		return fpstatus2.getText();
	}
		

	
	
}