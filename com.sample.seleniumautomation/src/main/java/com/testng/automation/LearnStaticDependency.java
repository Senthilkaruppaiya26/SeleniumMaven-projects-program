package com.testng.automation;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LearnStaticDependency {
	
@Parameters({"url","username","password"})	
@Test
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

}
