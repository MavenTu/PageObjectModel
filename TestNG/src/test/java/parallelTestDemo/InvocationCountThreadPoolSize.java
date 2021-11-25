package parallelTestDemo;

import java.util.Date;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class InvocationCountThreadPoolSize {

	
	WebDriver driver;

	@Test(invocationCount = 5,threadPoolSize = 3)	
	public void test1() throws InterruptedException {
		
		Date d=new Date();
		System.out.println("i am inside the test1"+"---"+d);
		
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		String url = "https://google.com/";
		Thread.sleep(3000);
		System.out.println(driver.getTitle());
		driver.quit();
	}

}