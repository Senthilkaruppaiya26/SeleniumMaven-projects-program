package sampleautomation;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class LearnProperty {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		String baseURL="http://www.freecrm.com";
		driver.get(baseURL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		Properties obj = new Properties();
		FileInputStream fis = new FileInputStream("./Properties/application.properties");
		//loading the file contents
		obj.load(fis);
		String property_Login = obj.getProperty("Login");
		System.out.println(property_Login);
		String property_email = obj.getProperty("Email");
		String property_password = obj.getProperty("Password");
		String property_submit = obj.getProperty("Submit");
		
		Thread.sleep(1000);
		
		//driver.findElementByXPath("//span[text()='Log In']").click();
		driver.findElementByLinkText(property_Login).click();
		Thread.sleep(1000);
		driver.findElementByXPath(property_email).sendKeys("senthilkaruppaiya01@gmail.com");
		driver.findElementByXPath(property_password).sendKeys("Meyyar2610@");
		driver.findElementByXPath(property_submit).click();

	}

}




