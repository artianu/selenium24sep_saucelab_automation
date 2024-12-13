package com.SwagLabs.TestCases;

import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.*;

import com.SwagLab.Pages.*;
import com.SwagLabs.Utility.*;


public class BaseClass {
	
	public WebDriver Driver;
	PropertyFileReadingUtility p1=new PropertyFileReadingUtility();
	LoginPage lp;
	InventoryPage Ip;
	CartPage cp;
	CheckOutPage cop;
	FinishPage fp;
	CheckoutOverviewPage coverp;
	TakeScreenshotUtility ts=new TakeScreenshotUtility();
	
	@BeforeTest
	public void setup()
	
	{
		
		Driver=new EdgeDriver();
		Driver.get(p1.getData("url"));
		lp =new LoginPage(Driver);
		Ip=new 	InventoryPage(Driver);
		cp= new CartPage(Driver);
		cop=new CheckOutPage(Driver);
		coverp=new CheckoutOverviewPage(Driver);
		fp=new FinishPage(Driver);
	}
	

	public void addwait()
	{
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@AfterTest
	public void aftertest()
	{
		Driver.quit();
	}
	
	

}
