package sampleautomation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

public class Learnconfirmationalert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");	
		 
		 ChromeDriver driver = new ChromeDriver(); 
		 driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		 String baseURL="http://demo.automationtesting.in/Alerts.html";
		 driver.get(baseURL);
		 driver.manage().window().maximize();
		 
		 //confirmation Alert
		 
		 driver.findElementByLinkText("Alert with OK & Cancel").click();
		 driver.findElementByXPath("//button[@class='btn btn-primary']").click();
		 
		 Alert alert = driver.switchTo().alert();
		 Thread.sleep(600);
		 //alert.sendkeys("testUser");
		 alert.accept();
		 //System.out.println("Input entered. Alert has been accepted.");
		 //String text =driver.findelementByid("demo1").gettext();
		 //Systemout.ptintln(text);
		 

	}

		 
	}


