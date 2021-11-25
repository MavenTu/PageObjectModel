package co.demo;

import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxSetup {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver","D:\\Drivers\\geckodriver.exe");
		
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://google.com");
		
		driver.manage().window().maximize();
		
		System.out.println(driver.getTitle());
		
		

	}
	
}
