package sampleautomation;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnFrames {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		String baseURL ="https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt";
		String name="hello Test! How are you today?";
		driver.get(baseURL);
		driver.switchTo().frame("iframeResult");
		driver.findElementByXPath("//button[text()='Try it']").click();
		
		//Alert handling
		driver.switchTo().alert().sendKeys("Test");
		//adding the screenshot code
		
		driver.switchTo().alert().accept();
		String actualText = driver.findElementById("demo").getText();
		System.out.println(name);
		System.out.println(actualText);
		if(actualText.contains(name)) {
			System.out.println("Name is verified successfully");
		}
		else {
			System.out.println("Name not verified");
			
		}
		File scr = driver.getScreenshotAs(OutputType.FILE);
		File obj = new File("./snaps/img01.png");
		FileUtils.copyFile(scr, obj);
		//to return from the frame
		driver.switchTo().defaultContent();
	}

			
		
		



}
