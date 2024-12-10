package com.SwagLabs.TestCases;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ChekOutPageOverviewTestCases extends BaseClass {
	
@BeforeTest
public void pagesetup() throws InterruptedException
{
	Ip=lp.doLogin(p1.getData("uname"), p1.getData("passwd"));
	Ip.AddProductInCart(p1.getData("pname"));
	cp=Ip.openCartPage();
	cop=cp.launchCheckout();
	cop.enterDetails();
	coverp=cop.checkoutcontinue();
	Thread.sleep(3000);
	
	
}

  @Test(priority=1)
  public void validateProductnameoncheckout() {
	  String actprod=coverp.getpurname();
	  Assert.assertEquals(actprod, p1.getData("pname"));
	  System.out.println("Product Name on checkout matched, product selected is "+actprod);
  }
  
  @Test(priority=2)
  public void clickonFinishbtn() {
	  
	  coverp.clickonfinishbtn();
	  
  }
  
  
  
  
}
