package co.demo;

import org.openqa.selenium.opera.OperaDriver;

public class OperaBrowserSetup {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.opera.driver","D:\\Drivers\\operadriver_win64\\operadriver.exe");
         
		OperaDriver driver= new OperaDriver();
		
        driver.get("https://google.com");
		
		driver.manage().window().maximize();
		
		System.out.println(driver.getTitle());
		
	}
	
}
