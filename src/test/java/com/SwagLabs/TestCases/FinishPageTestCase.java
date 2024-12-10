package com.SwagLabs.TestCases;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FinishPageTestCase extends BaseClass{
	
	@BeforeTest
	public void pagesetup() throws InterruptedException
	{
		Ip=lp.doLogin(p1.getData("uname"), p1.getData("passwd"));
		addwait();
		Ip.AddProductInCart(p1.getData("pname"));
		addwait();
		cp=Ip.openCartPage();
		addwait();
		cop=cp.launchCheckout();
		addwait();
		cop.enterDetails();
		addwait();
		coverp=cop.checkoutcontinue();
		addwait();
		fp=coverp.clickonfinishbtn();
		addwait();
		
	}
	
  @Test
  public void VerifyFinishButtonStatus1() {
	  
	  String actual1_status=fp.getstatus1();
	  Assert.assertTrue(actual1_status.contains("THANK YOU FOR YOUR ORDER"), "Test case Failed");
	  String actual2_status=fp.getstatus2();
	  Assert.assertTrue(actual2_status.contains("Your order has been dispatched, and will arrive just as fast as the pony can get there!"), "Test case Failed");
	  
	  
	  
  }
  
  
  
 
  
}
