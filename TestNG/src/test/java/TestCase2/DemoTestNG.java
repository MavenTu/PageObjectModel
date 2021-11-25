package TestCase2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoTestNG {
	
	WebDriver driver;
		
	String url = "https://google.com/";
	String currentUrl="https://demoqa.com";
		


	@BeforeTest
	public void setUp(){


	System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
	
	WebDriverManager.chromedriver().setup();
	
	driver = new ChromeDriver();

	driver.manage().window().maximize();

	driver.get(url);

	}

	@AfterTest
	public void tearDown() {
		
	driver.close();
	driver.quit();

	}

	@Test
	public void titleCheck() {
	//get title
	String title = driver.getTitle();
	int titleLength = title.length();
	//int titleLength = driver.getTitle().Length();

	//print page title and title length on the eclipse console

	System.out.println("The title of the page is:"+title);
	System.out.println("The length of the title is:"+titleLength);

	//get page url and verify if it is a correct page opened
	String actualUrl = driver.getCurrentUrl();
	if(actualUrl.equals(url))
	{

	System.out.println("verification successfull");
	}else
	{
	System.out.println("verification failed");
	System.out.println("actual Url is :"+actualUrl);
	System.out.println("url is :"+url);

	}


	//get page source and page source length
	String PageSource = driver.getPageSource();
	int  PageSourceLength =  PageSource.length();

	//print page length on eclipse console
	System.out.println("The length of the page is :"+PageSourceLength);




	



}


}
