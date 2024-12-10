package com.SwagLab.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {
	
private WebDriver Driver;
	
	public CartPage(WebDriver Driver)
	{
		this.Driver=Driver;
		PageFactory.initElements(Driver,this);
		
	}
	
	
	//locators
	
	@FindBy(xpath="//a[text()='CHECKOUT']")
	WebElement chkoutbutton;
	
	
	@FindBy(xpath="//a[text()='Continue Shopping']")
	WebElement continueshopbutton;
	
	
	@FindBy(xpath="//button[text()='REMOVE']")
	WebElement removebutton;
	
	@FindBy(xpath="//div[@class='inventory_item_name']")
	WebElement product;
	
	public void removeProduct()
		{
		
		String ptext=product.getText();
		System.out.println("Product to be Removed: "+ptext);
		removebutton.click();
		System.out.println("Product removed Successfully: "+ptext);
			
		
		}
	
	public InventoryPage continueShopping()
	{
	
		continueshopbutton.click();
		
		//inventory page
		return new InventoryPage(Driver);
	
	}
	
	
	public CheckOutPage launchCheckout()
	
	{
		
		chkoutbutton.click();
		
		return new CheckOutPage(Driver);
		
	}
	
	

}
