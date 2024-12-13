package com.SwagLabs.Utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class TakeScreenshotUtility {
	
	
public static void Takescreenshot(WebDriver Driver,String projname,String name)
	
	{
		
		
		TakesScreenshot ts=(TakesScreenshot) Driver;
		
		File temp=ts.getScreenshotAs(OutputType.FILE);
		
		File dest=new File(System.getProperty("user.dir")+"//target//projname"+name+System.currentTimeMillis()+".png");
		
		try {
			FileHandler.copy(temp,dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
