package sampleautomation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

public class Learnpromptalert {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");	
		 
		// TODO Auto-generated method stub
	 ChromeDriver driver = new ChromeDriver(); 
	 driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	 String baseURL="http://demo.automationtesting.in/Alerts.html";
	 driver.get(baseURL);
	 driver.manage().window().maximize();
	 
	 //Prompt Alert
	 
	 driver.findElementByLinkText("Alert with Textbox").click();
	 driver.findElementByXPath("//button[@class= 'btn btn-info']").click();
	 
	 Alert alert = driver.switchTo().alert();
	 Thread.sleep(600);
	 alert.sendKeys("testUser");
	 alert.accept();
	 System.out.println("Input entered. Alert has been accepted.");
	 String text =driver.findElementById("demo1").getText();
	 System.out.println(text);
	 
}
	 
}
