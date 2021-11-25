package co.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class InternetExplorerSetup {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.ie.driver","D:\\Drivers\\IEDriverserver.exe");
		
		   WebDriver driver= new InternetExplorerDriver();
		
		   driver.get("https://google.com");
			
			driver.manage().window().maximize();
			
			System.out.println(driver.getTitle());
			

	}

}
