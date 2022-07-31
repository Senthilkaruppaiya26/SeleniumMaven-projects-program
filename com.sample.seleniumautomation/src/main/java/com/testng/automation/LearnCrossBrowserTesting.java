package com.testng.automation;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LearnCrossBrowserTesting {
	
	public static WebDriver driver;
	
	
	@Parameters ("browser")
	@Test 
	public void orangeHRMLogin(String browser) {
		
		if (browser.equalsIgnoreCase("chrome")) {
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");	
		 
		 driver = new ChromeDriver(); 
		 
		}	
		
		if (browser.equalsIgnoreCase("firefox")) {
			
			System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");	
			 
			 driver = new FirefoxDriver(); 
			 
			}	 
		 
		 String baseURL="https://opensource-demo.orangehrmlive.com/";
		 
		 driver.get(baseURL);
		 		 
		 driver.manage().window().maximize();
		 
		 String title = driver.getTitle();
		 System.out.println("The title of the page is :" +title);
		  
		  driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		  driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		  driver.findElement(By.id("btnLogin")).click();
		  
	}
	
@DataProvider (name ="fetchdata")
public Object [][] getdata() throws IOException  {
	return Utility.exceldataread();
	
	
	

	}


}
