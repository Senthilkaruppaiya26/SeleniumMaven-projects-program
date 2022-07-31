package com.testng.automation;

import java.io.IOException;

import javax.swing.text.Utilities;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LearnDatadrivenTesting {
	
	@Test (dataProvider ="fetchdata")
	public void orangeHRMLogin(String url, String username ,String password) {
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");	
		 
		 ChromeDriver driver = new ChromeDriver(); 
		 
		// String baseURL="https://opensource-demo.orangehrmlive.com/";
		 
		 driver.get(url);
		 		 
		 driver.manage().window().maximize();
		 
		 String title = driver.getTitle();
		 System.out.println("The title of the page is :" +title);
		  
		  driver.findElementById("txtUsername").sendKeys(username);
		  driver.findElementById("txtPassword").sendKeys(password);
		  driver.findElementById("btnLogin").click();
		  
	}
	
@DataProvider (name ="fetchdata")
public Object [][] getdata() throws IOException  {
	return Utility.exceldataread();
	
	
	

	}

}
