package co.demo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class MultipleBrowserPracticeTest {
	
	WebDriver driver;

	@Parameters("browser")


	@BeforeClass
	public void setup(String browser) {
	if(browser.equalsIgnoreCase("firefox")) {
	System.setProperty("webdriver.gecko.driver", "D:\\Drivers\\geckodriver.exe");
	driver = new FirefoxDriver();


	}
	else if(browser.equalsIgnoreCase("chrome")) {
	System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();


	}
	String url = "http://demo.guru99.com/V4/index.php";
	driver.get(url);
	}

	@AfterClass

	public void teardown() {
	driver.close();
	driver.quit();
	}


	@Test
	public void Login() throws InterruptedException {

	WebElement username = driver.findElement(By.name("uid"));
	username.sendKeys("mngr337070");
	Thread.sleep(2000);

	WebElement password = driver.findElement(By.name("password"));
	password.sendKeys("tagUpEv");
	Thread.sleep(2000);

	WebElement loginButton = driver.findElement(By.name("btnLogin"));
	loginButton.click();
	Thread.sleep(2000);


	WebElement logoutButton = driver.findElement(By.linkText("Log out"));
	logoutButton.click();
	Thread.sleep(2000);

	Alert alert = driver.switchTo().alert();
	alert.accept();
	}
	
	

}
