package co.demo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MultipleLoging {


       
WebDriver driver;
//Enter the url

String url = "http://demo.guru99.com/V4/index.php";


@BeforeClass
public void setUp(){


//open chrome browser
System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
driver = new ChromeDriver();

//maximize the browser

driver.manage().window().maximize();

driver.get(url);
}


@DataProvider
public Object[][] LoginCredentials() {
Object[][] credentials = new Object[2][2];
credentials[0][0] = "mngr337070";
credentials[0][1] = "tagUpEv";
credentials[1][0] = "mngr337071";
credentials[1][1] = "gyrytyv";

return credentials;
}



@AfterClass
public void tearDown() {
//close the browser
driver.close();
driver.quit();
}

@Test(dataProvider = "LoginCredentials")
public void login(String EmailId, String Password) throws InterruptedException {
	
	WebElement username = driver.findElement(By.name("uid"));
	username.sendKeys(EmailId);
	Thread.sleep(2000);
	
	
	WebElement password = driver.findElement(By.name("password"));
	 password.sendKeys(Password);
	 Thread.sleep(2000);
	 
	 
	 WebElement loginButton = driver.findElement(By.name("btnLogin"));
		loginButton.click();
		Thread.sleep(2000);
		
	WebElement logout =driver.findElement(By.linkText("Log out"));
	logout.click();
	Thread.sleep(2000);
	
	Alert alert = driver.switchTo().alert();
	alert.accept();
}



}


