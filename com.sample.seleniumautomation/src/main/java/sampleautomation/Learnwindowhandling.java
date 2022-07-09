package sampleautomation;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class Learnwindowhandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		String baseURL ="https://www.irctc.co.in/eticketing/erros.html";
		
		//String baseURL ="https://www.irtc.co.in/eticketing/userSignup.jsf";
		driver.get(baseURL);
		//getWindowHandle()-> return a single window
		String mainwin = driver.getWindowHandle();
		
		System.out.println(mainwin);
		driver.findElementByLinkText("Contact Us").click();
		
		//windowhandles-> returns list/group of windows
		Set<String> Allwindows = driver.getWindowHandles();
		System.out.println("No of active windows:"+Allwindows.size());
		
		List<String> Is = new ArrayList<String>(Allwindows);
		driver.switchTo().window(Is.get(0));
		System.out.println("Title of the page is:" +driver.getTitle());
		System.out.println("CurrentURL is:" +driver.getCurrentUrl());
		driver.switchTo().window(Is.get(1));
		System.out.println("Title of the page is:" +driver.getTitle());
		System.out.println("CurrentURL is:" +driver.getCurrentUrl());
		
		driver.switchTo().window(Is.get(0));
		
		//bringing the focus ask to main window
		//driver.switchTo().windows(Is.get(2));
		
		//driver.close();
		driver.quit();
	}
}
		
		
		
		
		
		
		

	

