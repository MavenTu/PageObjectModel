package co.demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PracticeMouseHover {

	public static void main(String[] args) throws Exception {
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("http://flipkart.com/");
		Thread.sleep(4000);
		WebElement ele = driver.findElement(By.className("_1_3w1N"));
		
		Actions action = new Actions (driver);
		action.moveToElement(ele).perform();
		
		driver.findElement(By.className("fonts-loaded")).click();
		Thread.sleep(4000);
		driver.close();
		

	}

}
