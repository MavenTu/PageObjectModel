package crossBrowserPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class Testcase1 {
	
	
	public static WebDriver driver;
	@BeforeSuite 
	public void initilized() throws InterruptedException  {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.get("https://saucelabs.com/");
		// driver.manage().window().maximize();
		 Thread.sleep(4000);
			
	}
	
	

	@AfterSuite
	public void TeardownTest() {
		
		Testcase1.driver.quit();
	}
}



