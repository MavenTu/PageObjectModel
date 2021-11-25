package Testcase1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoTestcase{
	
	WebDriver driver;
	 String url = "https://google.com/";
	@BeforeTest 
	public void setup(){
    System.setProperty("Webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
    
    WebDriverManager.chromedriver().setup();
	 driver = new ChromeDriver();

	driver.manage().window().maximize();
    
	driver.get(url);

	}
	@AfterTest
	public void closeBrowser(){
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
		String url = driver.getCurrentUrl();
		if(url.equals(url))
		{

		System.out.println("verification successfull");
		}else
		{
		System.out.println("verification failed");
		System.out.println("actual Url is :"+url);
		System.out.println("url is :"+url);
		
		//get page source and page source length
		String PageSource = driver.getPageSource();
		int  PageSourceLength =  PageSource.length();

		//print page length on eclipse console
		System.out.println("The length of the page is :"+PageSourceLength);



		}
      
       }
       
}
