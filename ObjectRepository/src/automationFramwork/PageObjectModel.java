package automationFramwork;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import PageObjectModel.HomePage;
import PageObjectModel.LoginPage;
import PageObjectModel.LogoutPage;

public class PageObjectModel {
	
	WebDriver driver;
	
	@BeforeClass
	
	public void browser() {
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();		
		driver.get("http://demo.guru99.com/V4/index.php");
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		}
	
@AfterClass
	public void tearDown()	{
		
		driver.close();
		driver.quit();

	}

		@Test
		public void login() throws InterruptedException {
			
		
			LoginPage loginPages = new LoginPage(driver);
			loginPages.login();
			
			
			loginPages.textUsername.sendKeys("mngr337070");
			loginPages.textPassword.sendKeys("tagUpEv");
			Thread.sleep(2000);
			
			HomePage homePage = new HomePage(driver);
			homePage.signIn();
			
			homePage.buttonLogin.click();
			Thread.sleep(2000);
			
			LogoutPage logOutPage = new LogoutPage(driver);	
			logOutPage.logOut();
			
			logOutPage.buttonLogOut.click();
			Thread.sleep(2000);
			
			Alert alert = driver.switchTo().alert();
			alert.accept();
			
			
			
}
}
