package co.demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionMouseHover {

	public static void main(String[] args) throws Exception  {
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("http://amazon.in/");
		Thread.sleep(4000);
		WebElement ele = driver.findElement(By.xpath("//span[text()='Hello, Sign in']"));
		
		Actions action = new Actions (driver);
		action.moveToElement(ele).perform();
		
		driver.findElement(By.xpath("//span[text()='Create a Wish List']")).click();
		Thread.sleep(3000);
		driver.close();
		
		
		
		

	}

}
