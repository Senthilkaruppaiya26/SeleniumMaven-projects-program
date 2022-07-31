package sampleautomation;

import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class LearnHeadlessTesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HtmlUnitDriver driver = new HtmlUnitDriver();
		String baseURL ="https://opensource-demo.orangehrmlive.com/";
		
		driver.get(baseURL);
		
		//Maximize the window
		
		driver.manage().window().maximize();
		
		//Title
		
		String title = driver.getTitle();
		System.out.println("Title of the page is:" +title);


	}

}
