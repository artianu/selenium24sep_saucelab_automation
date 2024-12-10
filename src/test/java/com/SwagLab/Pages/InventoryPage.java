package com.SwagLab.Pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InventoryPage {
	
	
	
	private WebDriver Driver;
	
	public InventoryPage(WebDriver Driver)
	{
		this.Driver=Driver;
		PageFactory.initElements(Driver,this);
		
	}
	
	
	//locator
	
	@FindBy(xpath="//div[@class='inventory_list']//div[@class='inventory_item']")
	               List<WebElement> prodlist;
	
	
	@FindBy(xpath="//div[@class='inventory_item']//div[@class='inventory_item_name']")
				List<WebElement> productname;
	
	@FindBy(xpath="//button[text()='ADD TO CART']")
		WebElement addtocartbtn;
	
	@FindBy(xpath="//a[@class='shopping_cart_link fa-layers fa-fw']")
	WebElement cartoption;
	
	
	//Methods
	
	public int getProductCount()
	{
		
		int prodcnt=prodlist.size();
				return prodcnt;
	}
	
	public void getProductNames()
	{
		for(WebElement wb:productname)
			
		{
			
			System.out.println(wb.getText());
			
		}
		
	}
	
	
	public void AddProductInCart(String Pname)
	{
		for(WebElement wb:productname)
			
		{
			
			if (wb.getText().contains(Pname))
				{
				 
					wb.click();
					break;
				}
			
		
			}
		
		addtocartbtn.click();
		System.out.println("Product added to Cart"+Pname);
	
	}
	
	
	public CartPage openCartPage()
	{
		cartoption.click();
		return new CartPage(Driver);
		
		//navigating cart page
		
		
	}
	
	
	
	
}



