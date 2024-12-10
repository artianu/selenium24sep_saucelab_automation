package com.SwagLabs.TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTestCases extends BaseClass {
  
	@Test(priority=1)
  public void validateURL() {
	  
	  String actURL=lp.getAppUrl();
	  Assert.assertTrue(actURL.contains("saucedemo"));
	  System.out.println("Test Case Passed..ActURL is : "+actURL);
  }
  
  @Test(priority=2)
  public void validateTitle() {
	  
	  String actTitle=lp.getAppTitle();
	  Assert.assertTrue(actTitle.contains("Swag Labs"));
	  System.out.println("Test Case Passed..ActTitle is : "+actTitle);
	  
	    }

  
  @Test(priority=3)
  public void validateLogin() {
	  
	  lp.doLogin(p1.getData("uname"),p1.getData("passwd"));
	  String actURL=lp.getAppUrl();
	  Assert.assertTrue(actURL.contains("inventory"));
	  System.out.println("Test Case Passed..Login Successful.. : "+actURL);
	  
	  
	    }

  
}
