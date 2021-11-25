package co.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class FirstTestNGPractice {


		WebDriver driver;
		//Enter the url

		String url = "https://demoqa.com/";


		@BeforeClass
		public void setUp(){


		//open chrome browser
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();

		//maximize the browser

		driver.manage().window().maximize();

		driver.get(url);

		}

		@AfterClass
		public void tearDown() {
		//close the browser
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
