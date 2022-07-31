package sampleautomation;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Learnexplicitwait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		String baseURL ="https://opensource-demo.orangehrmlive.com/";
		
		driver.get(baseURL);
		
		//Maximize the window
		
		driver.manage().window().maximize();
		
		WebDriverWait wait = new WebDriverWait(driver,20);
		
		
		//Title
		
		String title = driver.getTitle();
		System.out.println("Title of the page is:" +title);
		driver.findElementById("txtUsername").sendKeys("Admin");
		driver.findElementById("txtPassword").sendKeys("admin123");
		driver.findElementById("btnLogin").click();
		
		WebElement webele = driver.findElementByLinkText("Admin");
		
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(webele));
		element.click();

	}
	}


