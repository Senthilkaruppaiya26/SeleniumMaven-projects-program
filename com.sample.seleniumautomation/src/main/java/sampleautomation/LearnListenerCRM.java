package sampleautomation;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

public class LearnListenerCRM {

	@Listeners(sampleautomation.Listerners.class)
	
	public class LoginCRM{

	@Test
	public void login() throws IOException, InterruptedException {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();

	String baseURL="http://www.freecrm.com";
	driver.get(baseURL);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	Properties obj = new Properties();
	FileInputStream fis = new FileInputStream("./Properties/application.properties");
	obj.load(fis);
	String property_Login = obj.getProperty("Login");
	String property_email = obj.getProperty("Email");
	String property_password = obj.getProperty("Password");
	String property_submit = obj.getProperty("Submit");



	//driver.findElementByXPath("//span[text()='Log In']").click();
	driver.findElementByLinkText(property_Login).click();
	Thread.sleep(1500);
	driver.findElementByXPath(property_email).sendKeys("senthilkaruppaiya01@gmail.com");
	driver.findElementByXPath(property_password).sendKeys("Meyyar2610@");
	driver.findElementByXPath(property_submit).click();

	String actualTitle = driver.getTitle();
	System.out.println(actualTitle);
	

	Assert.assertEquals(actualTitle,"Cogmento CRM");
	//Assert.assertTrue(false);

	/*
	* if (actualTitle.equalsIgnoreCase("CRM")) {
	* System.out.println("Test Case Passed"); }else {
	* System.out.println("Test Case Failed"); }
	*/
	}
	}
	

}
