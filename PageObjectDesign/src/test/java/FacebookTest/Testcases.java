package FacebookTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class Testcases {
	
	
	public static WebDriver driver= null;
	@BeforeSuite 
	public void test() throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.get("http://facebook.com");
		 driver.manage().window().maximize();
		 Thread.sleep(4000);
			
	}
	
	

	@AfterSuite
	public void TeardownTest() {
		
		Testcases.driver.quit();
	}
}
