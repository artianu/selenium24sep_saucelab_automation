package com.SwagLabs.Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;


public class PropertyFileReadingUtility {
	
	
	Properties p1;
	
	//Constructor of utility
	
	public PropertyFileReadingUtility() {
		
		  //properties class
		  p1= new Properties();
	
	
		  //file name
		  File f1= new File(System.getProperty("user.dir")+"//Config//config.properties");
	  
		  //file read in stream
		  FileInputStream fs;
	
		  try {
			  fs = new FileInputStream(f1);
		  
			  //load the file data
			  	p1.load(fs);
		
		  		} catch (FileNotFoundException e) {
		  			// 	TODO Auto-generated catch block
		  			e.printStackTrace();
		  		} catch (IOException e) {
		  			// TODO Auto-generated catch block
		  			e.printStackTrace();
		  		}
	    
	 
			}
	
	
	//Utility Method for fetching data
	
	public String getData(String inputkey)
	{
		
		return p1.getProperty(inputkey);
	}
	
	
	
}