package com.SwagLabs.TestCases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class CheckOutPageTestCases extends BaseClass {
	
@BeforeTest	
 public void pagesetup()
 
 {
	Ip=lp.doLogin(p1.getData("uname"), p1.getData("passwd"));
	Ip.AddProductInCart(p1.getData("pname"));
	cp=Ip.openCartPage();
	cop=cp.launchCheckout();
	
	 
 }
	
	
  @Test(priority=1)
  public void AddCustDetails() throws InterruptedException {
	  
	  cop.enterDetails();
	  
	  System.out.println("Details Entered successfuly");
	  
	  Thread.sleep(3000);
		
  }
		
	
  @Test(priority=2)
  public void VerifyContinueCheckOut() {
	  
	  cop.checkoutcontinue();
	  
	
		
  }
		
  

		
  }
		
  
  
  
  
  
  

