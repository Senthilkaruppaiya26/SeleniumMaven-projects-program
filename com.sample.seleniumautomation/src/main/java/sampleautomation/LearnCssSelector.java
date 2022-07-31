package sampleautomation;

import org.openqa.selenium.chrome.ChromeDriver;

public class LearnCssSelector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		String baseURL="https://opensource-demo.orangehrmlive.com/";
		
		driver.get(baseURL);
		
		
		driver.findElementByCssSelector("input#txtUsername").sendKeys("Admin");
	    driver.findElementByCssSelector("input#txtPassword").sendKeys("admin123");	
		driver.findElementById("btnLogin").click();
		
		driver.manage().window().maximize();
		
		
	}

}
