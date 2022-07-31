package sampleautomation;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LearnFreeCRM {

	@Test
	public void login() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		String baseURL="http://www.freecrm.com";
		driver.get(baseURL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		//downcasting the interface to accept the object
		
		JavascriptExecutor js = (JavascriptExecutor)driver; 
		WebElement Login = driver.findElementByLinkText("Login");
		//js.executeScript("document.getElementByXpath(//span[text()='Log In']).click();");
		js.executeScript("arguments[0].click();",Login);
		Thread.sleep(1200);
		WebElement email = driver.findElementByXPath("//input[@name='email']");
		js.executeScript("arguments[0].value='senthilkaruppaiya01@gmail.com';",email);
		
	 }	
}
