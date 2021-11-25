package co.demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeIframes {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://courses.letskodeit.com/practice");
		// switching from window to iframe
		WebElement iframe = driver.findElement(By.xpath("//iframe[@id='courses-iframe']"));
		driver.switchTo().frame(iframe);
		
		WebElement search = driver.findElement(By.xpath("//input[@id='search']"));
		search.sendKeys("Selenium");
		Thread.sleep(4000);
		
		WebElement Searchmm = driver.findElement(By.xpath("//button[@type='submit']"));
		Searchmm.click();
		Thread.sleep(4000);
		
		driver.switchTo().defaultContent();
		Thread.sleep(4000);
		

		WebElement pressclick = driver.findElement(By.xpath("//input[@id='hide-textbox']"));
		pressclick.click();
		Thread.sleep(3000);
		
		WebElement tapclick = driver.findElement(By.xpath("//input[@id='show-textbox']"));
        tapclick.click();
        Thread.sleep(3000);
        
        driver.close();
		
		

	}

}
