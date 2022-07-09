package com.testng.automation;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LearnTestNGBasics {
	
@Test
public void launchURL() {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");	
		 
		 ChromeDriver driver = new ChromeDriver(); 
		 
		 String baseURL="http://demo.automationtesting.in/Register.html";
		 
		 driver.get(baseURL);
		 
		 
		 driver.manage().window().maximize();
		 
		 String title = driver.getTitle();
		  System.out.println("The title of the page is :" +title);
		  
		  //String pagesource = driver.getPageSource();
		  //System.out.println("the Page source of the page is:" +pagesource);
		  
		  String getcurrent = driver.getCurrentUrl();
		  System.out.println("the Current URL is:" +getcurrent);
		  
		 
		 //driver.close();

	}


}
