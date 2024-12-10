package com.SwagLabs.TestCases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.SwagLab.Pages.CheckOutPage;


public class CartPageTestCase extends BaseClass {
	
	@BeforeClass
	public void pagesetup()
{
	
	Ip=lp.doLogin(p1.getData("uname"), p1.getData("passwd"));
	Ip.AddProductInCart(p1.getData("pname"));
	cp=Ip.openCartPage();
	
	
}
	
  @Test(priority=1)
  public void ValidateRemovebutton() {
	  cp.removeProduct();
  }
  
  
  @Test(priority=2)
  public void ValidateContinueShopping() {
	  cp.continueShopping();
	  Ip.AddProductInCart(p1.getData("pname2"));
	  Ip.openCartPage();
  }
  
  @Test(priority=3)
  public void ValidateCheckout() {
	  cp.launchCheckout();
	
  }
  
  
  
}
