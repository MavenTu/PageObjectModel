package co.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserCommandPractice {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		String url = "https://demoqa.com/";
		driver.manage().window().maximize();

		//clicking on elements
		//driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div[1]/div/div[3]/h5")).click();

		WebElement ele = driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div[1]/div/div[3]/h5"));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", ele);
		Thread.sleep(5000);


		//Come back to Home page (Use ‘Back’ command)
		driver.navigate().back();
		Thread.sleep(2000);

		//Again go back to Elements page(use forward command)
		driver.navigate().forward();
		Thread.sleep(2000);

		//Again come back to Home page (This time use ‘To’ command)
		driver.navigate().to(url);
		Thread.sleep(2000);

		//Refresh the Browser (Use ‘Refresh’ command)
		driver.navigate().refresh();
		Thread.sleep(2000);

		//close browser
		driver.close();


		}


	}