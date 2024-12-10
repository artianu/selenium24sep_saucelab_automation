package com.SwagLabs.TestCases;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class InventoryPageTestCase extends BaseClass {
	
	
	@BeforeClass
		public void pagesetup()
	{
		
		Ip=lp.doLogin(p1.getData("uname"), p1.getData("passwd"));
		
	}
	
	
  @Test(priority=1)
  public void Verifyproductcounttestcase() {
	  
	  int cnt=Ip.getProductCount();
	  Assert.assertEquals(cnt, 6);
	  System.out.println("Products count matched");
  }
  
  
  @Test(priority=2)
  public void VerifyProductName()
    {
	  
	  Ip.getProductNames();
	  
	   
  }
  
  
  @Test(priority=3)
  public void validateAddToCartPage()
    {
	  
	  Ip.AddProductInCart(p1.getData("pname"));
	  
	   
  }
  
  @Test(priority=4)
  public void validateOpenCartPage()
    {
	  
	 Ip.openCartPage();
	  
	 
  }
  
  
  
}
